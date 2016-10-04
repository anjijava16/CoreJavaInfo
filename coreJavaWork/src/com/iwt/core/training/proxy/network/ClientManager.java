package com.iwt.core.training.proxy.network;

import java.util.HashMap;
import java.util.Map;

public class ClientManager {

	private final Map<String, Client> clients = new HashMap<String, Client>();

	public ClientManager() {
		initialize();
	}

	public void initialize() {
		Client client = new Client("192.168.1.223", "eaorak@gmail.com", "1234");
		clients.put(client.name(), client);
	}

	public IClient authorize(String user, String pass) {
		Client client = clients.get(user);
		if (client != null && client.pass().equals(pass)) {
			return client;
		}
		throw new RuntimeException("User [" + user + "] is not allowed to create session !");
	}
}
