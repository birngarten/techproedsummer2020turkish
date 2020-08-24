package day10odevstringmethods;

import java.util.Scanner;

public class OdevStringMethods03 {

	public static void main(String[] args) {

		//3)Kullanýcýdan ilk ve soy ismini alýn ilk ve soy isminin ilk harflerini büyük harf olarak ekrana yazdýrýn.

		Scanner scan = new Scanner(System.in);

		System.out.println("Ýsminizi giriniz");
		String name = scan.next().toUpperCase();
		System.out.println(name.substring(0, 1)); //Ýsmin ilk harfini BUYUK yazar.
		
		System.out.println("Soyisminizi giriniz");
		String lastName = scan.next().toUpperCase();
		System.out.println(lastName.substring(0,1)); //Soyismin ilk harfini BUYUK yazar 
		
		System.out.println(name.substring(0, 1) + lastName.substring(0,1)); //Ýsmin ve soyismin ilk harflerini yanyana BUYUK gösterir.
		
		scan.close();
	}

}
