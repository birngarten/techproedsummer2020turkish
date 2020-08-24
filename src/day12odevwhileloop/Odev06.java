package day12odevwhileloop;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		
		//Kullanıcıdan başlangıç ve bitiş  harﬂerini alın ve 
		//başlangıç harﬁnden başlayıp bitiş harﬁnde  biten 
		//tüm harﬂeri büyük harf olarak ekrana yazdırın. 
		//Kullanıcının hata yapmadığını farz edin.

		Scanner scan= new Scanner(System.in);
		System.out.println("Baslangic harfini giriniz");
		char ch1=scan.next().toUpperCase().charAt(0);
		
		System.out.println("Bitis harfini giriniz");
		char ch2=scan.next().toUpperCase().charAt(0);
		
		
			while(ch1<=ch2) {
				System.out.print(ch1+" ");
				ch1++;
			}
			scan.close();
		}
		
	}


