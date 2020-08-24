package day06odev;

import java.util.Scanner;

public class IfOdev03 {

	public static void main(String[] args) {
		
		//3) Kullanýcýdan bir gun alýn eðer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdýrýn.
		//“Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdýrýn. 
		//“Pazar” ise ekrana “Hýristiyanlar icin kutsal gün” yazdýrýn
		//Diger günler icin ekrana "Kutsal gun degil" yazdýrýn
		
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Gun ismi girin");
		
		String day = scan.nextLine();
		
		if (day.equalsIgnoreCase("Cuma")) {  //equalsIgnoreCase() büyük, küçük harf dikkate almadan esitlige bakar.
															//equalsIgnoreCase() icin Cuma = cuma =CUMA = CumA ayný kabul eder
			System.out.println("Müslümanlar icin kutsal gün");
			
		}
		if (day.equalsIgnoreCase("Cumartesi")) {
			System.out.println("Yahudiler icin kutsal gün");
			
		}
		if (day.equalsIgnoreCase("Pazar")) {
			System.out.println("Hristiyanlar icin kutsal gün");
			
		
		}else {
			System.out.println("Kutsal gun degil");
		}
		
		scan.close();
	}

}
