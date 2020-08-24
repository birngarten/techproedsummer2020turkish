package day23date;

import java.time.LocalTime;

public class Date03 {

	public static void main(String[] args) {
		// Time Manipulation (Zamaný deðiþtirme)
		
		LocalTime time = LocalTime.now();
		
		System.out.println(time);//17:28:42.740 ==>þimdi
		
		System.out.println(time.plusNanos(200));//17:32:39.873000200 salise
		System.out.println(time.plusSeconds(50));//17:32:37.701 ==> 50 saniye sonra
		System.out.println(time.plusMinutes(15));//17:45:23.539 ==> 15 dakika sonra
		System.out.println(time.plusHours(3));//20:28:42.740 ==> 3 saat sonrasý
		
		System.out.println(time.minusMinutes(14));//17:19:25.371 ==> 14 dak öncesi
		System.out.println(time.minusHours(7));//10:34:28.086 ==> 7 saat öncesi
		
		
	}

}
