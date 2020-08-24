package day09odevswitchoperator;

import java.util.Scanner;

public class OdevSwitch04 {

	public static void main(String[] args) {

		// Kullanýcýdan ay ismi alýn eðer ay ismi 31 çeken aylardan biri ise ekrana “Bu
		// ay 31 gündür” yazdýrýn.
		// Eðer ay ismi 30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdýrýn.
		// Eðer ay ismi 28 veya 29 çeken aylardan biri ise ekrana “Bu ay Þubat ayýdýr”
		// yazdýrýn.
		// Bu isimlerin dýþýndaki isimler için “Geçersiz ay ismi” yazdýrýn.

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir ay ismini giriniz");
		String ay = scan.next().toLowerCase();

		switch (ay) {

		case "ocak":
		case "mart":
		case "mayýs":
		case "temmuz":
		case "agustos":
		case "ekim":
		case "aralýk":
			System.out.println(ay + " ayý 31 gündür");
			break;
		case "nisan":
		case "haziran":
		case "eylül":
		case "kasým":
			System.out.println(ay + " ayý 30 gündür");
			break;
		case "subat":
			System.out.println(ay + " ayý 28 gündür. 4 yýlda bir 29 ceker");
			break;
		default:
			System.out.println("Geçersiz ay ismi");

		}

		scan.close();
	}

}
