package day07odev;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		
			//Kullanýcýdan bir harf girmesini isteyin.
			//Girdiði küçük harf ise harfin “a” olup olmadýðýný kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdýrýn.
			//“a” deðil ise ekrana “Ilk küçük harf deðil” yazdýrýn.
			//Girdiði büyük harf ise harfin “Z” olup olmadýðýný kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdýrýn.
			//“Z” deðil ise ekrana “Son büyük harf deðil” yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir Harf giriniz");
		
		char harf = scan.next().charAt(0);
		
		if (harf>=97 && harf<=122) {
			if (harf==97) {
				System.out.println(harf + " Ýlk Kucuk Harf");
			}else {
				System.out.println(harf + " Ýlk Kucuk Harf Degil");
			}
		}if (harf>=65 && harf<=90) {
			if (harf==90) {
				System.out.println(harf + " Son Buyuk Harf");
				
			}else {
				System.out.println(harf + " Son Buyuk Harf Degil");
			}
		}
		scan.close();
	}
}
