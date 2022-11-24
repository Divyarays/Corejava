package PolymorphismUsingArrya;

public class Shape {
	private String color;
	private int borderwidth;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorderwidth() {
		return borderwidth;
	}

	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}

	public double area() {
		System.out.println("This is shape area method");
		return 0.0;

	}

}
