package day07nestedif;

import java.util.Scanner;

public class NestedIf03 {

	public static void main(String[] args) {

		// Kullanicidan yil girmesini isteyin
		// Girilen yil artik yil ise ekrana “Artik Yil” yazdirin
		// Girilen yil artik yil degil ise ekrana “Artik Yil Degil” yazdirin.
		// Artik yil 1) Yil 100'e bölünürse 400'e de bölünmeli
		// 2) Yil 100'e bölünmezse 4'e bölünmeli

		Scanner scan = new Scanner(System.in);

		System.out.println("Yýl Giriniz");
		int yil = scan.nextInt();

		if (yil % 100 == 0 && yil % 400 == 0 || yil % 100 != 0 && yil % 4 == 0) {

			System.out.println("Artýk Yýl");

		} else {
			System.out.println("Artik yil deðildir");
		}
		scan.close();
	}
}
