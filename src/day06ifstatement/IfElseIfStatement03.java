package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {


		//Kullanýcýdan 6 basamakli bir sayi isteyin. 0 ile de baslayabilir.
		//Kazanma ihtimali %20, amorti iytimali %30
		// Kaybetme ihtimali %50 olan bir oyun programi yapiniz.
		//000000-000001-....999999. ==> 1000000 ihtimal
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("6 Basamakli Bir sayi Giriniz. Sifir basta kullanýlabilir");
		
		int num= scan.nextInt();
		
		if(num<200000) {
			System.out.println("Kazandiniz");
		}else if(num<500000) {
			System.out.println("Amorti");
		}else {
			System.out.println("Kaybettiniz");
		}
		scan.close();		
		
	}

}
