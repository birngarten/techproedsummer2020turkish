package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
		
		
		// Kulanýcýdan 3 basamaklý tam sayý alalim. rakamlarýn toplamý?
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("3 basamakli bir tam sayi giriniz");
		int sayi = scan.nextInt();
		
		int sonRakam = sayi%10;
		int ortaRakam =(sayi/10) %10;
		int ilRakam = sayi/100; // 3 basamaklý sayýlarýn ilk rakamýný bulmak için sayý 100'e bolunur.
								// 4 	"			"		"	"			"	"		1000 e bolunur... vb.
		
		System.out.println(sonRakam+ortaRakam+ilRakam);
		
	scan.close();
	}

}
