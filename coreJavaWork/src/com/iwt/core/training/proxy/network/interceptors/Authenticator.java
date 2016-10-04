package com.iwt.core.training.proxy.network.interceptors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.iwt.core.training.proxy.network.IClient;
import com.iwt.core.training.proxy.network.Session;

public class Authenticator implements INetworkInterceptor {

	private final Map<String, List<String>> restricted = new HashMap<>();

	public Authenticator() {
	}

	@Override
	public int order() {
		return 0;
	}

	@Override
	public void intercept(Session session, String dest, Map<Object, Object> context) throws Exception {
		IClient client = session.client();
		if (check(client, dest)) {
			throw new Exception("[" + client + "] is not allowed to connect to [" + dest + "] !");
		}
		System.out.println(client + " is connecting to " + dest + "..");
	}

	public void addRestrictedClient(IClient client, String domain) {
		List<String> list = restricted.get(client.ip());
		if (list == null) {
			list = new ArrayList<String>();
			restricted.put(client.ip(), list);
		}
		list.add(domain);
	}

	private boolean check(IClient client, String domain) {
		List<String> list = restricted.get(client.ip());
		if (list == null) {
			return true;
		}
		return list.contains(domain);
	}

}
