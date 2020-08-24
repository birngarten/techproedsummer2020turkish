package day13odevwhileloop;

import java.util.Scanner;

public class Day13Odev02 {

	public static void main(String[] args) {

		// 2)Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve
		// baþlangýç deðerinden baþlayýp bitiþ deðerinde biten 3 ve 5 ile bölünebilen
		// tüm tamsayýlarý ekrana yazdýrýnýz.

		Scanner scan = new Scanner(System.in);

		System.out.println("Baslangic degerini giriniz");
		int num1 = scan.nextInt();

		System.out.println("Bitis degerini giriniz");
		int num2 = scan.nextInt();

		//For Loop ile cozum:
		for(int i=num1; i<num2; i++) {
			if(i%5==0 && i%3==0) {
				System.out.print(i);
			}
		}

		// While Loop ile cozum:

		int num3 = scan.nextInt();
		int num4 = scan.nextInt();

		while (num3 <= num4) {
			if (num3 % 3 == 0 && num3 % 5 == 0) {
				System.out.print(num3 + " ");

			}
			num3++;
		}
		
		
		scan.close();
	}

}
