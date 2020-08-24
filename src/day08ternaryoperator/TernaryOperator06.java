package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator06 {

	public static void main(String[] args) {

		// Kullanýcýdan bir sayý alýn
		// sayý cift ise 10 bolunup bolunmedigini kontrol ediniz.
		// 10 a bolnuyorsa "Wooow 10"
		// Bolunmuyorsa "Yazýk 10"
		// Sayý tek ise 5 e bolunup bolunmedigini kontrol ediniz.
		// Sayý 5 e bolunuyorsa "Wooow 5" yazdýrýnýz
		// Sayý 5 e bolunmuyorsa "Yazýk 5" yazsýn
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayý giriniz");
		int num = scan.nextInt();
		
						//Condition   SoruÝsareti				True										False
		String result = ((num %2 ==0)     ?         (num%10==0 ? "Wooow10" : "Yazik 10")     :     (num %5==0  ? "Wooow5" : "Yazik 5"));
		System.out.println(result);
		//				((num %2 ==0) ?              (num % 10==0? "Wooow 10": "Yazýk 10"):          (num%5==0  ? "Wooow 5" :"Yazýk 5"));
		scan.close();
	}

}
