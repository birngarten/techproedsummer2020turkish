package day11odevforloop;

import java.util.Scanner;

public class OdevForLoop02 {

	public static void main(String[] args) {

		// 2) Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve
		// ba�lang�� de�erinden veya sonras�ndan ba�lay�p biti� de�erinde veya �ncesinde
		// biten t�m �ift tamsay�lar� ekrana yazd�r�n.

		Scanner scan = new Scanner(System.in);

		System.out.println("Baslangic degeriniz giriniz");
		int bas = scan.nextInt();

		System.out.println("Bitis degeriniz giriniz");
		int son = scan.nextInt();

		if (bas % 2 != 0) {
			bas = bas + 1;
		}
		if (son % 2 != 0) {
			son = son - 1;
		}
		for (int i = bas; i <= son; i += 2)
			System.out.print(i + " ");
		scan.close();

	}

}
