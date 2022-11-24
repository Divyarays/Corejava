package Inheritence;

public class Shape {
	private int borderwidth;
	private String color;

	public Shape() {

	}

	public Shape(int a, String b) {
		this.borderwidth = a;
		this.color = b;

	}

	public int getBorderwidth() {
		return borderwidth;
	}

	public String getColor() {
		return color;
	}
}
