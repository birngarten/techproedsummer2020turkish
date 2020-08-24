package calismasayfasi;

import java.util.Scanner;

public class If05 {

	public static void main(String[] args) {
		
		// Kullanicidan bir dikdortgenin en ve boyunu alin.
        // En ve boy esit ise ekrana "Bu bir karedir" yazdirin
        // En ve boy farkli ise ekrana "Bu bir dikdortgendir" yazdirin
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen iki sayi giriniz");
		
		double en = scan.nextDouble();
		double boy= scan.nextDouble();
		 
		
		if(en == boy ) {
			System.out.println("Bu bir Kare'dir");	
		}
		
		if (en!= boy) {
			System.out.println("Bu bir Dikdörtgen'dir");
			
		}else {
			System.out.println("Böyle bir deger geçersiz");
		}
		
		
		scan.close();

	}

}
