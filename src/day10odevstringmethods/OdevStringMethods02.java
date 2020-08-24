package day10odevstringmethods;

import java.util.Scanner;

public class OdevStringMethods02 {

	public static void main(String[] args) {
		
		//2) Kullanýcýdan ilk ve soy ismini alýn ilk ve soy isminin kaç harften oluþtuðunu ekrana yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Isminiz giriniz");
		String name = scan.nextLine();
		System.out.println(name.length());
		
		System.out.println("Soyisminizi giriniz");
		String lastName = scan.nextLine();
		System.out.println(lastName.length());
		
		System.out.println("Toplam : " + (name.length()+ lastName.length()) +" karakter");
		
		
		scan.close();

	}

}
