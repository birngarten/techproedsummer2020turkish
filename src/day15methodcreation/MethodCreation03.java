package day15methodcreation;

import java.util.Scanner;

public class MethodCreation03 {

	public static void main(String[] args) {
		// Hesap Makinas�
		// Kullan�c�dan yapacagi i�lemi i�lem sembol� ile secmesini saglayal�m.
		// Kullan�c�dan iki say� girmesini isteyelim
		// Girilen say�lar ve secilen i�leme g�re dogru sonucu ekrana yazal�m.

		Scanner scan = new Scanner(System.in);
		System.out.println("+, -, x, : islemlerinden birini seciniz");
		char islem = scan.next().charAt(0);
		System.out.println("Islem yapmak icin iki sayi giriniz");

		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();

		hesapMakinasi(islem, num1, num2);

		scan.close();
	}

	public static void hesapMakinasi(char islem, double num1, double num2) {

		switch (islem) {

		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case 'x':
			System.out.println(num1 * num2);
			break;
		case ':':
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("+, -, x, : d�s�nda sembol girmeyiniz");
		}
	}

}
