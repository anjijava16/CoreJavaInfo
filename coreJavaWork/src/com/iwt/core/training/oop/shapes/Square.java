package com.iwt.core.training.oop.shapes;

public class Square extends Shape {

	private final int length;

	public Square(Color color, int length) {
		super(color, 4);
		this.length = length;
	}

	@Override
	public int calculateArea() {
		return length * length;
	}

}
