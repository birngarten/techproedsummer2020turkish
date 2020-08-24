package java_review_turkish;

import java.util.Scanner;

public class Day11Practice04 {

	public static void main(String[] args) {
		

		// Kullanýcýdan bir sayý girmesini isteyiniz
				
		// Sayý tek sayý ise "Sayýnýz tek sayýdýr."
		// Sayý çift sayý ise "Sayýnýz çift sayýdýr." yazdýrýnýz"
				
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Bir sayi giriniz");
		int num = scan.nextInt();
		
		if (num %2 != 0) {
			System.out.println("Sayýnýz tek sayýdýr");
			
		}else {
			System.out.println("Sayýnýz cift sayýdýr");
		}*/
		System.out.println("Bir sayý giriniz");
		int num = scan.nextInt();
		String result = (num %2 != 0) ? "Sayýnýz tek sayýdýr" : "Sayýnýz cift sayýdýr";
		System.out.println(result);
		
		scan.close();
	}

}
