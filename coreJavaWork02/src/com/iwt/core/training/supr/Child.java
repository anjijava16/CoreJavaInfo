package com.iwt.core.training.supr;

public class Child extends Parent {

	void display() {
		System.out
				.println("Now  in Child Class calling display() by using super ");
		super.display();

	}

}
