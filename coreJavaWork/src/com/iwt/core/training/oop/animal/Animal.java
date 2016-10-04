package com.iwt.core.training.oop.animal;

public abstract class Animal {

	private static int count;
	protected final String name;
	protected final int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		count++;
	}

	public abstract void sound();

	public final void sound(int count) {
		for (int i = 0; i < count; i++) {
			sound();
		}
	}

	public abstract void run();

	public void description() {
		System.out.println(name + " is an animal at age " + age + //
				". Total object count: " + count);
	}

	public static void main(String[] args) {

		new Cat(1).description();
		Math.abs(1);

		Animal anim = new Dog(10);

		Dog dog = (Dog) anim;

		Animal[] animals = new Animal[] {//
		new Cat(1), //
				new Cat(2),//
				new Cat(4),//
				new Dog(2),//
				new Dog(5) };
		//
		for (Animal animal : animals) {
			animal.description();
			animal.sound(2);
			animal.run();
			System.out.println();
		}
	}
}
