package com.iwt.core.training.oops;

class StaticBlock {
	public static void main(String[] args) {
		System.out.println("Main method is executed.");
	}

	static {
		System.out.println("Static block is executed before main method.");
	}

}