package javabasics;

public class stringbuffer {
	
	public static void main(String[]args) {
		
		StringBuffer sb = new StringBuffer("vijay");
				sb.append("dinanath chouhan");
		
	System.out.println(sb);			
	System.out.println("length is "+sb.length());
	System.out.println("capacity is "+sb.capacity());
	System.out.println("char at "+sb.charAt(1));
	System.out.println("index of "+sb.indexOf("chouhan"));
	System.out.println("replacement is "+sb.replace(0, 5, "jay "));
	System.out.println("reverse is "+sb.reverse());
	
	}

}
