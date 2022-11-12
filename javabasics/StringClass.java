package javabasics;

public class StringClass {
	public static void main(String[]args) {
		
  String name = "Vijay Dinanath Chouhan";
  
  System.out.println("Length of String :"+ name.length());
  System.out.println("9th character :"+ name.charAt(8));
  System.out.println("Chouhan index :"+ name.indexOf("Chouhan"));
  System.out.println("First n position :"+name.indexOf('i'));
  System.out.println("Last n position :"+ name.lastIndexOf('n'));
  System.out.println("a is replaced by b :"+ name.replace("a","b"));
  System.out.println("All a is replaced by b :"+ name.replaceAll("a", "b"));
  System.out.println("Chhota Vijay :"+ name.toLowerCase());
  System.out.println("Bada Vijay :"+ name.toUpperCase());
  System.out.println("Starts with Dinanath :"+ name.startsWith("Dinanath"));
  System.out.println("Ends with Mishra :"+ name.endsWith("Mishra"));
  System.out.println("Substring :"+ name.substring(7));
  
	
	
	}

}
