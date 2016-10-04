package com.iwt.core.training.oop.shapes;

public class TestShapes {

	public static void main(String[] args) {

		Shape[] shapes = new Shape[] { //
		new Circle(Color.BLACK, 10), //
				new Square(Color.WHITE, 10), //
				new Triangle(Color.BLUE, 10, 5) };

		for (Shape shape : shapes) {
			System.out.println(shape.description());
		}

		for (Shape shape : shapes) {
			System.out.println(shape);
		}

	}
}
