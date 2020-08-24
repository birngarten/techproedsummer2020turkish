package day14dowhileloop;

import java.util.Scanner;

public class OdevDoWhile06 {

	public static void main(String[] args) {

		// Kullanıcıdan bir String alın ve bu String’in icinde “a” harﬁ varsa 
		//ekrana “a harﬁ var” yazdırın.
		// “a” harﬁ yoksa tekrar bir String girmesini isteyin.

		Scanner scan = new Scanner(System.in);

		String str = "";

		do {
			System.out.println("Bir kelime veya cumle giriniz");
			str = scan.nextLine();

			if (str.contains("a")) {
				System.out.println("a harfi var");
			} else {
				System.out.println("a harfi yok! Lutfen tekrar giris yapiniz");
			}

		} while (str.contains("a"));

		scan.close();
	}

}
