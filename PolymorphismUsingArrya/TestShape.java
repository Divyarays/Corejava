package PolymorphismUsingArrya;

public class TestShape {
	public static void main(String[] args) {
		Shape[] s = new Shape[2];
		s[0] = new Rectangle();
		Rectangle r = new Rectangle();
		r.setLength(20);
		r.setWidth(10);
		s[1] = new Triangle();
		Triangle t = new Triangle();
		t.setBase(12.5);
		t.setHeight(5.2);
		System.out.println(r.getLength() + "\n" + r.getWidth() + "\n" + r.area());
		System.out.println(t.getBase() + "\n" + t.getHeight() + "\n" + t.area());
		System.out.println(r.area()+t.area());
	}

}
