package day10odevstringmethods;

import java.util.Scanner;

public class OdevStringMethods05 {

	public static void main(String[] args) {

		//Kullan�c�dan ya�ad��� �lkenin ismini al�n bu �lkenin ilk iki harfini b�y�k harf olarak ekrana yazd�r�n.

		Scanner scan = new Scanner(System.in);
		System.out.println("Ya�ad���n�z �lkeyi giriniz");
		
		String ulke = scan.nextLine();
	
		
		System.out.println(ulke.trim().substring(0,2).toUpperCase().trim());
		
		scan.close();
	}

}
