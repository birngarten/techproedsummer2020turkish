package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		//Kullan�c�dan bir say� al�n, pozitif veya s�f�r ise ekrana "Pozitif veya 0", 
		//say� negatif ise "Negatif" yazd�r�n
		
		Scanner scan = new Scanner ( System.in);
		
		System.out.println("Bir say� girin");
		int num = scan.nextInt();
		
		/*if(num >=0) {
			System.out.println("Pozitif");
			
		}else  {
			System.out.println("Negatif");  // if c�z�m ile asag�daki Ternary Operator ayn� sonucu verir.
		}*/
		
		//Ternary Operator
		//				 Condition  ==> Soru Isareti(?) 	Condition Dogru ise   Iki Nokta ust uste		Condition Dogru ise
		String sonuc = 	   num>=0			?					"Pozitif veya 0"			:					"Negatif";
		System.out.println(sonuc);
		
		scan.close();
	}

}
