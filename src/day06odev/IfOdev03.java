package day06odev;

import java.util.Scanner;

public class IfOdev03 {

	public static void main(String[] args) {
		
		//3) Kullan�c�dan bir gun al�n e�er gun �Cuma� ise ekrana �M�sl�manlar icin kutsal g�n� yazd�r�n.
		//�Cumartesi� ise ekrana �Yahudiler icin kutsal g�n� yazd�r�n. 
		//�Pazar� ise ekrana �H�ristiyanlar icin kutsal g�n� yazd�r�n
		//Diger g�nler icin ekrana "Kutsal gun degil" yazd�r�n
		
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Gun ismi girin");
		
		String day = scan.nextLine();
		
		if (day.equalsIgnoreCase("Cuma")) {  //equalsIgnoreCase() b�y�k, k���k harf dikkate almadan esitlige bakar.
															//equalsIgnoreCase() icin Cuma = cuma =CUMA = CumA ayn� kabul eder
			System.out.println("M�sl�manlar icin kutsal g�n");
			
		}
		if (day.equalsIgnoreCase("Cumartesi")) {
			System.out.println("Yahudiler icin kutsal g�n");
			
		}
		if (day.equalsIgnoreCase("Pazar")) {
			System.out.println("Hristiyanlar icin kutsal g�n");
			
		
		}else {
			System.out.println("Kutsal gun degil");
		}
		
		scan.close();
	}

}
