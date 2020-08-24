package day10odevstringmethods;

import java.util.Scanner;

public class OdevStringMethods01 {

	public static void main(String[] args) {

		// 1) Kullanýcýdan kredi kartý numarasýný alýn ve bu numaranýn üçüncü,
		// dördüncü ve sonuncu rakamlarýný ekrana yazdýrýn.

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
