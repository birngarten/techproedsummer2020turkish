package day06odev;

import java.util.Scanner;

public class IfElseOdev02 {

	public static void main(String[] args) {
		
		//2) Kullan�c�dan bir ��genin �� kenar uzunlu�unu al�n e�er �� kenar uzunlu�u birbirine e�it ise ekrana
		//�E�kenar ��gen� yazd�r�n. Di�er durumlarda ekrana �E�kenar de�il� yazd�r�n.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen �cgenin uc kenar�n�n degerlerini giriniz");
		
		double kenar1= scan.nextDouble();
		double kenar2= scan.nextDouble();
		double kenar3= scan.nextDouble();
		
		if (kenar1 == kenar2 && kenar2== kenar3 ) {
			System.out.println("Eskenar Ucgen");
			
		}else {
			System.out.println("Eskenar degil");
		}
		scan.close();
	}

}
