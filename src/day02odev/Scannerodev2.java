package day02odev;

import java.util.Scanner;

public class Scannerodev2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*Kullan�c�dan dikd�rtgenin boyutlar�n� alan ve sonra dikt�rtgenin alan ve
		cevresini hesaplay�p ekrana yazd�ran bir program yaz�n�z.
		Not: Alan: Boy x En
		Not: �evre: 2x (Boy + En)*/
		
		System.out.println("Lutfen dikdotgenin alan ve cevresini hesaplayin");
		
		int kenaru1 = scan.nextInt();
		int kenaru2 = scan.nextInt();
		
		System.out.println((kenaru1 + kenaru2) * 2);
		System.out.println(kenaru1 * kenaru2);

		scan.close();
	}

}
