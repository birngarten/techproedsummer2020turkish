package calismasayfasi;

import java.util.Scanner;

public class IfElse03 {

	public static void main(String[] args) {
		
				//Kullanýcýdana alacagý urun miktarini ve fiyatini alalim.
				//Eger kullanýcý 1000 den fazla urun alirsa %20 indirim yapan ve kullanýcýn odeyecegi 
				// toplam fiyati ekrana yazdirin.
				// 1000 den az  veya 1000 urun alýrsa indirim yapmayin.
				// Para konularýnda double kullanýn
				// Ornek : 60 TL ye %20 indirim ==> 60*80/100
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen alacaðýnýzýn ürünün miktarýný giriniz");
		double miktar = scan.nextDouble();
		
		System.out.println("Lütfen fiyatý giriniz");
		double fiyat = scan.nextDouble();
		
		if (miktar>1000) {
			System.out.println(miktar*fiyat*80/100);
			
		}else {
			System.out.println(fiyat*miktar);
		}
		
		scan.close();
	}

}
