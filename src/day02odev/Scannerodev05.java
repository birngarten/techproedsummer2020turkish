package day02odev;

import java.util.Scanner;

public class Scannerodev05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/* 6) Kenar uzunluklar� kullan�c�dan al�nan bir ��genin �evresini hesaplayan bir
		Program yaz�n�z. (byte kullan�n�z)
		//Not 1: ��genin Cevresi: a + b + c */
		
		System.out.println("Lutfen bir ��genin �evresini hesaplayan bir program yaziniz!");
		
		byte ucgenkenara = scan.nextByte();
		byte ucgenkenarb = scan.nextByte();
		byte ucgenkenarc = scan.nextByte();
		
		System.out.println(ucgenkenara + ucgenkenarb + ucgenkenarc);
		
		scan.close();
	}

}
