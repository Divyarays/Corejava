package OOP;

public class Human {
     private String name;
     private int address;
     
     public Human() {
    	 System.out.println("Default");
     }
     public Human(int a) {
    	 address = a;
    	 System.out.println("one parameterized");
     }
     public Human(String b , int a) {
    	 name = b;
    	 address = a;
    	 System.out.println("two parameterized");
     }
	public String getName() {
		return name;
	}
	public int getAddress() {
		return address;
	}
}
