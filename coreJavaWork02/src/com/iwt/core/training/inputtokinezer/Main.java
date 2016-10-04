package com.iwt.core.training.inputtokinezer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader bufferedreader = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("Enter your name and age separated by comma");
		
		String input = bufferedreader.readLine();

		StringTokenizer tokenizer = new StringTokenizer(input, ",");
		String name = tokenizer.nextToken();
		int age = Integer.parseInt(tokenizer.nextToken());

		System.out.println("I am " + name + " "  + " years old"+ age);

	}

}
