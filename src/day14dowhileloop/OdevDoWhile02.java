package day14dowhileloop;

import java.util.Scanner;

public class OdevDoWhile02 {

	public static void main(String[] args) {

		// Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve
		// ba�lang�� de�erinden ba�lay�p biti� de�erinde biten 4 ve 6 ile b�l�nebilen
		// t�m tamsay�lar� ekrana yazd�r�n�z

		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic degerini giriniz");
		int erst = scan.nextInt();
		System.out.println("Bitis degerini giriniz");
		int end = scan.nextInt();

		do {
			if (erst % 4 == 0 && erst % 6 == 0) {
				System.out.print(erst + " ");
			}
			erst++;
		} while (erst < end);

		scan.close();

	}

}
