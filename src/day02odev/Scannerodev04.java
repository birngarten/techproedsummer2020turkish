package day02odev;

import java.util.Scanner;

public class Scannerodev04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*5)Yar��ap� kullan�c�dan al�nan bir dairenin �evresini ve alan�n� hesaplayan
	bir program yaz�n�z. (float kullan�n�z)
	Not 1: pi say�s�: 3.14159
	Not 2: Alan: 3.14159 x radius x radius
	Not 3: Cevre: 2 x 3.14159 x radius */
		
		
		System.out.println("Lutfen bir dairenin �evresini ve alanini hesaplayan bir program yazinin!");
		
		float radius = scan.nextFloat();
		
		System.out.println(3.14159 * radius * radius);
		System.out.println(2* 3.14159 * radius);
		
		scan.close();
	}

}
