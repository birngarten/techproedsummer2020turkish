package day10odevstringmethods;

import java.util.Scanner;

public class OdevStringMethods04 {

	public static void main(String[] args) {

		// Kullanýcýdan yaþadýðý ülkenin ismini alýn bu ülkenin ismi Amerika ise ekrana
		// USA, Ingiltere ise ekrana UK, 
		// Almanya ise ekrana DE yazdýrýn. Diðer ülkeler için ise NA yazdýrýn.
		

		Scanner scan = new Scanner(System.in);

		System.out.println("Yasadiginiz Ulkeyi yaziniz");

		String ulke = scan.next().toLowerCase();

		switch (ulke) {

		case "amerika":
			System.out.println("USA");
			break;
		case "ingiltere":
			System.out.println("UK");
			break;
		case "almanya":
			System.out.println("DE");
			break;
		default:
			System.out.println("NA");
		}

		scan.close();
	}

}
