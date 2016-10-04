package com.iwt.core.training.basics;

import java.util.Scanner;

class AddNumbers {
	public static void main(String args[]) {
		int x, y, z;
		System.out.print("Enter two integers to calculate their sum ");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		System.out.println("Sum of entered integers = " + (x + y));
	}
}