package day14dowhileloop;

import java.util.Scanner;

public class OdevDoWhile04 {

	public static void main(String[] args) {

		//Kullanýcýya iki sayý girmesini söyleyin. 
		//Bu sayýlar eþit ise ekrana “Kare oluþturdunuz” yazdýrýn. 
		//Eþit deðilse tekrar iki sayý girmesini söyleyin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Pespese iki sayý giriniz");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		do {
			if(num1==num2) {
				System.out.println("Kare Olusturdunuz");
			}else {
				System.out.println("Tekrar iki sayi giriniz");
				num1++;
			}
		}while(!(num1 == num2));
		
		scan.close();
	}

}
