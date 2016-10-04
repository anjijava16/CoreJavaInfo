package com.iwt.core.training.oop.animal;

public class Test {

	public static void main(String[] args) {
		Cat cat = new Cat(10);
		Dog dog = new Dog(10);

		processAnimal(cat);
		processAnimal(dog);
	}

	static void processAnimal(Animal animal) {
		// animal...
		if (animal instanceof Dog) {
			((Dog) animal).feedBaby();
		} else if (animal instanceof Cat) {
			((Cat) animal).run();
		} else {
			animal.description();
		}
	}

}
