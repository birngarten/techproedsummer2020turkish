package day08odevternaryoperation;

import java.util.Scanner;

public class OdevTernaryOperation01 {

	public static void main(String[] args) {

		// Soru 1) Kullan�c�dan bir tamsay� girmesini isteyin,
		// tamsay� �ift ise ekrana ��ift� tek ise ekrana �Tek� yazd�r�n.

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir Tam Sayi Griniz!");

		int num = scan.nextInt();

		String result = (num % 2 == 0) ? "Cift" : "Tek";
		System.out.println(result);

		scan.close();
	}
}
