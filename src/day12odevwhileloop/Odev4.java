package day12odevwhileloop;

import java.util.Scanner;

public class Odev4 {

	public static void main(String[] args) {

		//Soru4)Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve 
		//ba�lang�� de�erinden ba�lay�p biti� de�erinde  biten 
		//t�m tamsay�lar�n toplam�n� ekrana yazd�r�n.

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Baslangic degerini yaziniz");
		int num1=scan.nextInt();
		
		System.out.println("Bitis degerini yaziniz");
		int num2=scan.nextInt();
		
		int sum=0;
		
		while(num1<=num2) {
			sum=sum+num1;
			num1++;
			
		}System.out.println(sum);

		scan.close();
	}

}
