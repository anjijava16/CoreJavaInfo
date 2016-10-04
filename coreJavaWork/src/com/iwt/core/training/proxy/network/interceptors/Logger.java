package com.iwt.core.training.proxy.network.interceptors;

import java.util.Map;

import com.iwt.core.training.proxy.network.Session;

public class Logger implements INetworkInterceptor {

	@Override
	public int order() {
		return 1;
	}

	@Override
	public void intercept(Session session, String dest, Map<Object, Object> context) throws Exception {
		System.out.println("Ip [" + session.client() + "] Connecting to [" + dest + "] ...");
	}

}
