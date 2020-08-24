package day08odevternaryoperation;

import java.util.Scanner;

public class OdevTernaryOperation04 {

	public static void main(String[] args) {

		// Soru 4) Kullan�c�dan bir dikd�rtgenin en ve boyunu girmesini isteyin.
		// En ve boy e�it ise ekrana �Kare�
		// farkl� ise ekrana �Dikd�rtgen� yazd�r�n.
		// Girilen say�lar 0 ve 0 dan kucuk ise ekrana "Gecersiz" yazdirin.

		Scanner scan = new Scanner(System.in);

		System.out.println("Dikdotgenin enini giriniz");
		double en = scan.nextDouble();

		System.out.println("Dikdotgenin boyunu giriniz");
		double boy = scan.nextDouble();

		String result = (en > 0 && boy > 0) ? ((en == boy) ? "Kare" : "Dikdortgen") : " Gecersiz";
		System.out.println("Girdiginiz sayilar " + result + "dir.");

		scan.close();

	}
}
