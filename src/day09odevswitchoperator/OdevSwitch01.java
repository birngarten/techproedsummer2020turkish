package day09odevswitchoperator;

import java.util.Scanner;

public class OdevSwitch01 {

	public static void main(String[] args) {

		// Kullan�c�dan bir gun al�n e�er gun �Cuma" ise ekrana �M�sl�manlar i�in kutsal
		// g�n" yazd�r�n. �Cumartesi" ise ekrana �Yahudiler i�in kutsal g�n" yazd�r�n.
		// �Pazar" ise ekrana �H�ristiyanlar i�in kutsal g�n" yazd�r�n. Diler g�nler
		// icin �Kutsal g�n de�il" yazd�r�n.

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir gun ismi giriniz");
		String day = scan.next().toLowerCase();

		switch (day) {

		case "cuma":
			System.out.println("M�sl�mnlar i�in kutsal g�n");
			break;
		case "cumartesi":
			System.out.println("Yahudiler i�in kutsal g�n");
			break;
		case "pazar":
			System.out.println("Hristiyanlar i�in kutsal g�n");
			break;
		default:
			System.out.println("Kutsal gun degil");

		}
		scan.close();
	}

}
