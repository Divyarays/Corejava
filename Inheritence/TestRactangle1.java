package Inheritence;

public class TestRactangle1 {

	public static void main(String[]args) {
		Rectangle1 r = new Rectangle1();
		r.setColor("BLUE");
		r.setBorderwidth(10);
		r.setLength(10);
		r.setWidth(20);
		System.out.println(r.getColor()+"\n"+r.getBorderwidth()+"\n"+r.getLength()+"\n"+r.getWidth()+"\n"+r.getArea());
	}
	
}
