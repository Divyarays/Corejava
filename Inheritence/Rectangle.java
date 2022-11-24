package Inheritence;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle() {

	}

	public Rectangle(int a, String b, int c, int d) {
		super(a,b);
		this.length = c;
		this.width = d;

	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}
}
