package day13whiledowhileloops;

import java.util.Scanner;

public class WhileLoop04 {

	public static void main(String[] args) {
		//Kullan�c�dan girdi�i say� i�in �arp�m taplosunu ekrana yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Bir say� girin");
		int num= scan.nextInt();
		
		//for loop ile
		for(int i=1; i<=10; i++) {
			System.out.println(num + "x" + i + "=" + (num*i));
		}
		
		//while loop ile
		
//		int num1=1;
//		while(num1<=10) {
//			System.out.println(num + "x" + num1 + "=" + (num*num1));
//			num1++;
//		}
		scan.close();
	}

}
