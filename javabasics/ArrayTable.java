package javabasics;

public class ArrayTable {
	
	public static void main(String[]args) {
		
		int[] table = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0; i<table.length;i++) {
			for(int j = 1; j<=10; j++) {
				System.out.print(j*table[i]+"\t");
			
			}System.out.println();
		}
		
	}
	
}
