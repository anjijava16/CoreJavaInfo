package com.iwt.core.training.bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter your name");
		String name = 	bufferedreader.readLine();
		
		System.out.println("Enter your age:");
		int age = Integer.parseInt(bufferedreader.readLine());
		
		System.out.println("I am "+name+" "+age +" years old");
		
			      
	}

}
