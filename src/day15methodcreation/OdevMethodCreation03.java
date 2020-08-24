package day15methodcreation;

import java.util.Scanner;

public class OdevMethodCreation03 {

	public static void main(String[] args) {

		// Kullan�c�ya say� girmesini s�yleyin.
		// Kullan�c�n�n girdi�i say�n�n rakamlar� toplam�n�
		// ekrana yazd�ran bir program yaz�n

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");

		int num = scan.nextInt();
		int sum = 0;

		rakamToplam(num, sum);

		scan.close();

	}

	public static void rakamToplam(int num, int sum) {

		while (num !=0) {		// say� 0 olmas�n ki rakam toplam� olsun.
			sum = sum + (num % 10);
			num = num / 10;
		}
		System.out.println(sum);
	}

}
