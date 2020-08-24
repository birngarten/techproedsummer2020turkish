package day08odevternaryoperation;

import java.util.Scanner;

public class OdevTernaryOperation01 {

	public static void main(String[] args) {

		// Soru 1) Kullanýcýdan bir tamsayý girmesini isteyin,
		// tamsayý çift ise ekrana “Çift” tek ise ekrana “Tek” yazdýrýn.

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir Tam Sayi Griniz!");

		int num = scan.nextInt();

		String result = (num % 2 == 0) ? "Cift" : "Tek";
		System.out.println(result);

		scan.close();
	}
}
