package day06odev;

import java.util.Scanner;

public class IfOdev02 {

	public static void main(String[] args) {
		
		//2) Kullan�c�dan bir harf al�n e�er harf �a, e, i, o, u� dan biri ise ekrana �Sesli harf� yazd�r�n.
		//�b, c, d, f� den biri ise ekrana �Sessiz harf� yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("a, e, i, o, u, b, c, d, f harflerinden birini giriniz");
		char harf = scan.next().charAt(0);
		
		if (harf=='a'||harf=='e'||harf=='i'||harf=='o'||harf=='u') {
			System.out.println("Sesli Harf");
		}
		else if (harf=='b'||harf=='c'||harf=='d'||harf=='f') {
			System.out.println("Sessiz Harf");
			
		}else {
			System.out.println("Yanlis Harf Giriniz");
		}
		scan.close();
	}

}
