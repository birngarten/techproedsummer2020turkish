package day07odev;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		
			//Kullan�c�dan bir harf girmesini isteyin.
			//Girdi�i k���k harf ise harfin �a� olup olmad���n� kontrol edin. Harf �a� ise ekrana �Ilk k���k harf� yazd�r�n.
			//�a� de�il ise ekrana �Ilk k���k harf de�il� yazd�r�n.
			//Girdi�i b�y�k harf ise harfin �Z� olup olmad���n� kontrol edin. Harf �Z� ise ekrana �Son b�y�k harf� yazd�r�n.
			//�Z� de�il ise ekrana �Son b�y�k harf de�il� yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir Harf giriniz");
		
		char harf = scan.next().charAt(0);
		
		if (harf>=97 && harf<=122) {
			if (harf==97) {
				System.out.println(harf + " �lk Kucuk Harf");
			}else {
				System.out.println(harf + " �lk Kucuk Harf Degil");
			}
		}if (harf>=65 && harf<=90) {
			if (harf==90) {
				System.out.println(harf + " Son Buyuk Harf");
				
			}else {
				System.out.println(harf + " Son Buyuk Harf Degil");
			}
		}
		scan.close();
	}
}
