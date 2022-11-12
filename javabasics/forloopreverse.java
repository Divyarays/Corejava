package javabasics;

public class forloopreverse {
	public static void main(String[]args) {
		
		String s = "Divya sharma";
		
		String b[] = s.split(" ");
		
		for(String d : b) {
		
		for(int i= d.length(); i>=1; i--) {
			
			System.out.print(d.charAt(i-1));
			
		}System.out.println();
		
	}

}
}