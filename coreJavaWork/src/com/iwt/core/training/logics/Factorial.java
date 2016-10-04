package com.iwt.core.training.logics;

import java.util.Scanner;

class Factorial {
	public static void main(String args[]) {
		System.out.print("Enter an integer to calculate it's factorial: ");
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		if (n < 0)
			System.out.println("Number should be non-negative.");
		else {
			System.out.println("Factorial of " + n + " is = " + fac(n));
		}
	}

	public static int fac(int n) {
		return (n < 1) ? 1 : n * fac(n - 1);
	}

}