package com.iwt.core.training.oop.animal;

public class Cat extends Mammal {

	public Cat(int age) {
		super("Cat", age);
	}

	@Override
	public void sound() {
		System.out.println("Miyav");
	}

	public void catMethod() {

	}

	@Override
	public void description() {
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
