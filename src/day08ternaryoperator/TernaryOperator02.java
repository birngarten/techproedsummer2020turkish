package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {


		//Kullan�c�dan 2 say� al�n bu say�lar birbirine esit ise toplamlar�n� ekrana yazd�r�n.
		//birbirinden farkl� ise carp�mlar�n� ekrana yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci sayiyi giriniz");
		double num1  = scan.nextDouble();
		
		System.out.println("Ikinci sayiyi giriniz");
		double num2 = scan.nextDouble();
		
		
		double sonuc =  num1==num2 ? num1+num2 : num1*num2;
		System.out.println(sonuc);
		
		scan.close();
	}

}
