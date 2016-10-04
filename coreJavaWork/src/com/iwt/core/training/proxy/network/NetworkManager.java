package com.iwt.core.training.proxy.network;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.iwt.core.training.proxy.network.interceptors.INetworkInterceptor;

public class NetworkManager implements INetwork {

	private final List<INetworkInterceptor> interceptors = new ArrayList<>();
	private final Map<Object, Object> context = new HashMap<>();
	private final NetworkServer server;
	private final Sorter sorter;
	private final Map<String, Session> sessions = new HashMap<String, Session>();
	private final ClientManager clientManager;

	class Sorter implements Comparator<INetworkInterceptor> {
		@Override
		public int compare(INetworkInterceptor o1, INetworkInterceptor o2) {
			return o1.order() - o2.order();
		}
	}

	public NetworkManager(NetworkServer server, ClientManager clientManager) {
		this.server = server;
		this.clientManager = clientManager;
		this.sorter = new Sorter();
	}

	public Session session(String user, String pass) {
		IClient client = clientManager.authorize(user, pass);
		Session session = new Session(client);
		sessions.put(user, session);
		return session;
	}

	@Override
	public void connect(Session session, String dest) throws Exception {
		for (INetworkInterceptor ic : interceptors) {
			ic.intercept(session, dest, context);
		}
		server.connect(session, dest);
	}

	public void addInterceptor(INetworkInterceptor interceptor) {
		interceptors.add(interceptor);
		Collections.sort(interceptors, sorter);
	}

}
