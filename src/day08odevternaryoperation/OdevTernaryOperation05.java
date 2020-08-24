package day08odevternaryoperation;

import java.util.Scanner;

public class OdevTernaryOperation05 {

	public static void main(String[] args) {

		// Soru 5) Kullanýcýdan bir tamsayý girmesini isteyin, o tamsayý 3 basamaklý ise ekrana
		// “3 Basamaklý” yazdýrýn.
		// 3 basamaklý degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklý
		// olmayan çift sayý” yazdýrýn.
		// Çift sayý degilse “3 basamaklý olmayan tek sayý yazdýrýn.”

		Scanner scan = new Scanner(System.in);

		System.out.println("Uc basamakli bir sayi giriniz");
		int num = scan.nextInt();

		String result = ((num < 1000 && num > 99) || num > -1000 && num < -99) ? ("3 Basamakli")
				: ((num % 2 == 0) ? "3 basamakli olmayan cift sayi" : "3 basamakli olmayan tek sayi");
		System.out.println("Girdiginiz sayi " + result + "dir");
		
		scan.close();
	}
}
