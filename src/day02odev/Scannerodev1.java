package day02odev;

import java.util.Scanner;

public class Scannerodev1 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		/*2) Kullan�c�dan al�nan bir say�n�n k�p�n� hesaplayan bir program yaz�n�z.
		//Not: a� n�n k�p�: a x a x a */
		
		System.out.println("Lutfen 5 sayisinin kupunu hesaplay�n");
		
		int kup5 = scan.nextInt();
		System.out.println(kup5*kup5*kup5);
		
		scan.close();
	}

}
