package day11odevforloop;

import java.util.Scanner;

public class OdevForLoop05 {

	public static void main(String[] args) {

		// 5) Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve
		// ba�lang�� de�erinden ba�lay�p biti� de�erinde biten
		// t�m tamsay�lar�n �arp�m�n� ekrana yazd�r�n.

		Scanner scan = new Scanner(System.in);

		System.out.println("Baslangic degerini giriniz");
		int num1 = scan.nextInt();

		System.out.println("Bitis degerini giriniz");
		int num2 = scan.nextInt();

		int prod = 1;

		for (int i = num1; i <= num2; i++) {
			prod = prod * i;
		}
		System.out.println("Sonuc = " + prod);

		scan.close();

	}

}
