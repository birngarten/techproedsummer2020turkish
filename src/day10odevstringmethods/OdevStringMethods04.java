package day10odevstringmethods;

import java.util.Scanner;

public class OdevStringMethods04 {

	public static void main(String[] args) {

		// Kullan�c�dan ya�ad��� �lkenin ismini al�n bu �lkenin ismi Amerika ise ekrana
		// USA, Ingiltere ise ekrana UK, 
		// Almanya ise ekrana DE yazd�r�n. Di�er �lkeler i�in ise NA yazd�r�n.
		

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
