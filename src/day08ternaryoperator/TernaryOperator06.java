package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator06 {

	public static void main(String[] args) {

		// Kullan�c�dan bir say� al�n
		// say� cift ise 10 bolunup bolunmedigini kontrol ediniz.
		// 10 a bolnuyorsa "Wooow 10"
		// Bolunmuyorsa "Yaz�k 10"
		// Say� tek ise 5 e bolunup bolunmedigini kontrol ediniz.
		// Say� 5 e bolunuyorsa "Wooow 5" yazd�r�n�z
		// Say� 5 e bolunmuyorsa "Yaz�k 5" yazs�n
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir say� giriniz");
		int num = scan.nextInt();
		
						//Condition   Soru�sareti				True										False
		String result = ((num %2 ==0)     ?         (num%10==0 ? "Wooow10" : "Yazik 10")     :     (num %5==0  ? "Wooow5" : "Yazik 5"));
		System.out.println(result);
		//				((num %2 ==0) ?              (num % 10==0? "Wooow 10": "Yaz�k 10"):          (num%5==0  ? "Wooow 5" :"Yaz�k 5"));
		scan.close();
	}

}
