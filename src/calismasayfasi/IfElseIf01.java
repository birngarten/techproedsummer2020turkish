package calismasayfasi;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {


				// KUllanicidan yasini alin.
				// 13 den az ise "Calisamaz", yazdirin.
				// 13 den 65 e kadar ise "Calýþabilir" yazdýrýn.
				// 65 buyukse "Emekli" yazdýrýn.
				// Negatif sayi girerse "Yas Negatif Olamaz" desin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen yaþýnýzý giriniz");
		
		int age = scan.nextInt();
		
		if(age<0){
			System.out.println("Yaþ Negatif Olamaz");
			
		}else if (age<13) {
			System.out.println("Çalýþamaz");
			
		}else if ((age>= 13) && (age<= 65)) {
			System.out.println("Çalýþabilir");
			
		}else if (age>65) {
			System.out.println("Emekli");
			
		}
		
		scan.close();

	}

}
