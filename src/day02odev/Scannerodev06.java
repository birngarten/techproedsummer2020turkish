package day02odev;

import java.util.Scanner;

public class Scannerodev06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		/* 7) Mil�i kilometreye �eviren bir program yaz�n�z. (double kullan�n�z)
		Not 1: km = mile x 1.6 */
		
		System.out.println("Lutfen Mil�i kilometreye �eviren bir program yaziniz!");
		
		double milekm = scan.nextDouble();
		System.out.println(milekm * 1.6);

		scan.close();
	}

}
