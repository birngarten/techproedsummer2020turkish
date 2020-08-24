package day02odev;

import java.util.Scanner;

public class Scannerodev05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/* 6) Kenar uzunluklarý kullanýcýdan alýnan bir üçgenin çevresini hesaplayan bir
		Program yazýnýz. (byte kullanýnýz)
		//Not 1: Üçgenin Cevresi: a + b + c */
		
		System.out.println("Lutfen bir üçgenin çevresini hesaplayan bir program yaziniz!");
		
		byte ucgenkenara = scan.nextByte();
		byte ucgenkenarb = scan.nextByte();
		byte ucgenkenarc = scan.nextByte();
		
		System.out.println(ucgenkenara + ucgenkenarb + ucgenkenarc);
		
		scan.close();
	}

}
