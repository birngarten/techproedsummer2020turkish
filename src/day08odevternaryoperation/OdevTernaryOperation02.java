package day08odevternaryoperation;

import java.util.Scanner;

public class OdevTernaryOperation02 {

	public static void main(String[] args) {

		// Soru 2) Kullanýcýdan iki tamsayý girmesini isteyin,
		// ekrana her zaman büyük olanýný yazdýrýn

		Scanner scan = new Scanner(System.in);

		System.out.println("Birinci tamsayiyi giriniz");
		int num1 = scan.nextInt();

		System.out.println("Ýkinci tamsayiyi giriniz");
		int num2 = scan.nextInt();

		int result = (num1 > num2) ? num1 : num2;
		System.out.println(result);
		
		scan.close();
	}
}
