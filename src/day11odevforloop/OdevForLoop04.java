package day11odevforloop;

import java.util.Scanner;

public class OdevForLoop04 {

	public static void main(String[] args) {
		// 4) Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve
		// ba�lang�� de�erinden ba�lay�p biti� de�erinde biten
		// t�m tamsay�lar�n toplam�n� ekrana yazd�r�n.

		Scanner scan = new Scanner(System.in);

		System.out.println("Baslangic degerini giriniz");
		int num1 = scan.nextInt();

		System.out.println("Bitis degerini giriniz");
		int num2 = scan.nextInt();

		int sum = 0;

		for (int i = num1; i <= num2; i++) {
			sum = sum + i;
		}
		System.out.println("Toplam = " + sum);

		scan.close();
	}

}
