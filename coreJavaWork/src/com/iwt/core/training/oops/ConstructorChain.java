package com.iwt.core.training.oops;

class ConstructorChain {
	int a;

	ConstructorChain(int a) {
		this.a = a;
	}

}

class Parent extends ConstructorChain {
	int b;

	Parent(int a, int b) {
		super(a);
		this.b = b;
	}

	void show() {
		System.out.println("GrandParent's a = " + a);
		System.out.println("Parent's b      = " + b);
	}
}

class Child {

	public static void main(String[] args) {
		Parent object = new Parent(8, 9);
		object.show();
	}

}