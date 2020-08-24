package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
		
		//Bugünün tarihini ekrana yazdýralým.
		
		System.out.println(LocalDate.now()); //2020-05-20
		
		//Bugünün zamanýný saat, dakika, saniye ve salise olarak ekrana yazdýralým
		System.out.println(LocalTime.now());//17:02:47.236
		
		//Bugünün tarihini ve zamanýný ekrana yazdýralým
		System.out.println(LocalDateTime.now());//2020-05-20T17:02:47.237
		

	}

}
