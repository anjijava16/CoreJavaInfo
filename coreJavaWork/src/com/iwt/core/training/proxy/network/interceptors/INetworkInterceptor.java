package com.iwt.core.training.proxy.network.interceptors;

import java.util.Map;

import com.iwt.core.training.proxy.network.Session;

public interface INetworkInterceptor {

	void intercept(Session session, String dest, Map<Object, Object> context) throws Exception;

	int order();

}
