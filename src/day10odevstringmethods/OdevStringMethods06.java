package day10odevstringmethods;

import java.util.Scanner;

public class OdevStringMethods06 {

	public static void main(String[] args) {
		
		//Kullan�c�dan ya�ad��� �lkenin ismini al�n bu �lkenin bastan ikinci harfi ile sondan ikinci harfini
		//b�y�k harf olarak ekrana yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ya�ad���n�z �lkeyi giriniz");
		
		String ulke = scan.nextLine();
		
		
		System.out.println(ulke.substring(1,2).toUpperCase()+ulke.substring(ulke.length()-2,ulke.length()-1).toUpperCase() );
		
		
//		System.out.println(ulke.charAt(0)+ulke.substring(1,2).toUpperCase()+ulke.substring(2,len-2)
//		+ulke.substring(len-2,len-1).toUpperCase()+ulke.charAt(len-1));
		 //Ustteki pasiv komut ba�tan ve sondan iki harfi �lke ismi i�inde buyuk yaziyor. ==>aLmanYa �eklinde
		
		scan.close();
	}

}
