package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator04 {

	public static void main(String[] args) {

		// Ternary Operator (If Else If) (Nested Ternary)

		// Kullanıcıdan bir sayı alınız.
		// Sayı 0 dan buyuk esit ise 10 dan kucuk olup olmadıgını kontrol ediniz.
		// 10 dan kucuk ise ekrana "rakam" , degilse "pozitif sayı" yazdırın
		// 0 dan kucuk ise ekrana "negatif sayı" yazdırın.

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir sayı giriniz.");
		double num = scan.nextDouble();

		String result = num >= 0 ? (num < 10 ? "Rakam" : "Pozitif Sayı") : "Negatif Sayı";
		System.out.println(result);

		scan.close();
	}

}
