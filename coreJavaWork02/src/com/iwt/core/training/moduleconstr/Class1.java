package com.iwt.core.training.moduleconstr;
public class Class1 {

	public static void main(String[] args) {

		Class2 ob = new Class2();

		System.out.println("Value of x when constructor is called: " + ob.x);
		System.out.println("Value of y when constructor is called: " + ob.y);
		
		Class2 ob_1 = new Class2(5);
		
		System.out.println("Value of x when constructor is called: " + ob_1.x);
		System.out.println("Value of y when constructor is called: " + ob_1.y);
	}

}
