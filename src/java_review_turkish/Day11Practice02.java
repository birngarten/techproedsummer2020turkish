package java_review_turkish;

import java.util.Scanner;

public class Day11Practice02 {

	public static void main(String[] args) {

		 /*scanner kullanarak a�a��daki sorulara cevaplar isteyiniz
	        1.Ad�m: 3 adet String tan�mlay�n�z. ad, soyad, rapor
	        2.Ad�m: 2 adet integer tan�mlay�n�z  do�um y�l�, �imdiki y�l
	        3.Ad�m: Kullan�c�dan; "L�tfen ad�n�z� ve soy ad�n�z� giriniz:" isteyin
	                 Harun
	                 Ekinci
	        4.Ad�m: Kullan�c�dan;"L�tfen do�um y�l�n�z� ve �imdiki y�l� giriniz:" isteyin
	                 1983
	                 2020        
	        5.Ad�m Raporu a�a��daki gibi yazd�r�n�z      
	                "Ad�n�z: Harun, Soy ad�n�z: Ekinci, Ya��n�z: 37"
	        6. Ad�m: Ya��n�z,Ad�n�z�n ilk harfi, soyad�n�z�n ilk ve son harfi, isim ve soyisim 
	        karakter uzunluklar�n� i�eren bir �ifre olu�turunuz
	           //�ifre= 37HEi56        
	        */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen ad�n�z� giriniz:");
		String ad = scan.nextLine();
		
		System.out.println("L�tfen soy ad�n�z� giriniz:");
		String soyad= scan.nextLine();
		
		System.out.println("L�tfen do�um y�l�n�z� giriniz:");
		int dogumYili = scan.nextInt();
		
		System.out.println("L�tfen �imdiki y�l� giriniz:");
		int simdikiYil = scan.nextInt();
		
		int yas = (simdikiYil-dogumYili);
		
		
		String rapor= scan.nextLine();
		
		rapor = ("Ad�n�z : "+ ad+","+ " Soyad�n�z : "+soyad+","+ " Ya��n�z : " + yas);
		System.out.println(rapor);

		String sifre = yas + ad.substring(0,1) + soyad.charAt(0) + soyad.charAt(soyad.length()-1) + soyad.length();
		System.out.println("�ifreniz :" +sifre);

		scan.close();
	}

}
