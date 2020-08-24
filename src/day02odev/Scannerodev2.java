package day02odev;

import java.util.Scanner;

public class Scannerodev2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*Kullanýcýdan dikdörtgenin boyutlarýný alan ve sonra diktörtgenin alan ve
		cevresini hesaplayýp ekrana yazdýran bir program yazýnýz.
		Not: Alan: Boy x En
		Not: Çevre: 2x (Boy + En)*/
		
		System.out.println("Lutfen dikdotgenin alan ve cevresini hesaplayin");
		
		int kenaru1 = scan.nextInt();
		int kenaru2 = scan.nextInt();
		
		System.out.println((kenaru1 + kenaru2) * 2);
		System.out.println(kenaru1 * kenaru2);

		scan.close();
	}

}
