package day10odevstringmethods;

import java.util.Scanner;

public class OdevStringMethods01 {

	public static void main(String[] args) {

		// 1) Kullan�c�dan kredi kart� numaras�n� al�n ve bu numaran�n ���nc�,
		// d�rd�nc� ve sonuncu rakamlar�n� ekrana yazd�r�n.

		Scanner scan = new Scanner(System.in);

		System.out.println("Kredi karti numaranizi giriniz");

		String num = scan.nextLine();

		int no = num.length();

		System.out.println(num.charAt(2));
		System.out.println(num.charAt(4 - 1));
		System.out.println(num.charAt(no- 1));

		scan.close();

	}

}
