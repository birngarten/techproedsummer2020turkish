package day06odev;

import java.util.Scanner;

public class IfOdev01 {

	public static void main(String[] args) {
		
		//1) Kullan�c�dan bir tamsay� al�n e�er tamsay� 3 ile b�l�nebiliyorsa ekrana �3��n kat�� yazd�r�n.
		//3 ile b�l�nemiyorsa ekrana �3��n kat� de�ildir� yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir tam sayi giriniz");
		
		int tamSayi = scan.nextInt();
		
		if (tamSayi%3==0) {
			System.out.println("3'un kati");
			
		}else {
			System.out.println("3'un kati degildir");
		}
		scan.close();
	}

}