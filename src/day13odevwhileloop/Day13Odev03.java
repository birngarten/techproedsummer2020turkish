package day13odevwhileloop;

import java.util.Scanner;

public class Day13Odev03 {

	public static void main(String[] args) {

		// 3) Kullanýcýdan bir sayý alýn ve bu sayýnýn bölenlerini ekrana yazdýrýnýz.
		// Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.

		Scanner scan = new Scanner(System.in);

		System.out.println("Pozitif bir sayi giriniz");

		int num = scan.nextInt();

		// For Loop ile cozum:
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}

		// While Loop ile cozum:
		System.out.println();
		int i = 1;
		while (i <= num) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		scan.close();
	}

}
