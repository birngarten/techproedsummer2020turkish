package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
		
		//Bug�n�n tarihini ekrana yazd�ral�m.
		
		System.out.println(LocalDate.now()); //2020-05-20
		
		//Bug�n�n zaman�n� saat, dakika, saniye ve salise olarak ekrana yazd�ral�m
		System.out.println(LocalTime.now());//17:02:47.236
		
		//Bug�n�n tarihini ve zaman�n� ekrana yazd�ral�m
		System.out.println(LocalDateTime.now());//2020-05-20T17:02:47.237
		

	}

}
