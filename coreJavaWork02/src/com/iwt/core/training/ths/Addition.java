package com.iwt.core.training.ths;

public class Addition {

	String num1, num2;

	Addition(String num1, String num2) {
		
		
		System.out.println("From Constructor ");
		this.num1=num1;
	    this.num2=num2;
		System.out.print("The addition of two numbers is: ");
		System.out.println(num1 + num2);
	}

	void add(int num1, int num2) {
		System.out.println("From Instance Method");
		num1 = num1; // this.num1=num1;
		num2 = num2; // this.num2=num2;
		System.out.print("The addition of two numbers is: ");
		System.out.println(num1 + num2);
	}
}
