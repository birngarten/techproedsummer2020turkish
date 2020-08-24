package day34collections;
import java.util.Arrays;
import java.util.Scanner;

public class Review01 {

	public static void main(String[] args) {
		// Kullanicidan adini ve soyadini aliniz
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Adýnýzý giriniz");
		String ad = scan.nextLine();
		System.out.println("Soyadýnýzý giriniz");
		String soyad = scan.nextLine();
		
		// 1)Ad ve soyadini console’a yazdirin
		System.out.println(ad+" "+soyad);
		
		// 2)Sadece adini console’a yazdirin
		System.out.println(ad);
		
		// 3)Ad ve soyadinin ilk harflerini console’a yazdirin
		System.out.println("Adýn ilk harfi: "+ ad.charAt(0));
		System.out.println("Soyadýn ilk harfi: "+soyad.charAt(0));
		
		// 4)Ad ve soyadini console’a tersten yazdirin
		//1:Çözüm
		int a = ad.length()-1;
		int b = soyad.length()-1;
		
		for(int i=a; i>=0; i--) {
			System.out.print(ad.charAt(i));
		}System.out.println();
		for(int i=b; i>=0; i--) {
			System.out.print(soyad.charAt(i));
			
			System.out.println();//console da ara vermek için bunu kullandýk
			
			//2.Çözüm
		 StringBuilder strB = new StringBuilder(ad + " " + soyad);
		  System.out.println(strB.reverse());

			
		}System.out.println();
		// 5)Ad ve soyadinda kullanilan tum karakterleri alfabetik sirayla yazýn
		String adSoyad = ad + soyad;
		String [] adSoyadArr =  adSoyad.split("");
		Arrays.sort(adSoyadArr);
		System.out.println(Arrays.toString(adSoyadArr));
		
		

		scan.close();
	}

}
