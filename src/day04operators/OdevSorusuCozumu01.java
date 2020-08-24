package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {
		
		//Kullanicidan Integer aldiktan sonra String alamiyoruz.
		
		Scanner scan = new Scanner(System.in);
		
		//Java'da nextInt() kullandiktan sonra nextLine() kullanirsak kod calismiyor.
        //nextInt() yerine nextLine() kullan sonra elde ettigin String'i
        //Integer.parseInt()kullanarak integer'a cevir.

		
		System.out.println("Yasinizi giriniz");
		// int yas = scan.nextInt(); <== Bu sekilde yazdýgýmýzda Java Integer'dan sonra String'i kabul etmiyor.
									//dolayýsýyla String yapmamýz lazým. 
		
		//Yani alttaki satirda yazili kodu girmemiz gerekir.
		
		String yas = scan.nextLine();
		System.out.println(yas);
		int yeniYas = Integer.parseInt(yas); //String;i tamsayiya cevirme metodu
											//Integer.parseInt() sadece rakam iceren Stringler icin calisir.
		System.out.println(yeniYas +1); //34 +1 kodu test etmek (ispat) icin yazildi.
		
		System.out.println("Adinizi ve soyadiniz giriniz");
		String isim = scan.nextLine();
		System.out.println(isim);
		
		scan.close();
	}

}
