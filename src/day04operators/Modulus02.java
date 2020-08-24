package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini veren program yaziniz.
		
		System.out.println("4 basamakli bir tam sayi giriniz");
		
		int s = scan.nextInt(); //Bir tam sayinin birler basamagýndaki sayýyý bulmak için 10 a boleriz.
		int sonRakam = s%10;
		int ilkRakam = s/1000; //Bir sayýnýn ilk basamaðýný bulmak icin sayiyi 1 ile baslayan basamak degerine boluyoruz. 
								// Bu soruda 4 basamak oldugu icin 1000'e boluyoruz.
		
		System.out.println(sonRakam + ilkRakam);
		
		scan.close();
	}

}
