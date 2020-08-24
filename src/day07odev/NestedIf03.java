package day07odev;

import java.util.Scanner;

public class NestedIf03 {

	public static void main(String[] args) {
		
		//Kullanýcýdan password girmesini isteyin.
		//Girdiði password 5’e bölünüyorsa son rakamýný kontrol edin. Son rakamý 0 ise ekrana “5’e bölünen çift sayý” yazdýrýn.
		//Son rakamý 0 deðil ise “5’e bölünen tek sayý” yazdýrýn.
		//Girdiði password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Password Giriniz");
		
		int pas= scan.nextInt();
		
		if(pas%5==0 ) {
			if	(pas%2==0) {
			System.out.println("5'e Bölünen Cift Sayý");
			}else if(pas%2 !=0) {
			System.out.println("5'e Bölünen Tek Sayý");
			} 
		}else if(pas%5!=0){
			System.out.println("Tekrar Deneyin!");
		}
		scan.close();
		
	}
}
