package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		
		//Kullan�c�dan iki say� al�n�z.
		//Kucuk say�y� ekrana yazd�r�n�z.
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("�ki say� giriniz");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		double sonuc = num1<=num2 ? num1 : num2 ;
		System.out.println(sonuc);
		
		scan.close();
	}

}
