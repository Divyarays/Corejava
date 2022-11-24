package Inheritence;

public class Triangle extends GeomatricShapes {
	private int height;
    private int base;
    private int area;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getArea() {
		area = base*height/2;
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	
    
}
