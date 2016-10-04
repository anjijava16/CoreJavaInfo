package com.iwt.core.training.ths;

public class Main {

	public static void main(String[] args) {
		
		
		Addition addnums= new Addition("Hello ","There");
		
		addnums.add(10,20);

		System.out.println("The first number is: " +addnums.num1);
		
		System.out.println("The second number is: " +addnums.num2);
		
	}

}
