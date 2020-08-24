package day14dowhileloop;

import java.util.Scanner;

public class DoWhile05 {

	public static void main(String[] args) {

		// Kullanýcýdan ismini alýn
		// Ýlk harf buyuk harf ise ekrana "Doðru girs yaptiniz"
		// ilk harf kucuk harf ise "Ýlk harfi buyuk harf olarak giriniz"
		Scanner scan = new Scanner(System.in);
		String isim = "";

		do {
			System.out.println("Ilk isminizi giriniz");
			isim = scan.nextLine();

			if (isim.charAt(0) >= 'A' && isim.charAt(0) <= 'Z') {
				System.out.println("Dogru giris yaptiniz");
			} else {
				System.out.println("Ilk harfi buyuk harf olarak giriniz");
			}

		} while (!(isim.charAt(0) >= 'A' && isim.charAt(0) <= 'Z'));

		scan.close();
	}

}
