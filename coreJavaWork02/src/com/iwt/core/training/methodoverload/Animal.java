package com.iwt.core.training.methodoverload;

public class Animal {

	public void add(Double x, Double y) {
		System.out.println("The sum is : " + (x + y));

	}
//
	public void add(int x, int y) {

		System.out.println("The sum is : " + (x + y));
	}

	// public void fun(int x) {
	// System.out.println("The number passed was " + x);
	// }

}
