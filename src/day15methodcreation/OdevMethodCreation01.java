package day15methodcreation;

import java.util.Scanner;

public class OdevMethodCreation01 {

	public static void main(String[] args) {

		// Kullanıcıdan isim ve soyismini alın.
		// Kullanıcının isim ve soyisminin ilk harﬂerini büyük
		// diğer harﬂerini küçük harf olarak ekrana yazdıran programı yazınız
		Scanner scan = new Scanner(System.in);

		System.out.println("Isminizi giriniz");
		String isim = scan.nextLine().toLowerCase(); // Burada hepsini kücük harf yaptık
		System.out.println("Soyisminizi giriniz");
		String soyisim = scan.nextLine().toLowerCase(); // Burada hepsini kücük harf yaptık

		isimSoyisim(isim, soyisim);

		scan.close();
	}

	public static void isimSoyisim(String isim, String soyisim) {

	if ((isim.charAt(0) >= 'a' && isim.charAt(0) <= 'z')&& (soyisim.charAt(0) >= 'a' && soyisim.charAt(0) <= 'z')) {// Burada muhakkak harf ile
			isim = isim.toUpperCase().charAt(0) + isim.substring(1);										// baslamasini saglamaya calistim.
			soyisim = soyisim.toUpperCase().charAt(0) + soyisim.substring(1);				
		System.out.println(isim+ " " + soyisim);
		
		} else {
			System.out.println("Lutfen harfle baslayin");
		}
	}
}
