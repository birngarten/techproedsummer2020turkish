package day11odevforloop;

import java.util.Scanner;

public class OdevForLoop03 {

	public static void main(String[] args) {

		// 3) Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve
		// ba�lang�� de�erinden veya sonras�ndan ba�lay�p biti� de�erinde veya �ncesinde
		// biten t�m 3 ile b�l�nebilen tamsay�lar� ekrana yazd�r�n.

		Scanner scan = new Scanner(System.in);

		System.out.println("Baslangic degerini giriniz");
		int num1 = scan.nextInt();

		System.out.println("Bitis degerini giriniz");
		int num2 = scan.nextInt();

		for (int i=num1; i<=num2 ; i++) {
			if (i%3==0)	
				System.out.print(i + " ");
		}
		scan.close();
	}

}
