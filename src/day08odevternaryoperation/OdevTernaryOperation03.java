package day08odevternaryoperation;

import java.util.Scanner;

public class OdevTernaryOperation03 {

	public static void main(String[] args) {

		// Soru 3) Kullan�c�dan bir tamsay� girmesini isteyin,
		// ekrana o tamsay�n�n mutlak degerini yazd�r�n.

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir tamsayi giriniz");
		int num = scan.nextInt();

		int result = (num > 0) ? (num * 1) : (num * (-1));
		System.out.println(result);

		scan.close();

	}
}
