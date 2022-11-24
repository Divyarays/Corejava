package OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import javabasics.Age;

public class TestPerson {

	public static void main(String[] args) throws ParseException {

		Person p = new Person();
		Age a = new Age();

		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy");
		String str = format.format(d);
		String str1 = "12/10/2000";
		Date d1 = format.parse(str1);
		

		System.out.println(d1);
		System.out.println(str);
		LocalDate today = LocalDate.now();
		LocalDate Dob = LocalDate.of(2002, 7, 2);
		System.out.println("Dob :" + Dob);
		Period diff = Period.between(today , Dob);
		System.out.println(diff);
    
		p.setAddress("indore");
		p.setName("divya");
		

		System.out.println(p.getAddress());
		System.out.println(p.getName());
	}

}
