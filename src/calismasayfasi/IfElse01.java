package calismasayfasi;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		
		//Kullanicidan password girmesini isteyin
        //password dogru ise ekrana "Password dogru" yazdirin
        //password yanlis ise ekrana "Password yanlis tekrar deneyin" yazdirin
        //Dogru password = Java2020
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Passwordunuzu Giriniz");
		
		String password = scan.nextLine();
		
		if (password.equals("Java2020")) {
			System.out.println("Password doðru");
			
			 //String'lerin esitligini kontrol ederken
	         //asla "==" sembolu kullanmayin. Onun yerine
	         //"equals()" kullanin
	        
	         //"==" String'in degerini ve adresini kontrol eder
	         //"equals()" ise sadece degerleri kontrol eder.
			
		}else {
			System.out.println("Password yanlýþ");
		}
        
		scan.close();
	}

}
