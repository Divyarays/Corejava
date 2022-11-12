package javabasics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormate {
	
	public static void main(String[]args) {
		Date d= new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"+"H:mm:ss:SSS");
		String str = format.format(d);
		
		System.out.print(str);
		System.out.println();
	}
	

}
