package day11odevforloop;

import java.util.Scanner;

public class OdevForLoop03 {

	public static void main(String[] args) {

		// 3) Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve
		// baþlangýç deðerinden veya sonrasýndan baþlayýp bitiþ deðerinde veya öncesinde
		// biten tüm 3 ile bölünebilen tamsayýlarý ekrana yazdýrýn.

		Scanner scan = new Scanner(System.in);

		System.out.println("Baslangic degerini giriniz");
		int num1 = scan.nextInt();

		System.out.println("Bitis degerini giriniz");
		int num2 = scan.nextInt();

		for (int i=num1; i<=num2 ; i++) {
			if (i%3==0)	
				System.out.print(i + " ");
		}
		scan.close();
	}

}
