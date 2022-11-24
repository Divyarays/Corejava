package Inheritence;

public class TestCircle {
	public static void main(String[]args) {
		Circle c = new Circle();
		c.setBorderwidth(20);
		c.setColor("black");
		c.setRadius(2.1);
		System.out.println(c.getArea()+"\n"+ c.getBorderwidth()+"\n"+ c.getColor()+"\n"+ c.getRadius());
		
		
	}

}
