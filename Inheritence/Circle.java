package Inheritence;

public class Circle extends GeomatricShapes{
	private double area;
	private double radius;
	public double getArea() {
		area = 3.14*radius*radius;
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	

}
