package day06odev;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {

		//2) Kullan�c�dan bir ��genin �� kenar uzunlu�unu al�n e�er �� kenar uzunlu�u birbirine e�it ise ekrana
		//�E�kenar ��gen� yazd�r�n. Sadece iki kenar uzunlu�u birbirine e�it ise ekrana �Ikizkenar ��gen�
		//yazd�r�n. T�m kenar uzunluklar� birbirinden farkl� ise ��e�itkenar ��gen yazd�r�n�
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Ucgenin kenar uzunluklarini giriniz");
		
		double k1 = scan.nextDouble();
		double k2 = scan.nextDouble();
		double k3 = scan.nextDouble();
		
		if (k1==k2 && k2==k3 ) {
			System.out.println("Eskenar Ucgen");
			
		}else if (k1==k2 && k2!=k3||k1==k3 && k1!=k2 ||k2==k3 && k2!=k1) {
			System.out.println("Ikizkenar Ucgen");
			
		}else {
			System.out.println("Cesitkenar Ucgen");
		}
			
		scan.close();
	}

}
