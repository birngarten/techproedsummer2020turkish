package day06odev;

import java.util.Scanner;

public class IfElseOdev01 {

	public static void main(String[] args) {
		
		//1) Kullan�c�dan bir tamsay� al�n e�er tamsay� 10 dan kucuk ve 0�dan b�y�k e�it ise ekrana
		//�Rakam� yazd�r�n. Di�er durumlarda ekrana �Say�� yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir tamsay� giriniz");
		
		int num = scan.nextInt();
		
		if (num<10 && num>=0) {
			System.out.println("Rakam");
			
		}else {
			System.out.println("Sayi");
		}

		scan.close();
	}

}
