package day07odev;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//1)Kullanýcýdan cinsiyetini girmesini isteyin.
		//Erkek ise yaþýný kontrol edin. Yaþý 18 den küçük ise ekrana “Erkek çocuk” yazdýrýn.
		//Yaþý 18 den büyük eþit ise ekrana “Adam” yazdýrýn.
		//Kadin ise yasini kontrol edin. Yaþý 18 den küçük ise ekrana “Kýz çocuk” yazdýrýn.
		//Yaþý 18 den büyük eþit ise ekrana “Kadýn” yazdýrýn.
		
		System.out.println("Cinsiyetinizi Girin");
		
		String cinsiyet = scan.next();
		
		System.out.println("Yasinizi Girin");
		int yas = scan.nextInt();
				
		if(cinsiyet.equalsIgnoreCase("erkek")) {
			if(yas < 18) {
				System.out.println("Erkek Cocuk");
			}else if(yas>=18) {
				System.out.println("Adam");
			}	
		}
		if(cinsiyet.equalsIgnoreCase("kadin")) {
			if(yas<18) {
				System.out.println("Kiz Cocuk");
			}else if(yas>=18) {
				System.out.println("Kadin");
			}
		}else if( yas<0) {
			System.out.println("Negatif yas olamaz");
		}
		scan.close();
	}
}
