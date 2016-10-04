package com.iwt.core.training.inputscanner;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name and age");

		String name = scanner.next();
		char abc [] = name.toCharArray();
		
		int age = scanner.nextInt();

		System.out.println("I am " + name + " " );
		System.out.print(age + " years old");

	}

}
