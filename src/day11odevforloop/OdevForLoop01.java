package day11odevforloop;

import java.util.Scanner;

public class OdevForLoop01 {

	public static void main(String[] args) {

		// 1)Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve
		// ba�lang�� de�erinden ba�lay�p biti� de�erinde biten
		// t�m tamsay�lar� ekrana yazd�r�n.

		Scanner scan = new Scanner(System.in);

		System.out.println("Baslangic sayisini giriniz");
		int i1 = scan.nextInt();
		System.out.println("Bitis sayisini giriniz");
		int i2 = scan.nextInt();

		for (int i = i1; i < i2; i++) {
			System.out.print(i + " ");
		}

		scan.close();

	}

}
