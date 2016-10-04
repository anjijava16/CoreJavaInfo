package com.iwt.core.training.proxy.network;

public class NetworkServer implements INetwork {

	class Network {
		public void doConnect(String ip, String dest) throws Exception {
			// Do network connection
		}
	}

	private final Network network = new Network();

	public NetworkServer() {
	}

	@Override
	public void connect(Session session, String dest) throws Exception {
		network.doConnect(session.client().ip(), dest);
	}

}
