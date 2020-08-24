package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {

		// Kullanýcýdan bir character girmesini isteyiniz.
		// Character harf ise kucuk harf olup olmadýgýný kontrolediniz.
		// Kucuk harf ise ekrana "kucuk Harf" yazdýrýnýz
		// Buyuk harf ise "Buyuk Harf" yazdýrýnýz
		// harf degilse "Harf Degil" yazdýrýnýz.

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir karakter giriniz");
		// harf<= 122

		char ch = scan.next().charAt(0);

		String result = (ch>='a' &&ch<='z') ? "Kucuk Harf" : ch>='A' && ch<='Z'? "Buyukk Harf": "harf deðil";
		System.out.println(result);

		scan.close();
	}

}
