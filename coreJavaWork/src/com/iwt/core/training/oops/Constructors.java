package com.iwt.core.training.oops;

class Constructors {
	String name;

	Constructors() {
		System.out.println("Constructor method called.");
	}

	Constructors(String t) {
		name = t;
	}

	void setName(String t) {
		name = t;
	}

	void getName() {
		System.out.println("Language name: " + name);
	}

	public static void main(String[] args) {
		Constructors cpp = new Constructors();
		Constructors java = new Constructors("Java");

		cpp.setName("C++");

		java.getName();
		cpp.getName();
	}
}