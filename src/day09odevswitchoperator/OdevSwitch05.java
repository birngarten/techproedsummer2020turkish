package day09odevswitchoperator;

import java.util.Scanner;

public class OdevSwitch05 {

	public static void main(String[] args) {

		// Kullan�c�dan A, B, C, D harflerinden birini al�n e�er harf C ise ekrana
		// �Do�ru cevap� yazd�r�n.
		// A, B, D den biri ise ekrana �Yanl�� cevap� yazd�r�n.
		// Bu harflerin d���ndaki harfler i�in �Ge�ersiz cevap ��kk�� yazd�r�n.

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir harf giriniz");
		char ch = scan.next().charAt(0);

		switch (ch) {

		case 'C':
			System.out.println("Dogru cevap");
			break;
		case 'A':
			System.out.println("Yanlis cevap");
			break;
		case 'B':
			System.out.println("Yanlis cevap");
			break;
		case 'D':
			System.out.println("Yanlis cevap");
			break;
		default:
			System.out.println("Ge�ersiz cevap ��kk�");

		}
		scan.close();
	}

}
