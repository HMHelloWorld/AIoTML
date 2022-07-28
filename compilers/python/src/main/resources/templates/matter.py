import argparse
from transitions import Machine
import sys
sys.path.append("..")
from WS import WS
import queue
import numpy as np
import tensorflow as tf
import time
import pickle
import maddpg.common.tf_util as U
from maddpg.trainer.maddpg import MADDPGAgentTrainer
import tensorflow.contrib.layers as layers
from gym import spaces
from multiagent.multi_discrete import MultiDiscrete

def parse_args():
    parser = argparse.ArgumentParser("Reinforcement Learning experiments for multiagent environments")
    # Environment
    parser.add_argument("--scenario", type=str, default="simple", help="name of the scenario script")
    parser.add_argument("--max-episode-len", type=int, default=50, help="maximum episode length")
    parser.add_argument("--num-episodes", type=int, default=10000, help="number of episodes")
    parser.add_argument("--num-adversaries", type=int, default=0, help="number of adversaries")
    parser.add_argument("--good-policy", type=str, default="maddpg", help="policy for good agents")
    parser.add_argument("--adv-policy", type=str, default="maddpg", help="policy of adversaries")
    # Core training parameters
    parser.add_argument("--lr", type=float, default=1e-2, help="learning rate for Adam optimizer")
    parser.add_argument("--gamma", type=float, default=0.95, help="discount factor")
    parser.add_argument("--batch-size", type=int, default=1024, help="number of episodes to optimize at the same time")
    parser.add_argument("--num-units", type=int, default=64, help="number of units in the mlp")
    # Checkpointing
    parser.add_argument("--exp-name", type=str, default=None, help="name of the experiment")
    parser.add_argument("--save-dir", type=str, default="./saved/", help="directory in which training state and model should be saved")
    parser.add_argument("--save-rate", type=int, default=1000, help="save model once every time this many episodes are completed")
    parser.add_argument("--load-dir", type=str, default="", help="directory in which training state and model are loaded")
    # Evaluation
    parser.add_argument("--restore", action="store_true", default=False)
    parser.add_argument("--display", action="store_true", default=False)
    parser.add_argument("--benchmark", action="store_true", default=False)
    parser.add_argument("--benchmark-iters", type=int, default=100000, help="number of iterations run for benchmarking")
    parser.add_argument("--benchmark-dir", type=str, default="./benchmark_files/", help="directory where benchmark data is saved")
    parser.add_argument("--plots-dir", type=str, default="./learning_curves/", help="directory where plot data is saved")
    return parser.parse_args()

#$SUBTHINGS$#

def CreateStateMachine():
#$STATECREATE$#
	return matter, machine
    
class #$THINENAME$#(object):
	def __init__(self):
		self.events = queue.Queue()
		self.send_events = queue.Queue()
#$PROPERTYS$#
		self.episode_step = 0
		self.episode_rewards = None
		self.agent_rewards = None
		self.final_ep_rewards = None
		self.final_ep_ag_rewards = []
		self.agent_info = [[[]]]
		self.saver = None
		self.arglist = parse_args()
		self.train_step = 0
		self.t_start = time.time()
		self.trainers = None
		self.ori_obs = None
		# rendering
		self.shared_viewer = True
		self.viewers = [None]
		self.render_geoms = None
		self.render_geoms_xform = None

		# control flag
    
    #$FUNCTIONS$#
	def MaddpgInit(self):
		observation_space, action_space = Space()
		obs_shape_n = [observation_space[i].shape for i in range(3)]
		self.num_adversaries = min(3, self.arglist.num_adversaries)
		self.trainers = get_trainers(3, action_space, self.num_adversaries, obs_shape_n, self.arglist)
		print('Using good policy {} and adv policy {}'.format(self.arglist.good_policy, self.arglist.adv_policy))

		# Initialize
		U.initialize()
		if self.arglist.load_dir == "":
			self.arglist.load_dir = self.arglist.save_dir
		if self.arglist.display or self.arglist.restore or self.arglist.benchmark:
			print('Loading previous state...')
			U.load_state(self.arglist.load_dir)
		self.episode_rewards = [0.0]  # sum of rewards for all agents
		self.agent_rewards = [[0.0] for _ in range(3)]  # individual agent reward
		self.final_ep_rewards = []  # sum of rewards for training curve
		self.final_ep_ag_rewards = []  # agent rewards for training curve
		self.agent_info = [[[]]]  # placeholder for benchmarking info
		self.saver = tf.train.Saver()

#$TRANSFUNCTION$#

#$MAINLOOP$#

	def display(self, agents_pos, landmark_pos):
		self.episode_step += 1
		done = all(self.done_n_var)
		terminal = (self.episode_step >= self.arglist.max_episode_len)
		# collect experience
		for i, agent in enumerate(self.trainers):
			agent.experience(self.obs_n_var[i], self.action_n_var[i], self.rew_n_var[i], self.new_obs_n_var[i], self.done_n_var[i],
                             terminal)

		self.obs_n_var = self.new_obs_n_var

		for i, rew in enumerate(self.rew_n_var):
			self.episode_rewards[-1] += rew
			self.agent_rewards[i][-1] += rew

		if done or terminal:

			self.episode_step = 0
			self.episode_rewards.append(0)
			for a in self.agent_rewards:
				a.append(0)
			self.agent_info.append([[]])
			self.restart_var = True

		if self.arglist.display:
			time.sleep(0.1)
			# env.render()
			self.render_from_another('human', agents_pos, landmark_pos)
		else:
			# update all trainers, if not in display or benchmark mode
			loss = None
			for agent in self.trainers:
				agent.preupdate()
			for agent in self.trainers:
				loss = agent.update(self.trainers, self.train_step)

			# save model, display training output
			if terminal and (len(self.episode_rewards) % self.arglist.save_rate == 0):
				U.save_state(self.arglist.save_dir, saver=self.saver)
				# print statement depends on whether or not there are adversaries
				if self.num_adversaries == 0:
					print("steps: {}, episodes: {}, mean episode reward: {}, time: {}".format(
						self.train_step, len(self.episode_rewards),
						np.mean(self.episode_rewards[-self.arglist.save_rate:]),
						round(time.time() - self.t_start, 3)))
				else:
					print("steps: {}, episodes: {}, mean episode reward: {}, agent episode reward: {}, time: {}".format(
						self.train_step, len(self.episode_rewards),
						np.mean(self.episode_rewards[-self.arglist.save_rate:]),
						[np.mean(rew[-self.arglist.save_rate:]) for rew in self.agent_rewards],
						round(time.time() - self.t_start, 3)))
				self.t_start = time.time()
				# Keep track of final episode reward
				self.final_ep_rewards.append(np.mean(self.episode_rewards[-self.arglist.save_rate:]))
				for rew in self.agent_rewards:
					self.final_ep_ag_rewards.append(np.mean(rew[-self.arglist.save_rate:]))

			# saves final episode reward for plotting training curve later
			if len(self.episode_rewards) > self.arglist.num_episodes:
				rew_file_name = self.arglist.plots_dir + self.arglist.exp_name + '_rewards.pkl'
				with open(rew_file_name, 'wb') as fp:
					pickle.dump(self.final_ep_rewards, fp)
				agrew_file_name = self.arglist.plots_dir + self.arglist.exp_name + '_agrewards.pkl'
				with open(agrew_file_name, 'wb') as fp:
					pickle.dump(self.final_ep_ag_rewards, fp)
				print('...Finished total of {} episodes.'.format(len(self.episode_rewards)))
				self.finish = True

	def render_from_another(self, mode='human', agents_pos=[], landmark_pos=[]):
		for i in range(len(self.viewers)):
			# create viewers (if necessary)
			if self.viewers[i] is None:
				# import rendering only if we need it (and don't import for headless machines)
				#from gym.envs.classic_control import rendering
				from multiagent import rendering
				self.viewers[i] = rendering.Viewer(700,700)

		# create rendering geometry
		if self.render_geoms is None:
			# import rendering only if we need it (and don't import for headless machines)
			# from gym.envs.classic_control import rendering
			from multiagent import rendering
			self.render_geoms = []
			self.render_geoms_xform = []

			for i in range(3):
				geom = rendering.make_circle(0.05)
				xform = rendering.Transform()
				geom.set_color(*[0.35, 0.35, 0.85], alpha=0.5)
				geom.add_attr(xform)
				self.render_geoms.append(geom)
				self.render_geoms_xform.append(xform)
			for i in range(3):
				geom = rendering.make_circle(0.1)
				xform = rendering.Transform()
				geom.set_color(*[0.25, 0.25, 0.25], alpha=0.5)
				geom.add_attr(xform)
				self.render_geoms.append(geom)
				self.render_geoms_xform.append(xform)

			# add geoms to viewer
			for viewer in self.viewers:
				viewer.geoms = []
				for geom in self.render_geoms:
					viewer.add_geom(geom)

		results = []
		for i in range(len(self.viewers)):
			from multiagent import rendering
			# update bounds to center around agent
			cam_range = 1
			if self.shared_viewer:
				pos = np.zeros(2)
			else:
				pos = self.agents[i].state.p_pos
			self.viewers[i].set_bounds(pos[0] - cam_range, pos[0] + cam_range, pos[1] - cam_range, pos[1] + cam_range)
			# update geometry positions
			for e in range(3):
				self.render_geoms_xform[e].set_translation(*agents_pos[e])
			for e in range(3):
				self.render_geoms_xform[e+3].set_translation(*landmark_pos[e])
			# render to display or array
			results.append(self.viewers[i].render(return_rgb_array = mode == 'rgb_array'))
		return results


#$MLPMODEL$#

def get_trainers(n, action_space, num_adversaries, obs_shape_n, arglist):
	trainers = []
	model = mlpmModel
	trainer = MADDPGAgentTrainer
	for i in range(num_adversaries):
		trainers.append(trainer(
 			"agent_%d" % i, model, obs_shape_n, action_space, i, arglist,
			local_q_func=(arglist.adv_policy=='ddpg')))
	for i in range(num_adversaries, n):
		trainers.append(trainer(
			"agent_%d" % i, model, obs_shape_n, action_space, i, arglist,
			local_q_func=(arglist.good_policy=='ddpg')))
	return trainers

def Space():
	observation_space = []
	action_space = []
	for i in range(#$AGENTNUM$#):
		total_action_space = []
		u_action_space = spaces.Discrete(#$ACTIONDIM$#)
		# if agent.movable:
		total_action_space.append(u_action_space)
		if len(total_action_space) > 1:
			# all action spaces are discrete, so simplify to MultiDiscrete action space
			if all([isinstance(act_space, spaces.Discrete) for act_space in total_action_space]):
				act_space = MultiDiscrete([[0, act_space.n - 1] for act_space in total_action_space])
			else:
				act_space = spaces.Tuple(total_action_space)
			action_space.append(act_space)
		else:
			action_space.append(total_action_space[0])
		obs_dim = #$OBSDIM$#
		observation_space.append(spaces.Box(low=-np.inf, high=+np.inf, shape=(obs_dim,), dtype=np.float32))

	return observation_space, action_space


if __name__ == '__main__':
	matter, machine = CreateStateMachine()
	with U.single_threaded_session():
		matter.MaddpgInit()
		while True:
			matter.Mainloop()
            

