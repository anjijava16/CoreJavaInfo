package com.iwt.core.training.oop.animals;

public class Dog extends Animal {

	public Dog() {
		// Is this a good practice ?
		this.name = "Dog";
	}

	@Override
	public String sound() {
		return "Haw Haw";
	}

}
