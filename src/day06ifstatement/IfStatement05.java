package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int en = scan.nextInt();  // Burada double de kullanýlabilir.
		int boy= scan.nextInt();
		
		/*		
		if(en == boy) {
			System.out.println("Bu bir karedir");
		}

		if(en != boy) {
			System.out.println("Bu bir dikdörtgendir");
	}*/
		

		if(en == boy) {
			System.out.println("Bu bir karedir");
		}else {  // else ==> diger ihtimallerin tamamý
			System.out.println("Bu bir dikdörtgendir");
		}
		
		scan.close();
}
}
