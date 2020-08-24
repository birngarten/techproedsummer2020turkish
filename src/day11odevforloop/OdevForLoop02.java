package day11odevforloop;

import java.util.Scanner;

public class OdevForLoop02 {

	public static void main(String[] args) {

		// 2) Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve
		// baþlangýç deðerinden veya sonrasýndan baþlayýp bitiþ deðerinde veya öncesinde
		// biten tüm çift tamsayýlarý ekrana yazdýrýn.

		Scanner scan = new Scanner(System.in);

		System.out.println("Baslangic degeriniz giriniz");
		int bas = scan.nextInt();

		System.out.println("Bitis degeriniz giriniz");
		int son = scan.nextInt();

		if (bas % 2 != 0) {
			bas = bas + 1;
		}
		if (son % 2 != 0) {
			son = son - 1;
		}
		for (int i = bas; i <= son; i += 2)
			System.out.print(i + " ");
		scan.close();

	}

}
