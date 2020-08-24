package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		/*Kullanýcý karenin bir kenar uzunluðu girsin
		Karenin cevresini ve alanýný ekrana yazdýralým
		Karenin çevresi a+a+a+a, alaný a*a
		*/
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz");
		
		int kenarUzunlugu = scan.nextInt();
		
		System.out.println(kenarUzunlugu + kenarUzunlugu + kenarUzunlugu + kenarUzunlugu); /* ÖNEMLÝ: Alttaki Console da sayý yazýp Enter'a bastýðýmýzda, sonuç çýkar*/
		System.out.println(kenarUzunlugu * kenarUzunlugu);
	
		scan.close();
		
	}

}
