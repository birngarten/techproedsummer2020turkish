package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {

		// Kullan�c�dan password girmesini isteyin.
		// Password 4 basamakl� bir say� ise cift olup olmad�g�n� kontrol edin.
		// Cift ise "Password Tamam" yazd�r�n
		// Tek say� ise "Tekrak Deneyin" yazd�r�n.
		// Password 4 basamakl� de�ilse "Tekrak Deneyin" yazd�r�n

		// 0123 Java icin 123 tur.
		Scanner scan = new Scanner(System.in);

		System.out.println("Password giriniz");
		int pw = scan.nextInt();

		if (pw > 999 && pw < 10000 && pw % 2 == 0) {
			System.out.println("Password Tamam");

		} else if (pw > 999 && pw < 10000 && pw % 2 != 0) {
			System.out.println("Tek say�, tekrar deneyin");

		} else {
			System.out.println("Tekrar Deneyin");
		}

		scan.close();
	}

}
