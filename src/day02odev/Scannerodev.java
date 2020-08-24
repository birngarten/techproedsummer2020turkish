package day02odev;

import java.util.Scanner;

public class Scannerodev {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*1) Kullanýcýdan karenin kenar uzunluðunu alan ve sonra bu karenin alan ve
		çevresini hesaplayýp ekrana yazdýran bir program yazýnýz.
		Not: Alan: Boy x En
		Not: Çevre: 2x (Boy + En)*/
		
		System.out.println("Lutfen karenin kare ve cevresini hesapla!");
		
		int kenaruzunlugu = scan.nextInt();
		
		
		System.out.println(kenaruzunlugu + kenaruzunlugu + kenaruzunlugu + kenaruzunlugu);
		System.out.println(kenaruzunlugu * kenaruzunlugu);
		
		scan.close();
	}

}
