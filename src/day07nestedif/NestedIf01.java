package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {


		//Kullan�c�dan bir say� al�n.
		// Bu say� pozitif veya s�f�r ise 9 dan buyuk mu diye kontrol edin, 9 dan buyukse ekrana "Say�" yazd�r�n
		// 9 dan kucuk esit ve 0 dan buyuk esit ise ekrana "Rakam" yazd�r�n.
		// Bu say� negatif ise ekrana "Say�" yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir tam sayi giriniz");
		int num = scan.nextInt();
		
		if(num>=0) { //Bu if ten else if e kadar olan k�s�m NestedIf dir. Nested yuva demek. if yuvas�nda yeni bir if.
			
			if(num>9) { 
				System.out.println("Sayi");
				
			}else if(num<=9 && num>=0) {
				System.out.println("Rakam");
			}
				
		}else if(num<0) {
			System.out.println("Sayi");
		}	
		
		scan.close(); //Scanner Class'�n� kulland�ktan sonra main method'un i�inde Scanner Class'�
					 // scan.close(); ile kapatmak laz�m.

	}
}
