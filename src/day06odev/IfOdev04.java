package day06odev;

import java.util.Scanner;

public class IfOdev04 {

	public static void main(String[] args) {


		//4) Kullan�c�dan iki say� al�n e�er say�lar�n i�aretleri ayn� ise ekrana �Ayn� i�aretli� yazd�r�n.
		// Say�lar�n i�aretleri farkl� ise ekrana �Farkl� i�aretli� yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen iki say� giriniz");
		
		double num1= scan.nextDouble();
		double num2= scan.nextDouble();
		
		if (num1 < 0  && num2<0 ||num1>0 && num2>0) {
			System.out.println("Ayn� isaretli");
			
		}if (num1>0 && num2<0 || num1<0 && num2>0) {
			System.out.println("Farkl� isaretli");
		}
		
		//ODER
//		System.out.println("pespese iki sayi giriniz");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		
//		if(num1>0 && num2>0 || num1<0 && num2<0 ) {
//			System.out.println("ayn�");
//		}else {
//			System.out.println("farkl�");
//		}
		scan.close();
	}

}
 