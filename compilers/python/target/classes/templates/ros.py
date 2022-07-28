#!/usr/bin/env python
# coding:utf-8

from __future__ import print_function
import roslib
import serial
import pynmea2
import random
import re,time,math
roslib.load_manifest('teleop_twist_keyboard')
import rospy
from geometry_msgs.msg import Twist
import sys, select, termios, tty
from rasp_imu_hat_6dof.srv import GetYawData,GetYawDataResponse
from ros_arduino_msgs.srv import GetInfraredDistance
from nav_msgs.msg import Odometry
import paho.mqtt.client as mqtt
import json
import numpy as np
from transitions import Machine
import queue

allIndex = 0
rosRunModeKey = -1
breakPointMode = 0
rosRunModeValue = {
	9 : "Online",
	0 : "Stop",
	11: "Manual: Straight",
	12: "Manual: Turn",
	2 : "Calibrate",
	3 : "Check",
	4 : "Run",
}
deviceId = ["661610255", "661610304", "661610364"]
startPoint = [[-0.2, -0.2], [0.2, -0.2], [-0.2, 0.2]]


class NumpyEncoder(json.JSONEncoder):
	""" Special json encoder for numpy types """
	def default(self, obj):
		if isinstance(obj, (np.int_, np.intc, np.intp, np.int8,
			np.int16, np.int32, np.int64, np.uint8,
			np.uint16, np.uint32, np.uint64)):
			return int(obj)
		elif isinstance(obj, (np.float_, np.float16, np.float32,
			np.float64)):
			return float(obj)
		elif isinstance(obj,(np.ndarray,)): #### This is the fix
			return obj.tolist()
		return json.JSONEncoder.default(self, obj)

class MQTT:
	def __init__(self, name, ip, portnum, devid , proid, pwd, subscribes, eventq):
		self.name = name
		self.ip = ip
		self.portnum = portnum
		self.devid = devid
		self.proid = proid
		self.pwd = pwd
		self.eventq = eventq
		self.runPara = None
		self.startPoint =None
		self.manualComm = None
		self.client = mqtt.Client(client_id=devid, protocol=mqtt.MQTTv311)
		self.client.on_connect = self.on_connect
		self.client.on_publish = self.on_publish
		self.client.on_message = self.on_message
		self.client.username_pw_set(username=proid, password=pwd)
		self.client.connect(ip, port=portnum, keepalive=12000)
		for ss in subscribes:
			self.client.subscribe(ss, qos=0)
		self.client.loop_start()

	def parse(self, meesageStr):
		msg = {}
		parsed = json.loads(meesageStr)
		for key in parsed:
			if key == "actionCmdMsg":
				msg["_msg"] = "actionCmdMsg"
				msg["agent_action"] = parsed["actionCmdMsg"]["agent_action"]
			elif key == "reset":
				msg["_msg"] = "reset"
				msg["y"] = parsed["reset"]["y"]
			elif key == "done":
				msg["_msg"] = "done"
				msg["y"] = parsed["done"]["y"]
		return msg

	def on_publish(self, client, userdata, mid):
		pass

	def on_connect(self, client, userdata, flags, rc):
		print("Connection result:" + mqtt.connack_string(rc))

	def on_message(self, client, userdata, msg):
		print("Receive data...")
		global rosRunModeKey
		global rosRunModeValue
		global breakPointMode
		if msg.topic == "runMode":
			rosRunModeKey = int(msg.payload.decode())
			print("Current mode : {0}".format(rosRunModeValue[rosRunModeKey]))
		elif msg.topic == "runPara":
			rec = msg.payload.decode()
			self.runPara = rec.strip('[').strip(']').split(',')
			# print(self.runPara)
		elif msg.topic == "manual":
			rec = msg.payload.decode()
			if rosRunModeKey == 12:
				rec = rec.lower()
			self.manualComm = rec
		elif msg.topic == "startPoint":
			rec = msg.payload.decode()
			self.startPoint = rec.strip('[').strip(']').split(',')
		elif msg.topic == "breakPointMode":
			rec = msg.payload.decode()
			breakPointMode = int(rec)
		else:
			msg = self.parse(msg.payload.decode())
			msg["_port"] = "realMsg_port"
			if msg["_msg"] == "actionCmdMsg":
				self.eventq.put(msg)

	def singleAgentObsMsgToFormat(self, AgentObs):
		AgentObs_list = []
		for e in AgentObs:
			AgentObs_list.append(e.__dict__)
		shs = json.dumps({"singleAgentObsMsg": {"AgentObs": AgentObs_list}}, cls=NumpyEncoder)
		return shs

	def sendsingleAgentObsMsgOnrealMsg_port(self, AgentObs):
		self.client.publish("singleAgentObsMsg", self.singleAgentObsMsgToFormat(AgentObs), qos=0)

class RosDevice:
	def __init__(self):
		self.rosIndex = allIndex
		self.isYawCorrect = 1 
		self.isInfrared = 0 
		self.isSpeed = 1 
		self.speedValue = 0.1 
		self.sideLength = 3
		self.latlonRate = 5
		self.errorRate = 10
		self.isStartRandom = 0
		self.isDirection = 0
		self.isTimeDist = 1
		self.isOutIn = 0
		self.manualComm = None
		self.shiftX = None
		self.shiftY = None
		self.rotateDegree = None
		self.scaleX = None
		self.scaleY = None

		self.pos_x = 0
		self.pos_y = 0

		self.correctDirLat = None
		self.correctDirLon = None
		self.correctDegreeLatLon = None

		self.startYaw = 0
		self.x = 0
		self.y = 0
		self.z = 0
		self.th = 0
		self.status = 0
		self.angle = 10
		self.command = 2

		self.settings = termios.tcgetattr(sys.stdin)
		self.pub = rospy.Publisher('cmd_vel', Twist, queue_size=5)
		rospy.init_node('teleop_twist_keyboard')
		self.speed = rospy.get_param("~speed", 0.1)
		self.turn = rospy.get_param("~turn", 0.5)

		self.moveBindings = {
			'i': (1, 0, 0, 0),
			'o': (1, 0, 0, -1),
			'j': (0, 0, 0, 1),
			'l': (0, 0, 0, -1),
			'u': (1, 0, 0, 1),
			',': (-1, 0, 0, 0),
			'.': (-1, 0, 0, 1),
			'm': (-1, 0, 0, -1),
			'O': (1, -1, 0, 0),
			'I': (1, 0, 0, 0),
			'J': (0, 1, 0, 0),
			'L': (0, -1, 0, 0),
			'U': (1, 1, 0, 0),
			'<': (-1, 0, 0, 0),
			'>': (-1, -1, 0, 0),
			'M': (-1, 1, 0, 0),
			't': (0, 0, 1, 0),
			'b': (0, 0, -1, 0),
		}
		self.speedBindings = {
			'q': (1.1, 1.1),
			'z': (.9, .9),
			'w': (1.1, 1),
			'x': (.9, 1),
			'e': (1, 1.1),
			'c': (1, .9),
		}
	def getKey(self):
		tty.setraw(sys.stdin.fileno())
		select.select([sys.stdin], [], [], 0)
		key = sys.stdin.read(1)
		termios.tcsetattr(sys.stdin, termios.TCSADRAIN, settings)
		return key

	def vels(speed, turn):
		return "currently:\tspeed %s\tturn %s " % (speed, turn)

	def angles(angle):
		return "currently:\tangle %s " % (angle)

	def get_yaw(self):
		rospy.wait_for_service('imu_node/GetYawData')
		try:

			yaw_srv = rospy.ServiceProxy('imu_node/GetYawData', GetYawData)
			yaw_data = str(yaw_srv())
			yaw_data = re.match(r'yaw: (.*)', yaw_data).group(1).strip("'")
			return float(yaw_data)

		except rospy.ServiceException as e:
			print("Service call failed: %s" % e)

	def yawCorrect(self,target):
		diff = 1
		while(abs(diff) > 0.01):
			diff = target - self.get_yaw()
			if(diff > 0):
				angular = self.turn
			else:
				angular = -self.turn
			self.SetVelAng(0, 0, 0, angular)
			self.MainRos()

		self.SetVelAng(0, 0, 0, 0)
		self.MainRos()

	def InfraredDistance(self):
		rospy.wait_for_service('/mobilebase_arduino/getInfraredDistance')
		try:

			infrared_srv = rospy.ServiceProxy('/mobilebase_arduino/getInfraredDistance', GetInfraredDistance)
			a = infrared_srv()
			return a.front_dist, a.left_dist, a.right_dist

		except rospy.ServiceException as e:
			print("Service call failed: %s" % e)

	def InfraredStop(self, warnDistance):
		f, l, r = self.InfraredDistance()
		if f > warnDistance:
			return True
		else:
			return False

	def getRosPos(self):
		data = rospy.wait_for_message("odom", Odometry, timeout=None)
		patt = "position[\s\S]*?x: (.*?)\n[\s\S]*?y: (.*?)\n"
		matchObj = re.search(patt, str(data), re.M | re.I)
		if matchObj:
			x = float(matchObj.group(1))
			y = float(matchObj.group(2))
			return x, y
		else:
			return None

	def lat_lon_fromUSB(self,time_max):
		lat = []
		lon = []
		ser = serial.Serial('/dev/ttyACM1', 57600)
		byte = ser.read()
		i = 0
		while ser.inWaiting() != 0:
			data = '$'
			b = False
			if byte == '$':
				byte = ser.read(5)
				if byte == 'GNRMC':
					b = True
				while byte != '$':
					data = data + byte
					byte = ser.read()
			# print data
			if b:
				i += 1
				msg = pynmea2.parse(data)
				lat.append(msg.latitude)
				lon.append(msg.longitude)
				if i >= time_max:
					break
					ser.close()
		return np.mean(lat), np.mean(lon)

	def SetVelAng(self,x,y,z,th):
		self.x = x
		self.y = y
		self.z = z
		self.th = th

	def runMode0(self):
		self.SetVelAng(0,0,0,0)


	def runMode11_12(self, key):
		if key in self.moveBindings.keys():
			self.x = self.moveBindings[key][0]
			self.y = self.moveBindings[key][1]
			self.z = self.moveBindings[key][2]
			self.th = self.moveBindings[key][3]
		elif key in self.speedBindings.keys():
			self.speed = self.speed * self.speedBindings[key][0]
			self.turn = self.turn * self.speedBindings[key][1]
		else:
			self.SetVelAng(0,0,0,0)

	def payload_latlon(self):
		latMean , lonMean = self.lat_lon_fromUSB(self.latlonRate)
		payload = [latMean, lonMean, self.rosIndex]
		return payload

	def payload_xy(self, x, y):
		payload = [x, y, self.rosIndex]
		return payload

	def payload_yawspeed(self):
		payload = [self.get_yaw(), self.speed, self.rosIndex]
		return payload

	def runMode2(self):
		pass


	def runMode3(self):
		pass


	def runMode4(self):
		pass

	def latlon2xy(self):
		lat, lon = self.lat_lon_fromUSB(self.latlonRate)

		x = lat - self.shiftX
		y = lon - self.shiftY

		x, y = self.pointRotate(x, y, self.rotateDegree)

		x /= self.scaleX
		y /= self.scaleY
		return x, y

	def xy2latlon(self, x, y):

		lat = x * self.scaleX
		lon = y * self.scaleY
		lat, lon = self.pointRotate(lat, lon, -self.rotateDegree)
		lat += self.shiftX
		lon += self.shiftY
		return lat, lon

	def getDegree2(self, x, y):
		if x == 0:
			if y == 0:
				print("Unable to calculate angle for point (0,0)")
				return None
			elif y > 0:
				return math.pi / 2
			else:
				return math.pi / 2 * 3
		elif x > 0:
			return math.atan(y / x)
		else:
			return math.atan(y / x) + math.pi

	def pointRotate(self, x, y, degree):
		xx = x * math.cos(degree) - y * math.sin(degree)
		yy = x * math.sin(degree) + y * math.cos(degree)
		return xx, yy

	def MainRos(self):
		twist = Twist()
		twist.linear.x = self.x * self.speed
		twist.linear.y = self.y * self.speed
		twist.linear.z = self.z * self.speed
		twist.angular.x = 0
		twist.angular.y = 0
		twist.angular.z = self.th * self.turn
		self.pub.publish(twist)

#$SUBTHINGS$#


def CreateStateMachine():
	#$STATECREATE$#
	return matter, machine


class AgentDevice(object):
	def __init__(self):
		self.events = queue.Queue()
		self.send_events = queue.Queue()
		self.rosDevice = RosDevice()
#$PROPERTYS$#
		self.subscribes = ['done','reset', 'runMode', 'runPara', 'manual', 'startPoint','breakPoint']
		self.MQTT = MQTT('MQTT', '183.230.40.39', 6002, deviceId[allIndex], "394823", "Fl=NCZdBophMSaaNCUqjlKAtsag=", self.subscribes, self.events)
		self.device_obsAgent_var.index = allIndex
		self.agents_var.pos[0] = startPoint[allIndex][0]
		self.agents_var.pos[1] = startPoint[allIndex][1]

	#$FUNCTIONS$#
	

		self.agents[0].posLatLon[0], self.agents[0].posLatLon[1] = self.rosDevice.xy2latlon(
			self.agents[0].pos[0], self.agents[0].pos[1])

		if matter.rosDevice.isOutIn == 0:
			self.MQTT.client.publish("point", payload=str(matter.rosDevice.payload_latlon()), qos=0)
		else:
			self.MQTT.client.publish("point", payload=str(matter.rosDevice.payload_xy(
				self.agents[0].pos[0] - self.agents[0].vel[0] * self.dt,
				self.agents[0].pos[1] - self.agents[0].vel[1] * self.dt)), qos=0)
		self.MQTT.client.publish("yawspeed", payload=str(matter.rosDevice.payload_yawspeed()), qos=0)

		dir_x = self.agents[0].vel[0] * self.dt
		dir_y = self.agents[0].vel[1] * self.dt

		max_dis = math.sqrt(dir_x ** 2 + dir_y ** 2)
		print("xyDirection: {0}-{1}; xyDistance: {2}".format(round(dir_x, 3), round(dir_y, 3), round(max_dis, 3)))

		if self.rosDevice.speedValue > 0.2:
			self.rosDevice.speedValue = 0.2

		dir_x = dir_x * 10 * self.rosDevice.speedValue / max_dis
		dir_y = dir_y * 10 * self.rosDevice.speedValue / max_dis

		self.MQTT.client.publish("direction", payload=str(matter.rosDevice.payload_xy(dir_x, dir_y)), qos=0)

		x_ros_last, y_ros_last = self.rosDevice.getRosPos()

		self.rosDevice.SetVelAng(dir_x, dir_y, 0, 0)

		while True:
			self.rosDevice.MainRos()

			if rosRunModeKey != 4:
				self.rosDevice.SetVelAng(0, 0, 0, 0)
				self.rosDevice.MainRos()
				break

			x_ros_now, y_ros_now = self.rosDevice.getRosPos()

			dist_ros = math.sqrt(((x_ros_now - x_ros_last) ** 2 + (y_ros_now - y_ros_last) ** 2))

			targetDis = max_dis * self.rosDevice.sideLength / 2
			if dist_ros >= targetDis:
				print("RealDis:{0} --> {1}:TargetDis".format(round(dist_ros, 3), round(targetDis, 3)))
				print("------ Finish this step, wait for next step >>>>>>")
				self.rosDevice.SetVelAng(0, 0, 0, 0)
				self.rosDevice.MainRos()
				break

		if self.rosDevice.isYawCorrect == 1:
			print(">>>>>> Start angle correction......")
			self.rosDevice.yawCorrect(self.rosDevice.startYaw)


		if breakPointMode == 1:
			print("Device pauses!Wait for running......")
			while (1):
				if breakPointMode == 0:
					break


	#$TRANSFUNCTION$#
	

	#$MAINLOOP$#


if __name__ == '__main__':
	matter, machine = CreateStateMachine()
	while(True):

		if rosRunModeKey == 9:
			print("-Current mode : {0}".format(rosRunModeValue[rosRunModeKey]))
			matter.MQTT.client.publish("online", payload=str(matter.rosDevice.rosIndex), qos=0)
			while(True):
				if rosRunModeKey != 9:
					break

		elif rosRunModeKey == 0:
			print("-Current mode : {0}".format(rosRunModeValue[rosRunModeKey]))
			matter.MQTT.client.publish("point", payload=str(matter.rosDevice.payload_latlon()), qos=0)
			matter.MQTT.client.publish("yawspeed", payload=str(matter.rosDevice.payload_yawspeed()), qos=0)
			matter.rosDevice.runMode0()
			while(True):
				if rosRunModeKey != 0:
					break
				matter.rosDevice.MainRos()

		elif rosRunModeKey == 11 or rosRunModeKey == 12:
			print("-Current mode : {0}".format(rosRunModeValue[rosRunModeKey]))
			while(True):
				if rosRunModeKey != 11 and rosRunModeKey != 12:
					break
				while (matter.MQTT.runPara == None):
					if rosRunModeKey != 11 and rosRunModeKey != 12:
						break

				if matter.MQTT.runPara != None:
					matter.rosDevice.shiftX = float(matter.MQTT.runPara[0])
					matter.rosDevice.shiftY = float(matter.MQTT.runPara[1])
					matter.rosDevice.rotateDegree = float(matter.MQTT.runPara[2])
					matter.rosDevice.scaleX = float(matter.MQTT.runPara[3])
					matter.rosDevice.scaleY = float(matter.MQTT.runPara[4])
					matter.rosDevice.isSpeed = float(matter.MQTT.runPara[5])
					matter.rosDevice.speedValue = float(matter.MQTT.runPara[6])
					if float(matter.MQTT.runPara[7]) != 0:
						matter.rosDevice.sideLength = float(matter.MQTT.runPara[7])
					matter.rosDevice.latlonRate = float(matter.MQTT.runPara[8])
					matter.rosDevice.correctDirLat = float(matter.MQTT.runPara[9])
					matter.rosDevice.correctDirLon = float(matter.MQTT.runPara[10])
					matter.rosDevice.isStartRandom = float(matter.MQTT.runPara[11])
					matter.rosDevice.isOutIn = float(matter.MQTT.runPara[12])
					matter.rosDevice.errorRate = float(matter.MQTT.runPara[13])

					matter.rosDevice.correctDegreeLatLon = matter.rosDevice.getDegree2(matter.rosDevice.correctDirLat,
																					   matter.rosDevice.correctDirLon)
					matter.rosDevice.startYaw = matter.rosDevice.get_yaw()
				time.sleep(1)
				matter.rosDevice.manualComm = matter.MQTT.manualComm
				if matter.rosDevice.manualComm != None:
					matter.rosDevice.runMode11_12(matter.rosDevice.manualComm)
					matter.rosDevice.MainRos()
					matter.MQTT.manualComm = None
					matter.MQTT.client.publish("point", payload=str(matter.rosDevice.payload_latlon()), qos=0)
					matter.MQTT.client.publish("yawspeed", payload=str(matter.rosDevice.payload_yawspeed()), qos=0)

		elif rosRunModeKey == 2:
			print("-Current mode : {0}".format(rosRunModeValue[rosRunModeKey]))
			while (True):
				if rosRunModeKey != 2:
					break
				time.sleep(1)
				matter.MQTT.client.publish("point", payload=str(matter.rosDevice.payload_latlon()), qos=0)
				matter.MQTT.client.publish("yawspeed", payload=str(matter.rosDevice.payload_yawspeed()), qos=0)

		elif rosRunModeKey == 3:
			print("-Current mode : {0}".format(rosRunModeValue[rosRunModeKey]))
			while (True):
				if rosRunModeKey != 3:
					break
				time.sleep(1)
				matter.MQTT.client.publish("point", payload=str(matter.rosDevice.payload_latlon()), qos=0)
				matter.MQTT.client.publish("yawspeed", payload=str(matter.rosDevice.payload_yawspeed()), qos=0)

		elif rosRunModeKey == 4:
			print("-Current mode : {0}".format(rosRunModeValue[rosRunModeKey]))
			matter.rosDevice.pos_x, matter.rosDevice.pos_y = matter.rosDevice.getRosPos()
			while(matter.MQTT.runPara == None):
				if rosRunModeKey != 4:
					break

			if matter.MQTT.runPara != None:
				matter.rosDevice.shiftX = float(matter.MQTT.runPara[0])
				matter.rosDevice.shiftY = float(matter.MQTT.runPara[1])
				matter.rosDevice.rotateDegree = float(matter.MQTT.runPara[2])
				matter.rosDevice.scaleX = float(matter.MQTT.runPara[3])
				matter.rosDevice.scaleY = float(matter.MQTT.runPara[4])
				matter.rosDevice.isSpeed = float(matter.MQTT.runPara[5])
				matter.rosDevice.speedValue = float(matter.MQTT.runPara[6])
				if float(matter.MQTT.runPara[7]) != 0:
					matter.rosDevice.sideLength = float(matter.MQTT.runPara[7])
				matter.rosDevice.latlonRate = float(matter.MQTT.runPara[8])
				matter.rosDevice.correctDirLat = float(matter.MQTT.runPara[9])
				matter.rosDevice.correctDirLon = float(matter.MQTT.runPara[10])
				matter.rosDevice.isStartRandom = float(matter.MQTT.runPara[11])
				matter.rosDevice.isOutIn = float(matter.MQTT.runPara[12])
				matter.rosDevice.errorRate = float(matter.MQTT.runPara[13])

				matter.rosDevice.correctDegreeLatLon = matter.rosDevice.getDegree2(matter.rosDevice.correctDirLat,
																				   matter.rosDevice.correctDirLon)
				matter.rosDevice.startYaw = matter.rosDevice.get_yaw()
			time.sleep(1)

			if matter.rosDevice.isStartRandom == 1:
				matter.agents[0].pos[0] = float(matter.MQTT.startPoint[2 * matter.rosDevice.rosIndex])
				matter.agents[0].pos[1] = float(matter.MQTT.startPoint[2 * matter.rosDevice.rosIndex + 1])

			if matter.rosDevice.isStartRandom == 2:
				matter.agents[0].pos[0], matter.agents[0].pos[1] = matter.rosDevice.latlon2xy()
				matter.MQTT.client.publish("point", payload=str(matter.rosDevice.payload_latlon()), qos=0)
				matter.MQTT.client.publish("yawspeed", payload=str(matter.rosDevice.payload_yawspeed()), qos=0)
			while(True):
				if rosRunModeKey != 4:
					break
				matter.MQTT.client.publish("point", payload=str(matter.rosDevice.payload_latlon()), qos=0)
				matter.MQTT.client.publish("yawspeed", payload=str(matter.rosDevice.payload_yawspeed()), qos=0)
				time.sleep(0.5)
				matter.Mainloop()
		else:

			matter.rosDevice.runMode0()
			while (True):
				if rosRunModeKey == 9 or rosRunModeKey == 0 or rosRunModeKey == 11 or rosRunModeKey == 12\
						or rosRunModeKey == 2 or rosRunModeKey == 3 or rosRunModeKey == 4:
					break
				matter.rosDevice.MainRos()


