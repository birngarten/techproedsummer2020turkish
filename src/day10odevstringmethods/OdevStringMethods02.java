package day10odevstringmethods;

import java.util.Scanner;

public class OdevStringMethods02 {

	public static void main(String[] args) {
		
		//2) Kullan�c�dan ilk ve soy ismini al�n ilk ve soy isminin ka� harften olu�tu�unu ekrana yazd�r�n.
		
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
