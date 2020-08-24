package calismasayfasi;

import java.util.Scanner;

public class IfElseIf03 {

	public static void main(String[] args) {
		
				//Kullanýcýdan 6 basamakli bir sayi isteyin. 0 ile de baslayabilir.
				//Kazanma ihtimali %20, amorti iytimali %30
				// Kaybetme ihtimali %50 olan bir oyun programi yapiniz.
				//000000-000001-....999999. ==> 1000000 ihtimal
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lütfen 6 basamaklý bir sayý giriniz");
		
		int num= scan.nextInt();
		
		if (num<200000) {
			System.out.println("Kazandýnýz");
			
		}else if (num<500000) {
			System.out.println("amorti kazandýnýz");
			
		}else {
			System.out.println("Kaybettiniz");
		}
		
		scan.close();
	}

}
