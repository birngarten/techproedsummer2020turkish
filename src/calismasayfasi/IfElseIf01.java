package calismasayfasi;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {


				// KUllanicidan yasini alin.
				// 13 den az ise "Calisamaz", yazdirin.
				// 13 den 65 e kadar ise "Cal��abilir" yazd�r�n.
				// 65 buyukse "Emekli" yazd�r�n.
				// Negatif sayi girerse "Yas Negatif Olamaz" desin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen ya��n�z� giriniz");
		
		int age = scan.nextInt();
		
		if(age<0){
			System.out.println("Ya� Negatif Olamaz");
			
		}else if (age<13) {
			System.out.println("�al��amaz");
			
		}else if ((age>= 13) && (age<= 65)) {
			System.out.println("�al��abilir");
			
		}else if (age>65) {
			System.out.println("Emekli");
			
		}
		
		scan.close();

	}

}
