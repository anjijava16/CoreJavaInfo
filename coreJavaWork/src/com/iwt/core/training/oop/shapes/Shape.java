package com.iwt.core.training.oop.shapes;

public abstract class Shape {

	private static final int DEFAULT = -1;
	//
	protected Color color;
	protected int area = DEFAULT;
	protected final int corners;

	public Shape(Color color) {
		this(color, 0);
	}

	public Shape(Color color, int corners) {
		this.color = color;
		this.corners = corners;
	}

	public final int area() {
		if (area == DEFAULT) {
			area = calculateArea();
		}
		return area;
	}

	public final int corners() {
		return corners;
	}

	protected abstract int calculateArea();

	public final String description() {
		return getClass().getSimpleName() + " is a shape that has " + corners() + " corners, and has an area of " + area() + " m2s.";
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + ", area=" + area + ", corners=" + corners + ", area()=" + area() + ", corners()=" + corners() + "]";
	}

}
