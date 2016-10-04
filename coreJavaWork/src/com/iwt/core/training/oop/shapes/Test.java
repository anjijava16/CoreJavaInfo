package com.iwt.core.training.oop.shapes;

public class Test {

	public static final String WHITE = "WHITE";
	public static final String RED = "RED";
	public static final String BLACK = "BLACK";

	/**
	 * If you use this method, <br>
	 * use constants from Test class.
	 */
	private static void processColor(String color) {
	}

	private static void processColor(Color color) {
	}

	public static void main(String[] args) {
		processColor(WHITE);
		processColor("asdasd");

		processColor(Color.BLACK);
	}

}
