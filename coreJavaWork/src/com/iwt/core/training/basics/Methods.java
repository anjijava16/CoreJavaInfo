package com.iwt.core.training.basics;

class Methods {

	// constructor method

	Methods() {
		System.out.println("Constructor method is called when an object of it's class is created.");
	}

	// main method where program execution begins

	public static void main(String[] args) {
		// nonStaticMethod();
		Methods object = new Methods();
		object.staticMethod();
	}

	// non static method

	void nonStaticMethod() {
		System.out.println("Can be called by creating an object.");
	}

	// static method

	static void staticMethod() {
		System.out.println("Static method can be called without creating object.");
	}
}