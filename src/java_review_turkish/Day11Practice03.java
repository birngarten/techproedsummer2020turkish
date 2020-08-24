package java_review_turkish;

import java.util.Scanner;

public class Day11Practice03 {

	public static void main(String[] args) {


		// Scanner kullanarak kullanýcýdan saat, dakika ve saniye bilgilerini alarak sonucu yazdýrýnz
	    // saat,dakika, saniye -->int
	    // PM veya AM--> String
	    // Örn: 11:25:33 PM
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Saat Giriniz");
		int saat = scan.nextInt();
		
		System.out.println("Dakika Giriniz");
		int dak = scan.nextInt();
		
		System.out.println("Saniye Giriniz");
		int sn = scan.nextInt();
		
		System.out.println("AM or PM");
		String str = scan.next();
		
		System.out.println(saat+":"+dak+":"+sn +" "+str);
		
		scan.close();
		

	}

}
