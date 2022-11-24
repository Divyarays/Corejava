package OOP;

public class TestShape {
	
	public static void main(String[]args) {
		
		Shape s ; 
		s = new Shape();
		s.setColor("Orange");
		s.setBorderWith(10);
		
		System.out.println(s.getBorderWith());
		System.out.println(s.getColor());
		
	}

}
