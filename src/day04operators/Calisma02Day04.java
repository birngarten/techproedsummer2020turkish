package day04operators;

import java.util.Scanner;

public class Calisma02Day04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		// Soru: Kullanicidan alinan 6 basamakli bir sayinin rakamlarinin carpiminin 3 e bolumunu yapan bir program yazýnýz.
		
		System.out.println("6 basamakli bir sayi giriniz");
		
		int sayi = scan.nextInt();
		
		int s1 = sayi%10;
		int s2 = (sayi/10)%10;
		int s3 = (sayi/100)%10;
		int s4 = (sayi/1000)%10;
		int s5 = (sayi/10000)%10;
		int s6 = sayi/100000;
		
		System.out.println((s1*s2*s3*s4*s5*s6)/3); 
		scan.close();
	}

}
