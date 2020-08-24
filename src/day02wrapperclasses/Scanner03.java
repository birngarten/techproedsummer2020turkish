package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		// sayýnýn küpü?
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Lutfen bir sayi giriniz");
		
		int sayi2 = scan.nextInt();
		
		System.out.println(sayi2 * sayi2 * sayi2);
		
		scan.close();
	}

}
