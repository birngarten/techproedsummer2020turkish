package day12odevwhileloop;

import java.util.Scanner;

public class Odev07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Kullanýcýdan bir rakam alýn ve bu rakam icin çarpým tablosunu ekrana yazdýrýn. 
		//Kullanýcýnýn hata yapmadýðýný farz edin.  
		//Ornegin kullanýcý 3 girerse; 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30

		System.out.println("Bir rakam giriniz");
		int num = scan.nextInt();
		int i=1;
		while(i<=10) {
			System.out.print(num+"x"+i+"="+(num*i)+" ");
			i++;
		}
		scan.close();
	}

}
