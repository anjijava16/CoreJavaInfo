package com.iwt.core.training.collections;

import java.util.HashMap;
import java.util.Map;

public class TestMaps {

	static class Customer {
		private final String tckno;
		private final String name;

		public Customer(String tckno, String name) {
			this.tckno = tckno;
			this.name = name;
		}

		@Override
		public String toString() {
			return "Customer [tckno=" + tckno + ", name=" + name + "]";
		}

	}

	public static void main(String[] args) {

		Map<String, Customer> customers = new HashMap<String, Customer>();

		Customer customer = new Customer("1234", "Ahmet");
		customers.put("1234", customer);
		customer = new Customer("4455", "Mehmet");
		customers.put("4455", customer);
		customer = new Customer("2344", "Ayse");
		customers.put("2344", customer);

		for (Customer c : customers.values()) {
			System.out.println(c);
		}

		for (String k : customers.keySet()) {
			System.out.println(k);
		}

	}

}
