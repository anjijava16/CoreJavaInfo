package com.iwt.core.training.oop.animal;

public class Dog extends Mammal {

	public Dog(int age) {
		super("Dog", age);
	}

	@Override
	public void sound() {
		System.out.println("Hav");
	}

	@Override
	public void run() {
		System.out.println(name + " is running");
	}

	@Override
	public void feedBaby() {
		System.out.println(name + " is feeding baby");
	}

}
