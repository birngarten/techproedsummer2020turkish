package day02odev;

import java.util.Scanner;

public class Scannerodev03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/* 4) Boyutlarý kullanýcýdan alýnan bir dikdörtgenler prizmasýnýn hacmini hesaplayan bir
			program yazýnýz.
			Not: Dikdörtgenler Prizmasýnýn Hacmi: En x Boy x Yükseklik */
		
		System.out.println(" Lutfen bir dikdörtgenler prizmasýnýn hacmini hesaplayan bir program yazýnýz! ");
		
		int endikdortgen = scan.nextInt();
		int boydikdortgen = scan.nextInt();
		int yukseklikdikdortgen = scan.nextInt();
		
		System.out.println(endikdortgen * boydikdortgen * yukseklikdikdortgen);
		
		scan.close();

	}

}
