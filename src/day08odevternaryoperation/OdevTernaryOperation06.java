package day08odevternaryoperation;

import java.util.Scanner;

public class OdevTernaryOperation06 {

	public static void main(String[] args) {

		// Soru 6) Kullanýcýdan bir yýl girmesini isteyin,
		// yýl artýk yýl ise ekrana “Artýk yýl”
		// degilse ekrana “Artýk yýl degil” yazdýrýn.

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir yil giriniz");
		int year = scan.nextInt();

		String result = ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) ? "Artýk Yýl" : "Artýk Yýl Degil";
		System.out.println(year + " " + result);

		scan.close();
	}
}
