package javabasics;

public class ReverseofName {

	public static void main(String[]args) {
		
		StringBuffer sb = new StringBuffer("Divya ");
		sb.append("Sharma");
		
		System.out.println(sb);
		System.out.println("Reverse of Name : "+ sb.reverse());
				
	}
}
