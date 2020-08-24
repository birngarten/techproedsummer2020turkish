package day23date;

import java.time.LocalDate;

public class Date02 {

	public static void main(String[] args) {
		
		// Date Manipulation (Date üzerinden değişiklikler yapmak)
		
		LocalDate date = LocalDate.now();
		
		System.out.println(date);//2020-05-20 ==>Bugün
		System.out.println(date.plusDays(1)); //2020-05-21 ==> yarının tarihini verir.
		System.out.println(date.plusDays(13));//2020-06-02 ==> 13 gün sonrasını gösteriyor
		System.out.println(date.plusDays(-3));//2020-05-17 ==> 3 gün öncesine götürür. Ama bu çok kullanılmaz, baska method var.
		
		System.out.println(date.plusMonths(3));//2020-08-20 ==> 3 ay ekledik
		
		System.out.println(date.plusYears(3));//2023-05-20 ==> 3 yıl ekledik
		
		System.out.println(date.plusWeeks(2));//2020-06-03 ==> 2 Hafta ekledik
		
		System.out.println(date.minusDays(3));//2020-05-17 ==> 3 Gün öncesi
		System.out.println(date.minusWeeks(5));//2020-04-15==> 5 Hafta öncesi
		System.out.println(date.minusMonths(5));//2019-12-20
		System.out.println(date.minusYears(7));//2013-05-20
		
	}

}
