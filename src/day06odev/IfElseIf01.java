package day06odev;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {


		//1) Kullan�c�dan bir tamsay� al�n e�er tamsay� 0 dan kucuk ise ekrana �Negatif� yazd�r�n.
		//0 ise ekrana �N�tr� yazd�r�n. 0 dan b�y�k ise ekrana �Pozitif� yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir tam say� giriniz");
		
		int tamsayi = scan.nextInt();
		
		if (tamsayi <0) {
			System.out.println("Negatif");
			
		}else if (tamsayi == 0) {
			System.out.println("Notr");
			
		}else {
			System.out.println("Pozitif");
		}
		
		scan.close();
	}

}
