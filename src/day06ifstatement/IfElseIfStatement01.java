package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {


		// KUllanicidan yasini alin.
		// 13 den az ise "Calisamaz", yazdirin.
		// 13 den 65 e kadar ise "Calýþabilir" yazdýrýn.
		// 65 buyukse "Emekli" yazdýrýn.
		// Negatif sayi girerse "Yas Negatif Olamaz" desin
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Yasinizi giriniz");
		int yas = scan.nextInt();
		
		if (yas<0) {
			System.out.println("Yas Negatif Olamaz");
		}else if (yas<13) {
			System.out.println("Calisamaz");
			
		}else if(yas<=65) {
			System.out.println("Calisabilir");
		}else {
			System.out.println("Emekli");
		}
					
		scan.close();
	}

}
