package day10odevstringmethods;

import java.util.Scanner;

public class OdevStringMethods03 {

	public static void main(String[] args) {

		//3)Kullan�c�dan ilk ve soy ismini al�n ilk ve soy isminin ilk harflerini b�y�k harf olarak ekrana yazd�r�n.

		Scanner scan = new Scanner(System.in);

		System.out.println("�sminizi giriniz");
		String name = scan.next().toUpperCase();
		System.out.println(name.substring(0, 1)); //�smin ilk harfini BUYUK yazar.
		
		System.out.println("Soyisminizi giriniz");
		String lastName = scan.next().toUpperCase();
		System.out.println(lastName.substring(0,1)); //Soyismin ilk harfini BUYUK yazar 
		
		System.out.println(name.substring(0, 1) + lastName.substring(0,1)); //�smin ve soyismin ilk harflerini yanyana BUYUK g�sterir.
		
		scan.close();
	}

}
