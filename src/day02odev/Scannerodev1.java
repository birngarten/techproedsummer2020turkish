package day02odev;

import java.util.Scanner;

public class Scannerodev1 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		/*2) Kullanýcýdan alýnan bir sayýnýn küpünü hesaplayan bir program yazýnýz.
		//Not: a’ nýn küpü: a x a x a */
		
		System.out.println("Lutfen 5 sayisinin kupunu hesaplayýn");
		
		int kup5 = scan.nextInt();
		System.out.println(kup5*kup5*kup5);
		
		scan.close();
	}

}
