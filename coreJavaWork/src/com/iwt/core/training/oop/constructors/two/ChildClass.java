package com.iwt.core.training.oop.constructors.two;

import com.iwt.core.training.oop.constructors.BaseClass;

public class ChildClass extends BaseClass {

	protected String childClassVar;

	public ChildClass() {
		super("parameter");
		System.out.println("ChildClass");
	}

	public static void main(String[] args) {
		new ChildClass();
	}

}
