package day17constructors;

public class Constructors04 {
	
	int num1 = 12;
	static int num2 = 22;

	public static void main(String[] args) {
		//static methodun i�inde sadece static elemanlar kullan�labilir.
		// num1 static olmad���ndan main method un i�inde kullan�lamaz.
		// num2 static oldu�undan  main method un kullan�labilir
//		num1++; ==> comment kald�r�l�rsa k�rm�z� �izer
		num2++;
		
	}

}
