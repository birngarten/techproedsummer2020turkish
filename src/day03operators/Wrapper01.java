package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		
		// Kullanici ad ve soyadini alip ekrana yazdir.
		// String kullaniniz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen adinizi ve soyadinizi giriniz!");
		
		String isim = scan.nextLine();  //String'leri kullaniciden almak icin ya next() veya NextLine() kullaniriz.
										// next() tek kelimelik String'ler için 
										//nextLine() birden fazla kelimeler(tum Sitring'leri) için.
		
		System.out.println(isim);
		
		scan.close();
	}

}
