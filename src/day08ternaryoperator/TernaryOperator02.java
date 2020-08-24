package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {


		//Kullanýcýdan 2 sayý alýn bu sayýlar birbirine esit ise toplamlarýný ekrana yazdýrýn.
		//birbirinden farklý ise carpýmlarýný ekrana yazdýrýn
		
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
