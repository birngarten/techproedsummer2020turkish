package day06odev;

import java.util.Scanner;

public class IfOdev01 {

	public static void main(String[] args) {
		
		//1) Kullanýcýdan bir tamsayý alýn eðer tamsayý 3 ile bölünebiliyorsa ekrana “3’ün katý” yazdýrýn.
		//3 ile bölünemiyorsa ekrana “3’ün katý deðildir” yazdýrýn.
		
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
