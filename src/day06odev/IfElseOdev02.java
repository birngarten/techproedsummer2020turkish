package day06odev;

import java.util.Scanner;

public class IfElseOdev02 {

	public static void main(String[] args) {
		
		//2) Kullanýcýdan bir üçgenin üç kenar uzunluðunu alýn eðer üç kenar uzunluðu birbirine eþit ise ekrana
		//“Eþkenar üçgen” yazdýrýn. Diðer durumlarda ekrana “Eþkenar deðil” yazdýrýn.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen ücgenin uc kenarýnýn degerlerini giriniz");
		
		double kenar1= scan.nextDouble();
		double kenar2= scan.nextDouble();
		double kenar3= scan.nextDouble();
		
		if (kenar1 == kenar2 && kenar2== kenar3 ) {
			System.out.println("Eskenar Ucgen");
			
		}else {
			System.out.println("Eskenar degil");
		}
		scan.close();
	}

}
