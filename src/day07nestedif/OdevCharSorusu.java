package day07nestedif;

import java.util.Scanner;

public class OdevCharSorusu {

	public static void main(String[] args) {
		
		//4) Kullan�c�dan bir character al�n e�er character bir harf ise ekrana �Harf� yazd�r�n.
		//Di�er durumlarda ekrana �Harf de�il� yazd�r�n.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Bir Chatecter girin");
		
		char harf = scan.next().charAt(0); //KULLANICIDAN char almak i�in next().charAt(0) kullan�labilir.
		
		if((harf<= 122 && harf >=97) || (harf<=90 && harf>=65)) {
			System.out.println("Bu bir harftir");
			
		}else {
			System.out.println("Bu bir harf de�ildir");
		}
		
		scan.close();
	}

}
