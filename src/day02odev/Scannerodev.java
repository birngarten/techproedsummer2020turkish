package day02odev;

import java.util.Scanner;

public class Scannerodev {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*1) Kullan�c�dan karenin kenar uzunlu�unu alan ve sonra bu karenin alan ve
		�evresini hesaplay�p ekrana yazd�ran bir program yaz�n�z.
		Not: Alan: Boy x En
		Not: �evre: 2x (Boy + En)*/
		
		System.out.println("Lutfen karenin kare ve cevresini hesapla!");
		
		int kenaruzunlugu = scan.nextInt();
		
		
		System.out.println(kenaruzunlugu + kenaruzunlugu + kenaruzunlugu + kenaruzunlugu);
		System.out.println(kenaruzunlugu * kenaruzunlugu);
		
		scan.close();
	}

}
