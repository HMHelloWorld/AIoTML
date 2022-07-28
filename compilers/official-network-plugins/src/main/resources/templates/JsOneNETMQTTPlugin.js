const request = require("request");
const fs = require('fs');
const async = require('async');
const util = require('util')
const UUID = require('uuid');
const mqtt_lib = require('mqtt');
const Format = require('.//*$FORMAT$*/');
const events = require('./events')

function sortId(a,b){  
  return a.index-b.index
}

function /*$MQTTNAME$*/(name, options, subtopic, pubtopic, instance, deviceInfo, receiveObs) {
    this.name = name;
    this.ready = false;
    this.subtopic = subtopic;
    this.pubtopic = pubtopic;
    this.formatter = new Format();
    this.deviceInfo = deviceInfo;
    this.deviceList = [];
    this.receiveObs = receiveObs;
    /*$var_revice_obs$*/
    this.client = mqtt_lib.connect(options);
    var client = this.client;
    var formatter = this.formatter
    this.client.on('connect', () => {
        subtopic.forEach(topic => {
            client.subscribe(topic);
    
        });
    });
    //
     this.client.on('message', (topic, payload,packet) => {
         if (subtopic.includes(topic)) {
         const msg = formatter.parse(payload);
         	if(receiveObs.includes(topic)){   
         		/*$revice_obs$*/
         	}

          /*$DISPATCH$*/
          
         }
        }
     });
  }
  
  /*$RECEIVERS$*/
  
  

  
  
  /*$MQTTNAME$*/.prototype._stop = function() {
      this.client.end();
  };
  
//===============================
function /*$NAME$*/(name, options, subtopic, pubtopic, instance){
    // this.devices = [];
//    this.deviceType = ['agent', 'landmark'];
//    this.deviceNum = {'agent':3, 'landmark':3};

	this.deviceType = /*$DEVICETYPE$*/;
    this.deviceNum = /*$DEVICENUM$*/;
    this.devicesInfo = {};
    this.deviceList = [];
    this.receiveObs = ['singleAgentObsMsg', 'singleLandmarkObsMsg'];
    this.mqtt = new /*$MQTTNAME$*/(name, options, subtopic, pubtopic, instance, this.devicesInfo, this.receiveObs);

}

/*$NAME$*/.prototype.create_devices = function(deviceNum, seriesCallback){
  var reserve= this;
  var device_array = [];

  this.deviceType.forEach(e=>{
    for(var i = 0; i < deviceNum[e]; i++){
      var name = util.format(e+'_%d', i);
      device_array.push(name);
      reserve.devicesInfo[e] = [];
    }
  });

  async.map(device_array,
    function(data, callback) {
        var url='http://api.heclouds.com/register_de';
    var payload = {'sn': 'urn:uuid:'+UUID.v1().toString(), 'title': data};
    var options = {
        body:JSON.stringify(payload),
        headers: {
            "api-key": 'RFVyURjjwLBt5wkHLVvPWavTARw=',
        },
        qs:{
            'register_code': 'kwuV61MxUP5WLgtJ'
        }
    };
    
    request.post(url, options, function(err, response, body){
        // console.info(response.body);
        var res = JSON.parse(response.body);
        if(res.error == 1)
            console.log('register failed');
        else{
            console.log('register succeed');
            device = {'device_type':data.split('_')[0],'index':data.split('_')[1]>> 0,"device_name":data,"device_id":res['data']['device_id'],"key":res['data']['key']};
            // reserve.devices.push(device);
            callback(null, device);
        }

    });
        
    },
    function(err, results) {
        // reserve.devices = results;
        results.forEach(e=>{
            
            reserve.devicesInfo[e['device_type']].push(e);

        });
        seriesCallback(null,null,1);
    }
  );
}

/*$NAME$*/.prototype.getOneNETdevices = function(){
  var reserve = this;
  try{
    fs.accessSync('onenet_devices.conf', fs.constants.R_OK);
    var deviceInfo = JSON.parse(fs.readFileSync('onenet_devices.conf'));
    reserve.devicesInfo = deviceInfo;
    reserve.mqtt.deviceInfo = deviceInfo;

  }catch (err) {
    console.error('create device error');
    async.series(
      [
        function(callback){
          reserve.create_devices(reserve.deviceNum, callback);
        },  
        function(callback){
        // console.log(reserve.devicesInfo['agent']);
        reserve.mqtt.deviceInfo = reserve.devicesInfo;
          fs.writeFileSync('onenet_devices.conf',JSON.stringify(reserve.devicesInfo));
          callback(null,null,2);  
        }
      ]
    );
  }
  this.deviceType.forEach(e=>{
    for(var i = 0; i < reserve.deviceNum[e]; i++){
      reserve.deviceList.push(reserve.devicesInfo[e][i]['device_id']);
      reserve.mqtt.deviceList = reserve.deviceList;
    }
  });
}


module.exports = OneNET;