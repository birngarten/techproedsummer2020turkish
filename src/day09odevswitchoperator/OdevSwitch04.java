package day09odevswitchoperator;

import java.util.Scanner;

public class OdevSwitch04 {

	public static void main(String[] args) {

		// Kullan�c�dan ay ismi al�n e�er ay ismi 31 �eken aylardan biri ise ekrana �Bu
		// ay 31 g�nd�r� yazd�r�n.
		// E�er ay ismi 30 �eken aylardan biri ise ekrana �Bu ay 30 g�nd�r� yazd�r�n.
		// E�er ay ismi 28 veya 29 �eken aylardan biri ise ekrana �Bu ay �ubat ay�d�r�
		// yazd�r�n.
		// Bu isimlerin d���ndaki isimler i�in �Ge�ersiz ay ismi� yazd�r�n.

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir ay ismini giriniz");
		String ay = scan.next().toLowerCase();

		switch (ay) {

		case "ocak":
		case "mart":
		case "may�s":
		case "temmuz":
		case "agustos":
		case "ekim":
		case "aral�k":
			System.out.println(ay + " ay� 31 g�nd�r");
			break;
		case "nisan":
		case "haziran":
		case "eyl�l":
		case "kas�m":
			System.out.println(ay + " ay� 30 g�nd�r");
			break;
		case "subat":
			System.out.println(ay + " ay� 28 g�nd�r. 4 y�lda bir 29 ceker");
			break;
		default:
			System.out.println("Ge�ersiz ay ismi");

		}

		scan.close();
	}

}
