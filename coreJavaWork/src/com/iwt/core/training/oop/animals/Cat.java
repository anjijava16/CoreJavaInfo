package com.iwt.core.training.oop.animals;

public class Cat extends Animal {

	public Cat() {
		// Is this a good practice ?
		this.name = "Cat";
	}

	@Override
	public String sound() {
		return "Miyawww";
	}

}
