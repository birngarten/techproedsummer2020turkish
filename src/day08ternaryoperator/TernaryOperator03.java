package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		
		//Kullanýcýdan iki sayý alýnýz.
		//Kucuk sayýyý ekrana yazdýrýnýz.
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Ýki sayý giriniz");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		double sonuc = num1<=num2 ? num1 : num2 ;
		System.out.println(sonuc);
		
		scan.close();
	}

}
