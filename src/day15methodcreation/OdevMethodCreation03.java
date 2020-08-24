package day15methodcreation;

import java.util.Scanner;

public class OdevMethodCreation03 {

	public static void main(String[] args) {

		// Kullanýcýya sayý girmesini söyleyin.
		// Kullanýcýnýn girdiði sayýnýn rakamlarý toplamýný
		// ekrana yazdýran bir program yazýn

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");

		int num = scan.nextInt();
		int sum = 0;

		rakamToplam(num, sum);

		scan.close();

	}

	public static void rakamToplam(int num, int sum) {

		while (num !=0) {		// sayý 0 olmasýn ki rakam toplamý olsun.
			sum = sum + (num % 10);
			num = num / 10;
		}
		System.out.println(sum);
	}

}
