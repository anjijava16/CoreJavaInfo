package com.iwt.core.training.proxy.network;

import com.iwt.core.training.proxy.network.interceptors.Authenticator;
import com.iwt.core.training.proxy.network.interceptors.INetworkInterceptor;
import com.iwt.core.training.proxy.network.interceptors.Logger;

public class Admin {

	public static void main(String[] args) throws Exception {

		NetworkManager networkManager = new NetworkManager(new NetworkServer(), new ClientManager());
		//
		INetworkInterceptor logger = new Logger();

		IClient client = Client.create("192.168.1.223", "Ender", "1234");
		//

		Authenticator authenticator = new Authenticator();
		authenticator.addRestrictedClient(client, "www.twitter.com");
		// Admin
		networkManager.addInterceptor(authenticator);
		networkManager.addInterceptor(logger);
		//
		// Client
		Session session = networkManager.session("ender@elron.co", "1234");

		networkManager.connect(session, "www.google.com");
		networkManager.connect(session, "www.twitter.com");
	}
}
