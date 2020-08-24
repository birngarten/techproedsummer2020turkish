package day15methodcreation;

import java.util.Scanner;

public class OdevMethodCreation02 {

	public static void main(String[] args) {
		// Kullan�c�dan iki say� al�n bu say�lar e�it ise ekrana �E�it�,
		// birinci say� b�y�k ise ekrana �Birinci say� b�y�k�,
		// ikinci say� b�y�k ise ekrana �Ikinci say� b�y�k� yazd�r�n�z.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen birinci sayiyi giriniz");
		double num1 = scan.nextDouble();
		System.out.println("Lutfen ikinci sayiyi giriniz");
		double num2 = scan.nextDouble();

		sayilar(num1, num2);

		scan.close();

	}

	public static void sayilar(double num1, double num2) {

		if (num1 == num2) {
			System.out.println("Sayilar esit");

		} else if (num1 > num2) {
			System.out.println("Birinci sayi buyuk");

		} else {
			System.out.println("Ikinci sayi buyuk");
		}
	}

}
