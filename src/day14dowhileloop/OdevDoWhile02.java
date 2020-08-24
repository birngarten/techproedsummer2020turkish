package day14dowhileloop;

import java.util.Scanner;

public class OdevDoWhile02 {

	public static void main(String[] args) {

		// Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve
		// baþlangýç deðerinden baþlayýp bitiþ deðerinde biten 4 ve 6 ile bölünebilen
		// tüm tamsayýlarý ekrana yazdýrýnýz

		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic degerini giriniz");
		int erst = scan.nextInt();
		System.out.println("Bitis degerini giriniz");
		int end = scan.nextInt();

		do {
			if (erst % 4 == 0 && erst % 6 == 0) {
				System.out.print(erst + " ");
			}
			erst++;
		} while (erst < end);

		scan.close();

	}

}
