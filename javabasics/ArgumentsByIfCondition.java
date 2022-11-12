package javabasics;

public class ArgumentsByIfCondition {

	public static void main(String[]args) {
		
		if(args.length == 2) {
			
			System.out.println("HELLO"+" "+args[0]);
		}else {
			
			System.out.println("Arguments must require");
		}
	}
}
