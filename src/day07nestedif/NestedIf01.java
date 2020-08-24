package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {


		//Kullanýcýdan bir sayý alýn.
		// Bu sayý pozitif veya sýfýr ise 9 dan buyuk mu diye kontrol edin, 9 dan buyukse ekrana "Sayý" yazdýrýn
		// 9 dan kucuk esit ve 0 dan buyuk esit ise ekrana "Rakam" yazdýrýn.
		// Bu sayý negatif ise ekrana "Sayý" yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir tam sayi giriniz");
		int num = scan.nextInt();
		
		if(num>=0) { //Bu if ten else if e kadar olan kýsým NestedIf dir. Nested yuva demek. if yuvasýnda yeni bir if.
			
			if(num>9) { 
				System.out.println("Sayi");
				
			}else if(num<=9 && num>=0) {
				System.out.println("Rakam");
			}
				
		}else if(num<0) {
			System.out.println("Sayi");
		}	
		
		scan.close(); //Scanner Class'ýný kullandýktan sonra main method'un içinde Scanner Class'ý
					 // scan.close(); ile kapatmak lazým.

	}
}
