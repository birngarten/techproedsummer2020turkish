package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {

		// Kullanýcýdan password girmesini isteyin.
		// Password 4 basamaklý bir sayý ise cift olup olmadýgýný kontrol edin.
		// Cift ise "Password Tamam" yazdýrýn
		// Tek sayý ise "Tekrak Deneyin" yazdýrýn.
		// Password 4 basamaklý deðilse "Tekrak Deneyin" yazdýrýn

		// 0123 Java icin 123 tur.
		Scanner scan = new Scanner(System.in);

		System.out.println("Password giriniz");
		int pw = scan.nextInt();

		if (pw > 999 && pw < 10000 && pw % 2 == 0) {
			System.out.println("Password Tamam");

		} else if (pw > 999 && pw < 10000 && pw % 2 != 0) {
			System.out.println("Tek sayý, tekrar deneyin");

		} else {
			System.out.println("Tekrar Deneyin");
		}

		scan.close();
	}

}
