package day07odev;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//1)Kullan�c�dan cinsiyetini girmesini isteyin.
		//Erkek ise ya��n� kontrol edin. Ya�� 18 den k���k ise ekrana �Erkek �ocuk� yazd�r�n.
		//Ya�� 18 den b�y�k e�it ise ekrana �Adam� yazd�r�n.
		//Kadin ise yasini kontrol edin. Ya�� 18 den k���k ise ekrana �K�z �ocuk� yazd�r�n.
		//Ya�� 18 den b�y�k e�it ise ekrana �Kad�n� yazd�r�n.
		
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
