package day11odevforloop;

import java.util.Scanner;

public class OdevForLoop01 {

	public static void main(String[] args) {

		// 1)Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve
		// baþlangýç deðerinden baþlayýp bitiþ deðerinde biten
		// tüm tamsayýlarý ekrana yazdýrýn.

		Scanner scan = new Scanner(System.in);

		System.out.println("Baslangic sayisini giriniz");
		int i1 = scan.nextInt();
		System.out.println("Bitis sayisini giriniz");
		int i2 = scan.nextInt();

		for (int i = i1; i < i2; i++) {
			System.out.print(i + " ");
		}

		scan.close();

	}

}
