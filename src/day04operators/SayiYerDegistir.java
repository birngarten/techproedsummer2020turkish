package day04operators;

import java.util.Scanner;

public class SayiYerDegistir {

	public static void main(String[] args) {
		
		System.out.println("iki sayinin yerini degistir");
		
		Scanner scan = new Scanner (System.in);
		
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		System.out.println("yer degistirmeden once");
		System.out.println(sayi1);
		System.out.println(sayi2);
		
		double gecici = 0.0;
		gecici = sayi1;
		sayi1 = sayi2;
		sayi2= gecici;
		
		System.out.println("sonra");
		
		System.out.println(sayi1);
		System.out.println(sayi2);
		
		
		//2.yol
		System.out.println("ikinci yol sayi girin2");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		
		a= a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
		
		scan.close();
	}

}
