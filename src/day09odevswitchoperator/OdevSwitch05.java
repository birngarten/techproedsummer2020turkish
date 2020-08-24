package day09odevswitchoperator;

import java.util.Scanner;

public class OdevSwitch05 {

	public static void main(String[] args) {

		// Kullanýcýdan A, B, C, D harflerinden birini alýn eðer harf C ise ekrana
		// “Doðru cevap” yazdýrýn.
		// A, B, D den biri ise ekrana “Yanlýþ cevap” yazdýrýn.
		// Bu harflerin dýþýndaki harfler için “Geçersiz cevap þýkký” yazdýrýn.

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir harf giriniz");
		char ch = scan.next().charAt(0);

		switch (ch) {

		case 'C':
			System.out.println("Dogru cevap");
			break;
		case 'A':
			System.out.println("Yanlis cevap");
			break;
		case 'B':
			System.out.println("Yanlis cevap");
			break;
		case 'D':
			System.out.println("Yanlis cevap");
			break;
		default:
			System.out.println("Geçersiz cevap þýkký");

		}
		scan.close();
	}

}
