package day06odev;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {


		//1) Kullanýcýdan bir tamsayý alýn eðer tamsayý 0 dan kucuk ise ekrana “Negatif” yazdýrýn.
		//0 ise ekrana “Nötr” yazdýrýn. 0 dan büyük ise ekrana “Pozitif” yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir tam sayý giriniz");
		
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
