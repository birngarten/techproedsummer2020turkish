package day13odevwhileloop;

import java.util.Scanner;

public class Day13Odev05 {

	public static void main(String[] args) {
		
		//Kullanıcıdan bir String alın ve bu String’in ilk harﬁ ile son harﬁnin yerlerini değiştirerek  ekrana yazdırın. 
		//Ornegin; Kullanıcı “Java” girerse ekrana “aavJ” yazdıracaksınız.
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Bir kelime girin");
		
		String str= scan.next();
		
				System.out.println(str.charAt(str.length()-1) + str.substring(1, str.length()-1) + str.charAt(0));
				
				scan.close();
				
////				2.yol
//				
//				char ilk = str.charAt(0);
//				char son = str.charAt(str.length()-1);
//		​
//				System.out.println(son + str.substring(1,str.length()-1) + ilk);

	}

}
