package javabasics;

public class conditionifelse {
	
	public static void main(String[]args){
	
		int p= 1000;
		int r= 5;
		int t= 2;
		int SI= (p*r*t)/100;
		
		System.out.println(SI);
		if(p>9000) {
			System.out.println(SI);
		}
		else {
			System.out.println("0");
		}
	}
}
