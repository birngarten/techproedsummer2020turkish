package day06odev;

import java.util.Scanner;

public class IfElseIf04 {

	public static void main(String[] args) {
		
		//4) Kullanýcýdan bir yýl alýn eðer yýl 1000’e bulunuyorsa ekrana “Milenyum” yazdýrýn.
		//Eðer yýl 100’e bulunuyorsa ekrana “Yüzyýl” yazdýrýn.
		//Eðer yýl 10’a bulunuyorsa ekrana “Onyýl” yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ekrana bir yil giriniz");
		
		int yil = scan.nextInt();
		
		if (yil%1000==0 ) {
			System.out.println("Milenyum");
			
		}else if (yil%100==0) {
			System.out.println("Yuzyil");
			
		}else if (yil%10==0) {
			System.out.println("Onyýl");
			
		}else {
			System.out.println("Diger Yýllar");
		}
		
		scan.close();
	}

}
