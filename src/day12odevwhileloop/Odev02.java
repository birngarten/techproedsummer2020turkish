package day12odevwhileloop;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {

		// Soru 2)Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve
		// ba�lang�� de�erinden ba�lay�p biti� de�erinde biten
		// t�m tamsay�lar� while loop kullanarak ekrana yazd�r�n�z.

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Baslangic degerini yaziniz");
		int num1=scan.nextInt();
		
		System.out.println("Bitis degerini yaziniz");
		int num2=scan.nextInt();
		
		if(num1>num2) {
			System.out.println("Baslangic degeri bitis degerinden kucuk olmalidir");
				
		}else {
			while(num1<=num2) {
				System.out.print(num1+" ");
				num1++;
			}
		}
		scan.close();
	}

}
