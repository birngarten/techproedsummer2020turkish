package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		//Kullanýcýdan bir sayý alýn, pozitif veya sýfýr ise ekrana "Pozitif veya 0", 
		//sayý negatif ise "Negatif" yazdýrýn
		
		Scanner scan = new Scanner ( System.in);
		
		System.out.println("Bir sayý girin");
		int num = scan.nextInt();
		
		/*if(num >=0) {
			System.out.println("Pozitif");
			
		}else  {
			System.out.println("Negatif");  // if cözüm ile asagýdaki Ternary Operator ayný sonucu verir.
		}*/
		
		//Ternary Operator
		//				 Condition  ==> Soru Isareti(?) 	Condition Dogru ise   Iki Nokta ust uste		Condition Dogru ise
		String sonuc = 	   num>=0			?					"Pozitif veya 0"			:					"Negatif";
		System.out.println(sonuc);
		
		scan.close();
	}

}
