package day12odevwhileloop;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		
		//Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve 
		//ba�lang�� de�erinden ba�lay�p biti� de�erinde  biten 
		//t�m tamsay�lar�n �arp�m�n� ekrana yazd�r�n.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Baslangic degerini yaziniz");
		int num1=scan.nextInt();
		
		System.out.println("Bitis degerini yaziniz");
		int num2=scan.nextInt();
		
		int prod=1;
		
		while(num1<=num2) {
			prod=prod*num1;
			num1++;
			
		}System.out.println(prod);

		scan.close();
	}

}
