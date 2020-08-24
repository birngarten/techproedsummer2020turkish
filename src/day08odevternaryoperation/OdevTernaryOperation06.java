package day08odevternaryoperation;

import java.util.Scanner;

public class OdevTernaryOperation06 {

	public static void main(String[] args) {

		// Soru 6) Kullan�c�dan bir y�l girmesini isteyin,
		// y�l art�k y�l ise ekrana �Art�k y�l�
		// degilse ekrana �Art�k y�l degil� yazd�r�n.

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir yil giriniz");
		int year = scan.nextInt();

		String result = ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) ? "Art�k Y�l" : "Art�k Y�l Degil";
		System.out.println(year + " " + result);

		scan.close();
	}
}
