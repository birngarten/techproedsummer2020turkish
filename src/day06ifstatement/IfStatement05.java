package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int en = scan.nextInt();  // Burada double de kullan�labilir.
		int boy= scan.nextInt();
		
		/*		
		if(en == boy) {
			System.out.println("Bu bir karedir");
		}

		if(en != boy) {
			System.out.println("Bu bir dikd�rtgendir");
	}*/
		

		if(en == boy) {
			System.out.println("Bu bir karedir");
		}else {  // else ==> diger ihtimallerin tamam�
			System.out.println("Bu bir dikd�rtgendir");
		}
		
		scan.close();
}
}
