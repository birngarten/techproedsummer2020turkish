package day07nestedif;

import java.util.Scanner;

public class NestedIf03 {

	public static void main(String[] args) {

		// Kullanicidan yil girmesini isteyin
		// Girilen yil artik yil ise ekrana �Artik Yil� yazdirin
		// Girilen yil artik yil degil ise ekrana �Artik Yil Degil� yazdirin.
		// Artik yil 1) Yil 100'e b�l�n�rse 400'e de b�l�nmeli
		// 2) Yil 100'e b�l�nmezse 4'e b�l�nmeli

		Scanner scan = new Scanner(System.in);

		System.out.println("Y�l Giriniz");
		int yil = scan.nextInt();

		if (yil % 100 == 0 && yil % 400 == 0 || yil % 100 != 0 && yil % 4 == 0) {

			System.out.println("Art�k Y�l");

		} else {
			System.out.println("Artik yil de�ildir");
		}
		scan.close();
	}
}
