package day02odev;

import java.util.Scanner;

public class Scannerodev07 {
	
	public static void main(String[]args) {
		
				
		Scanner scan = new Scanner(System.in);
		
		/* 8) Saati saniyeye çeviren bir program yazýnýz. (long kullanýnýz)
		Not 1: Saniye = Saat x 60 x 60 */
		
		System.out.println("Lutfen Saati saniyeye ceviren bir program yaziniz!");
		
		long saatkacsaniye = scan.nextLong();
		
		System.out.println(saatkacsaniye * 60 *60);
		
		scan.close();
	}
}
