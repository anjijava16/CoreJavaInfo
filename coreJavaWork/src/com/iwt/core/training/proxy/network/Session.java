package com.iwt.core.training.proxy.network;

public class Session {

	private final IClient client;
	private final long createTime;

	public Session(IClient client) {
		this.client = client;
		createTime = System.currentTimeMillis();
	}

	public IClient client() {
		return client;
	}

	public long createTime() {
		return createTime;
	}

}
