package day07odev;

import java.util.Scanner;

public class NestedIf03 {

	public static void main(String[] args) {
		
		//Kullan�c�dan password girmesini isteyin.
		//Girdi�i password 5�e b�l�n�yorsa son rakam�n� kontrol edin. Son rakam� 0 ise ekrana �5�e b�l�nen �ift say�� yazd�r�n.
		//Son rakam� 0 de�il ise �5�e b�l�nen tek say�� yazd�r�n.
		//Girdi�i password 5�e b�l�nm�yorsa ekrana �Tekrar deneyin� yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Password Giriniz");
		
		int pas= scan.nextInt();
		
		if(pas%5==0 ) {
			if	(pas%2==0) {
			System.out.println("5'e B�l�nen Cift Say�");
			}else if(pas%2 !=0) {
			System.out.println("5'e B�l�nen Tek Say�");
			} 
		}else if(pas%5!=0){
			System.out.println("Tekrar Deneyin!");
		}
		scan.close();
		
	}
}
