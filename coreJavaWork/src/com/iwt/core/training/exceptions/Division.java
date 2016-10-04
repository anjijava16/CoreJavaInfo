package com.iwt.core.training.exceptions;

import java.util.Scanner;

class Division {

	public static void main(String[] args) {

		int a, b, result;

		Scanner input = new Scanner(System.in);
		System.out.println("Input two integers");

		a = input.nextInt();
		b = input.nextInt();

		// try block
		try {
			result = a / b;
			System.out.println("Result = " + result);
		} catch (ArithmeticException e) { // catch block
			System.out.println("Exception caught: Division by zero.");
		}
	}

}