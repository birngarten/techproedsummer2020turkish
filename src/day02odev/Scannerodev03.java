package day02odev;

import java.util.Scanner;

public class Scannerodev03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/* 4) Boyutlar� kullan�c�dan al�nan bir dikd�rtgenler prizmas�n�n hacmini hesaplayan bir
			program yaz�n�z.
			Not: Dikd�rtgenler Prizmas�n�n Hacmi: En x Boy x Y�kseklik */
		
		System.out.println(" Lutfen bir dikd�rtgenler prizmas�n�n hacmini hesaplayan bir program yaz�n�z! ");
		
		int endikdortgen = scan.nextInt();
		int boydikdortgen = scan.nextInt();
		int yukseklikdikdortgen = scan.nextInt();
		
		System.out.println(endikdortgen * boydikdortgen * yukseklikdikdortgen);
		
		scan.close();

	}

}
