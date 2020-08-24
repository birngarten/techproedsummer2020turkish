package day11odevforloop;

import java.util.Scanner;

public class OdevForLoop04 {

	public static void main(String[] args) {
		// 4) Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve
		// baþlangýç deðerinden baþlayýp bitiþ deðerinde biten
		// tüm tamsayýlarýn toplamýný ekrana yazdýrýn.

		Scanner scan = new Scanner(System.in);

		System.out.println("Baslangic degerini giriniz");
		int num1 = scan.nextInt();

		System.out.println("Bitis degerini giriniz");
		int num2 = scan.nextInt();

		int sum = 0;

		for (int i = num1; i <= num2; i++) {
			sum = sum + i;
		}
		System.out.println("Toplam = " + sum);

		scan.close();
	}

}
