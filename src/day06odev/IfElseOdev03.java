package day06odev;

import java.util.Scanner;

public class IfElseOdev03 {

	public static void main(String[] args) {
		
		//3) Kullanýcýdan alacaðý ürün miktarýný ve ürünün birim fiyatýný alýn. Eðer urun miktarý 1000 den fazla ise
		//Kullanýcýya %10 indirim yapýn ve ödemesi gereken toplam parayý ekrana yazdýrýn. Diðer durumlarda
		//ödemesi gereken toplam parayý herhangi bir indirim yapmadan ekrana yazdýrýn.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Urun miktarýný giriniz");
		
		int miktar = scan.nextInt();
		
		System.out.println("Birim fiyatýný giriniz");
		int fiyat  = scan.nextInt();
		
		
				
		if (miktar>1000) {
			System.out.println(miktar* (fiyat*90)/100);
			
		}else {
			System.out.println(miktar*fiyat);
		}
		scan.close();
	}

}
