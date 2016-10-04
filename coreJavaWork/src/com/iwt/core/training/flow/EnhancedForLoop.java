package com.iwt.core.training.flow;

import java.util.ArrayList;
import java.util.List;

class EnhancedForLoop {

	public static void main(String[] args) {
		int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

		for (int i = 0; i < primes.length; i++) {
			System.out.println(primes[i]);
		}
		for (int t : primes) {
			System.out.println(t);
		}

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		for (Integer integer : list) {
			System.out.println(integer);
		}

		int a = 100;

		switch (a) {
		case 100:
			System.out.println(100);
			break;
		case 200:
			System.out.println(200);
			break;
		case 300:
			System.out.println(300);
			break;
		default:
			break;
		}

	}

}