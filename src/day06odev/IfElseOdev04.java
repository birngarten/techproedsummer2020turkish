package day06odev;

import java.util.Scanner;

public class IfElseOdev04 {

	public static void main(String[] args) {

		//4) Kullan�c�dan bir character al�n e�er character bir harf ise ekrana �Harf� yazd�r�n.
		//Di�er durumlarda ekrana �Harf de�il� yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen ekrana bir karakter girin");
		
		
		char harf = scan.next().charAt(0);
		int asciiDegeri = (int)harf;
		
		if ((asciiDegeri >= 65 && asciiDegeri <= 90) || (asciiDegeri >= 97 && asciiDegeri <= 122)) {
			System.out.println("HARF");
		} else {
			System.out.println("Harf Degil");
		}

		//ODER
		
//		char ch= scan.next().charAt(0);
//		
//		if(ch>='a'&& ch<='z'||ch>='A'&& ch<='Z') {
//			System.out.println("harf");
//		}else {
//			
//			System.out.println("harf de�il");
		
//		}
		scan.close();
	}

}
