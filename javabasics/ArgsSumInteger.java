package javabasics;

public class ArgsSumInteger {

	public static void main(String[]args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int sum = a+b;
		int subtraction = a-b;
		double division = a/b;
		int multiplication = a*b;
		System.out.println("Sum : "+ sum);
        System.out.println("Subtraction : "+ subtraction);
        System.out.println("Multiplication : "+ multiplication);
        System.out.println("Division : "+ division);
        
		
	}
}
