package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Kullanýcýdan isim ve soyismini yazmasini isteyin!
		
		System.out.println("Lutfen soyisminizi yaziniz!");
		
		String isim = scan.nextLine();
		System.out.println(isim);
		
		System.out.println("Lutfen isminizi yazin!");
		String soyisim = scan.nextLine();
		System.out.println(soyisim);
		
		scan.close();
	}

}
