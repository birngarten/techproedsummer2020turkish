package day06odev;

import java.util.Scanner;

public class IfOdev04 {

	public static void main(String[] args) {


		//4) Kullanýcýdan iki sayý alýn eðer sayýlarýn iþaretleri ayný ise ekrana “Ayný iþaretli” yazdýrýn.
		// Sayýlarýn iþaretleri farklý ise ekrana “Farklý iþaretli” yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen iki sayý giriniz");
		
		double num1= scan.nextDouble();
		double num2= scan.nextDouble();
		
		if (num1 < 0  && num2<0 ||num1>0 && num2>0) {
			System.out.println("Ayný isaretli");
			
		}if (num1>0 && num2<0 || num1<0 && num2>0) {
			System.out.println("Farklý isaretli");
		}
		
		//ODER
//		System.out.println("pespese iki sayi giriniz");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		
//		if(num1>0 && num2>0 || num1<0 && num2<0 ) {
//			System.out.println("ayný");
//		}else {
//			System.out.println("farklý");
//		}
		scan.close();
	}

}
 