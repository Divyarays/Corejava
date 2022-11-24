package Inheritence;

public class Triangle1 extends Shape1 {
	private double base;
	private double height;
	@Override
	public double area() {
		return base*height/2;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	

}
