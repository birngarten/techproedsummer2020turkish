package day10odevstringmethods;

import java.util.Scanner;

public class OdevStringMethods06 {

	public static void main(String[] args) {
		
		//Kullanýcýdan yaþadýðý ülkenin ismini alýn bu ülkenin bastan ikinci harfi ile sondan ikinci harfini
		//büyük harf olarak ekrana yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yaþadýðýnýz Ülkeyi giriniz");
		
		String ulke = scan.nextLine();
		
		
		System.out.println(ulke.substring(1,2).toUpperCase()+ulke.substring(ulke.length()-2,ulke.length()-1).toUpperCase() );
		
		
//		System.out.println(ulke.charAt(0)+ulke.substring(1,2).toUpperCase()+ulke.substring(2,len-2)
//		+ulke.substring(len-2,len-1).toUpperCase()+ulke.charAt(len-1));
		 //Ustteki pasiv komut baþtan ve sondan iki harfi ülke ismi içinde buyuk yaziyor. ==>aLmanYa þeklinde
		
		scan.close();
	}

}
