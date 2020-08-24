package day09odevswitchoperator;

import java.util.Scanner;

public class OdevSwitch01 {

	public static void main(String[] args) {

		// Kullanýcýdan bir gun alýn eðer gun “Cuma" ise ekrana “Müslümanlar için kutsal
		// gün" yazdýrýn. “Cumartesi" ise ekrana “Yahudiler için kutsal gün" yazdýrýn.
		// “Pazar" ise ekrana “Hýristiyanlar için kutsal gün" yazdýrýn. Diler günler
		// icin “Kutsal gün deðil" yazdýrýn.

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir gun ismi giriniz");
		String day = scan.next().toLowerCase();

		switch (day) {

		case "cuma":
			System.out.println("Müslümnlar için kutsal gün");
			break;
		case "cumartesi":
			System.out.println("Yahudiler için kutsal gün");
			break;
		case "pazar":
			System.out.println("Hristiyanlar için kutsal gün");
			break;
		default:
			System.out.println("Kutsal gun degil");

		}
		scan.close();
	}

}
