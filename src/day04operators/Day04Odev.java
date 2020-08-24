package day04operators;

import java.util.Scanner;

public class Day04Odev {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		//Soru:Kullanýcýnýn girdiði 4 basamaklý sayýnýn tum rakamlarýnýn toplamýný
		//ekrana yazdýran bir program yazýnýz.
		
		System.out.println("4 basamakli bir sayi giriniz!");
		
		int sayi = scan.nextInt();
		
		int bir = sayi%10;
		int iki = (sayi/10)%10;
		int uc  = (sayi/100)%10;
		int dort= sayi/1000;
		
		System.out.println(bir+iki+uc+dort);
		
		scan.close();
	}

}
