package in.co.Interface;

public class TestBusinessman {
	public static void main(String[]args) {
		Businessman b = new Businessman();
		b.setName("Divya");
		b.setAddress("Indore");
		System.out.println(b.getName()+"\n"+b.getAddress());
		System.out.println(b.donate());
		System.out.println();
		
		
	}

}
