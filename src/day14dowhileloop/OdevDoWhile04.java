package day14dowhileloop;

import java.util.Scanner;

public class OdevDoWhile04 {

	public static void main(String[] args) {

		//Kullan�c�ya iki say� girmesini s�yleyin. 
		//Bu say�lar e�it ise ekrana �Kare olu�turdunuz� yazd�r�n. 
		//E�it de�ilse tekrar iki say� girmesini s�yleyin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Pespese iki say� giriniz");
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
