package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {

		// Kullan�c�dan bir character girmesini isteyiniz.
		// Character harf ise kucuk harf olup olmad�g�n� kontrolediniz.
		// Kucuk harf ise ekrana "kucuk Harf" yazd�r�n�z
		// Buyuk harf ise "Buyuk Harf" yazd�r�n�z
		// harf degilse "Harf Degil" yazd�r�n�z.

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir karakter giriniz");
		// harf<= 122

		char ch = scan.next().charAt(0);

		String result = (ch>='a' &&ch<='z') ? "Kucuk Harf" : ch>='A' && ch<='Z'? "Buyukk Harf": "harf de�il";
		System.out.println(result);

		scan.close();
	}

}
