package day23date;

import java.time.LocalDate;

public class Date02 {

	public static void main(String[] args) {
		
		// Date Manipulation (Date �zerinden de�i�iklikler yapmak)
		
		LocalDate date = LocalDate.now();
		
		System.out.println(date);//2020-05-20 ==>Bug�n
		System.out.println(date.plusDays(1)); //2020-05-21 ==> yar�n�n tarihini verir.
		System.out.println(date.plusDays(13));//2020-06-02 ==> 13 g�n sonras�n� g�steriyor
		System.out.println(date.plusDays(-3));//2020-05-17 ==> 3 g�n �ncesine g�t�r�r. Ama bu �ok kullan�lmaz, baska method var.
		
		System.out.println(date.plusMonths(3));//2020-08-20 ==> 3 ay ekledik
		
		System.out.println(date.plusYears(3));//2023-05-20 ==> 3 y�l ekledik
		
		System.out.println(date.plusWeeks(2));//2020-06-03 ==> 2 Hafta ekledik
		
		System.out.println(date.minusDays(3));//2020-05-17 ==> 3 G�n �ncesi
		System.out.println(date.minusWeeks(5));//2020-04-15==> 5 Hafta �ncesi
		System.out.println(date.minusMonths(5));//2019-12-20
		System.out.println(date.minusYears(7));//2013-05-20
		
	}

}
