package javabasics;

public class MultipleMethod {

	public static void main(String[]args) {
		
		sum(20,10);
		subtraction(20,10);
		multiplication(20,30);
		division(30,20);
	}
	protected static void sum(int i,int j) {
		
		System.out.println(i+j);
	}
	protected static void subtraction(int i,int j ) {
		
		System.out.println(i-j);
	}
	protected static void multiplication(int i, int j) {
		
		System.out.println(i*j);
	}
	protected static void division(int i, int j) {
		
		System.out.println(i/j);
	}
	}
