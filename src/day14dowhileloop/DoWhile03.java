package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {

		//Kullanýcýdan sayý alýn
		//Sayý 10 dan kücük ise ekrana "Kazandýnýz" yazsýn
		// sayý 10 dan buyuk ise ekrana "Bir sayý giriniz" yazsýn

		Scanner scan = new Scanner(System.in);
		int num;
		
		do{
			System.out.println("Bir sayý giriniz");
			num = scan.nextInt();
			
		}while(num<10);
		System.out.println("Kazandýnýz");
		
		scan.close();
	}

}
