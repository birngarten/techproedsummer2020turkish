package day15methodcreation;

import java.util.Scanner;

public class OdevMethodCreation02 {

	public static void main(String[] args) {
		// Kullanýcýdan iki sayý alýn bu sayýlar eþit ise ekrana “Eþit”,
		// birinci sayý büyük ise ekrana “Birinci sayý büyük”,
		// ikinci sayý büyük ise ekrana “Ikinci sayý büyük” yazdýrýnýz.

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
