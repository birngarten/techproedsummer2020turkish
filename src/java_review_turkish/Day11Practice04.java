package java_review_turkish;

import java.util.Scanner;

public class Day11Practice04 {

	public static void main(String[] args) {
		

		// Kullan�c�dan bir say� girmesini isteyiniz
				
		// Say� tek say� ise "Say�n�z tek say�d�r."
		// Say� �ift say� ise "Say�n�z �ift say�d�r." yazd�r�n�z"
				
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Bir sayi giriniz");
		int num = scan.nextInt();
		
		if (num %2 != 0) {
			System.out.println("Say�n�z tek say�d�r");
			
		}else {
			System.out.println("Say�n�z cift say�d�r");
		}*/
		System.out.println("Bir say� giriniz");
		int num = scan.nextInt();
		String result = (num %2 != 0) ? "Say�n�z tek say�d�r" : "Say�n�z cift say�d�r";
		System.out.println(result);
		
		scan.close();
	}

}
