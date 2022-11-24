package Inheritence;

public class TestTriangle {
	public static void main(String[]args) {
		Triangle t = new Triangle();
		t.setColor("Red");
		t.setBorderwidth(20);
		t.setHeight(40);
		t.setBase(45);
		System.out.println(t.getColor()+"\n"+t.getBorderwidth()+"\n"+t.getHeight()+"\n"+t.getBase()+"\n"+t.getArea());
	}

}
