package javabasics;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Age {;
	public static void main(String[]args) {
		
		Date d = new Date();
		LocalDate today = LocalDate.now();
		LocalDate Dob = LocalDate.of(2002, 7, 2);
		System.out.println("Dob :" + Dob);
		Period diff = Period.between(today , Dob);
		System.out.println(diff);
		
	}

}
