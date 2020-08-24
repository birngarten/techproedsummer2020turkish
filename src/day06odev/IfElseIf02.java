package day06odev;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {

		//2) Kullanýcýdan bir üçgenin üç kenar uzunluðunu alýn eðer üç kenar uzunluðu birbirine eþit ise ekrana
		//“Eþkenar üçgen” yazdýrýn. Sadece iki kenar uzunluðu birbirine eþit ise ekrana “Ikizkenar üçgen”
		//yazdýrýn. Tüm kenar uzunluklarý birbirinden farklý ise “Çeþitkenar üçgen yazdýrýn”
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Ucgenin kenar uzunluklarini giriniz");
		
		double k1 = scan.nextDouble();
		double k2 = scan.nextDouble();
		double k3 = scan.nextDouble();
		
		if (k1==k2 && k2==k3 ) {
			System.out.println("Eskenar Ucgen");
			
		}else if (k1==k2 && k2!=k3||k1==k3 && k1!=k2 ||k2==k3 && k2!=k1) {
			System.out.println("Ikizkenar Ucgen");
			
		}else {
			System.out.println("Cesitkenar Ucgen");
		}
			
		scan.close();
	}

}
