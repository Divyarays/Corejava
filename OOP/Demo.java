package OOP;

public class Demo {
          
	
      public Demo() {
    	  System.out.println("Default");
      }
      public Demo(int a) {
    	  this();
    	  System.out.println("one parameterized");
      }
      public Demo(int a , int b ) {
    	  this(a);
    	  System.out.println("two parameterized ");
      }
}
