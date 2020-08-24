package day10odevstringmethods;

import java.util.Scanner;

public class OdevStringMethods05 {

	public static void main(String[] args) {

		//Kullanýcýdan yaþadýðý ülkenin ismini alýn bu ülkenin ilk iki harfini büyük harf olarak ekrana yazdýrýn.

		Scanner scan = new Scanner(System.in);
		System.out.println("Yaþadýðýnýz Ülkeyi giriniz");
		
		String ulke = scan.nextLine();
	
		
		System.out.println(ulke.trim().substring(0,2).toUpperCase().trim());
		
		scan.close();
	}

}
