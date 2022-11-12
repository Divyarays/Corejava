package javabasics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BirthDate {
	
	public static void main(String[]args) throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String str = "02/07/2002";
		Date d = format.parse(str);
		
		System.out.println(d);
		
 
	}

}
