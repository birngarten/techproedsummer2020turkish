package day05operators;

public class Decrement01 {

	public static void main(String[] args) {


		// int data tipinde bir variable olustur.
		// bunun deðerini uc yontemide kullanarak her defasýnda 1 eksiltin
		
		int num1 = 12;
		
		num1 = num1 - 1; // uzun yol
		System.out.println(num1);
		
		num1-= 1; // Kýsa yol
		System.out.println(num1);
		
		num1--;  // En kýsa yol
		System.out.println(num1);
		
		
		/*num1 = num1*3; // Uzun yol  ===> Carpma ve Bolmede sadece Uzun yol ile Kýsa yol uygulanýr.
		System.out.println(num1);
		
		num1 *= 3;	// Kýsa yol
		System.out.println(num1);
		
		num1 = num1/3;
		System.out.println(num1);
		
		num1 /= 3;
		System.out.println(num1);*/  
		

	}

}
