package day04operators;

import java.util.Scanner;

public class Calisma01Day04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Üc sayinin yerini deðistirin.
		
		System.out.println("Sayilari giriniz");
		
		double s1 = scan.nextDouble();
		double s2 = scan.nextDouble();
		double s3 = scan.nextDouble();
		
		//1.Yol:
		
		System.out.println("Once");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		System.out.println("Sonra");
		
		double gecici = 0.0;
		
		gecici= s1;
		s1 = s2;
		s2 = s3;
		s3 = gecici;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		scan.close();
	}

}
