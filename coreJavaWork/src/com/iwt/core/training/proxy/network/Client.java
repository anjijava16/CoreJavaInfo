package com.iwt.core.training.proxy.network;

import java.util.HashMap;
import java.util.Map;

public class Client implements IClient {

	private final String ip;
	private final String name;
	private final String pass;

	private static Map<String, Client> clients = new HashMap<String, Client>();

	public static IClient create(String ip, String user, String pass) {
		Client client = clients.get(ip);
		if (client == null) {
			client = new Client(ip, user, pass);
			clients.put(ip, client);
		}
		return client;
	}

	public Client(String ip, String name, String pass) {
		this.ip = ip;
		this.name = name;
		this.pass = pass;
	}

	@Override
	public String ip() {
		return ip;
	}

	@Override
	public String name() {
		return name;
	}

	public String pass() {
		return pass;
	}

	@Override
	public String toString() {
		return "Client [ip=" + ip + ", name=" + name + "]";
	}

}
