package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {

		//Kullan�c�dan say� al�n
		//Say� 10 dan k�c�k ise ekrana "Kazand�n�z" yazs�n
		// say� 10 dan buyuk ise ekrana "Bir say� giriniz" yazs�n

		Scanner scan = new Scanner(System.in);
		int num;
		
		do{
			System.out.println("Bir say� giriniz");
			num = scan.nextInt();
			
		}while(num<10);
		System.out.println("Kazand�n�z");
		
		scan.close();
	}

}
