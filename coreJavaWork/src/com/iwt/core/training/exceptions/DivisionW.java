package com.iwt.core.training.exceptions;

import java.util.Scanner;

class DivisionW {

	public static void main(String[] args) {

		int a, b, result;

		Scanner input = new Scanner(System.in);
		System.out.println("Input two integers");

		a = input.nextInt();
		b = input.nextInt();

		try {
			result = a / b;
			System.out.println("Result = " + result);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Ex.occured : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception occured : " + e.getMessage());
		} finally {
			System.out.println("Process completed.");
		}

	}
}