package day15methodcreation;

import java.util.Scanner;

public class OdevMethodCreation04 {

	public static void main(String[] args) {

		// Kullan�c�ya paralelkenar, dikd�rtgen ve ��gen kelimelerinden birini ve iki
		// say� se�mesini s�yleyin. Hangi �ekli se�erse, o �eklin alan�n� ve �evresini
		// ekrana yazd�ran program� yaz�n�z.
		//Not: Ucgenin sadece alan�

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir sekil seciniz");
		String sekil = scan.next().toLowerCase();

		System.out.println("Pespese iki sayi giriniz");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
				
		geometriHesaplama(sekil,num1,num2);

		scan.close();
	}
	
	public static void geometriHesaplama(String sekil, double num1, double num2) {
		double cevre = (2*(num1+num2));
		double alan = num1*num2;
		double ucgenAlan= (num1*num2)/2;
		
		switch(sekil) {
		
		case "paralelkenar":
			System.out.println("Pkenar Cevre = "+ cevre);
			System.out.println("pkenar Alan = " + alan);
			break;
		case "dikdortgen":
			System.out.println("Dikdortgen Cevre = "+ cevre);
			System.out.println("Dikdortgen Alan  = "+ alan);
			break;
		case "ucgen":
			System.out.println("Ucgenin Alani = " + ucgenAlan);
			break;
			default:
				System.out.println("Paralelkenar, Dikdortgen veya Ucgen sekillerinden birini seciniz");
				break;
			
		}
				
	}

}
