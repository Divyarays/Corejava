package Inheritence;

public class Circle1 extends Shape1 {
	private double radius;
	@Override
	public double area() {
	return 3.14 * radius * radius;
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
