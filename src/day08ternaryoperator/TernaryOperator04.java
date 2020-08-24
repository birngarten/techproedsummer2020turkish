package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator04 {

	public static void main(String[] args) {

		// Ternary Operator (If Else If) (Nested Ternary)

		// Kullan�c�dan bir say� al�n�z.
		// Say� 0 dan buyuk esit ise 10 dan kucuk olup olmad�g�n� kontrol ediniz.
		// 10 dan kucuk ise ekrana "rakam" , degilse "pozitif say�" yazd�r�n
		// 0 dan kucuk ise ekrana "negatif say�" yazd�r�n.

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir say� giriniz.");
		double num = scan.nextDouble();

		String result = num >= 0 ? (num < 10 ? "Rakam" : "Pozitif Say�") : "Negatif Say�";
		System.out.println(result);

		scan.close();
	}

}
