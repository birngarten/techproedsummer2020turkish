package calismasayfasi;

import java.util.Scanner;

public class IfElse03 {

	public static void main(String[] args) {
		
				//Kullan�c�dana alacag� urun miktarini ve fiyatini alalim.
				//Eger kullan�c� 1000 den fazla urun alirsa %20 indirim yapan ve kullan�c�n odeyecegi 
				// toplam fiyati ekrana yazdirin.
				// 1000 den az  veya 1000 urun al�rsa indirim yapmayin.
				// Para konular�nda double kullan�n
				// Ornek : 60 TL ye %20 indirim ==> 60*80/100
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen alaca��n�z�n �r�n�n miktar�n� giriniz");
		double miktar = scan.nextDouble();
		
		System.out.println("L�tfen fiyat� giriniz");
		double fiyat = scan.nextDouble();
		
		if (miktar>1000) {
			System.out.println(miktar*fiyat*80/100);
			
		}else {
			System.out.println(fiyat*miktar);
		}
		
		scan.close();
	}

}
