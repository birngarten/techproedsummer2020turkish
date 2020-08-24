package day13odevwhileloop;

import java.util.Scanner;

public class Day13Odev04 {

	public static void main(String[] args) {
		
		// 4) Kullanýcýdan uzunluðu çift sayý olan bir String alýn ve 
		//bu String’in ilk yarýsýný ekrana yazdýrýn. 
		//Ornegin; Kullanýcý “Hollanda” girerse ekrana “Holl” yazdýracaksýnýz.
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Bir cümle veya kelime girin");

		String str= scan.nextLine();
		
		if( str.length()%2==0) {
			System.out.println(str.substring(0,str.length()/2));
		}else {
			System.out.println("Girdiginiz kelime veya cümle cift karakterli olmalýdýr");
		}
		scan.close();
	}

}
