package Inheritence;

public class TestShape {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(11, "red", 10, 10);
		

		// Shape s = new Shape(10,"red");

		System.out.println(r.getWidth() + " " + r.getLength() + " " + r.getBorderwidth() + " " + r.getColor());
	}

}
