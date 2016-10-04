package com.iwt.core.training.oop.shapes;

public enum Color {

	WHITE("FFFFFF"), //
	BLACK("000000"), //
	RED("FF0000"), //
	GREEN("00FF00"), //
	BLUE("0000FF");

	private String rgb;

	private Color(String rgb) {
		this.rgb = rgb;
	}

	public String getRgb() {
		return rgb;
	}

	private static Color getColor(String string) {
		for (Color c : Color.values()) {
			if (c.rgb.equals(string)) {
				return c;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Color color = Color.getColor("FFFFFF");
		System.out.println(color);
	}

}