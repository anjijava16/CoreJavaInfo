package com.iwt.core.training.oop.shapes;

public class Triangle extends Shape {

	private final int base;
	private final int height;

	public Triangle(Color color, int base, int height) {
		super(color, 3);
		this.base = base;
		this.height = height;
	}

	@Override
	public int calculateArea() {
		return base * height;
	}

}
