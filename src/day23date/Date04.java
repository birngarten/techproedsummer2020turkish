package day23date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date04 {

	public static void main(String[] args) {
		
		// Date formatýný deðiþtirmek
		
		LocalDate date = LocalDate.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");//20-May-2020 ==> 3MMM ayý yazý formatýyla veriyor
		System.out.println(dtf.format(date));
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //20-05-2020 ==> 2MM ayý sayýsal deðerle veriyor
		System.out.println(dtf1.format(date));
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd"); //2020-05-20 
		System.out.println(dtf2.format(date));
		
		
		//Time Formatýný deðiþtirmek
		
		LocalTime time = LocalTime.now();
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm:ss"); //06:05:06
		System.out.println(dtf3.format(time));
		
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("HH:mm:ss"); //18:05:06 ==>==> büyük HH saati 24 saat sistemine göre veriyor.
		System.out.println(dtf4.format(time));
		
		//Baska ülkenin local zamanýný almak:
				
		System.out.println(LocalTime.now(ZoneId.of("America/Sao_Paulo")));
	}

}
