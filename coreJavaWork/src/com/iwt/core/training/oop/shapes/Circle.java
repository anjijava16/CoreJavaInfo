package com.iwt.core.training.oop.shapes;

public class Circle extends Shape {

	private final int r;

	public Circle(Color color, int r) {
		super(color);
		this.r = r;
	}

	@Override
	protected int calculateArea() {
		return (int) Math.PI * r * r;
	}

}
