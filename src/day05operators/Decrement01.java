package day05operators;

public class Decrement01 {

	public static void main(String[] args) {


		// int data tipinde bir variable olustur.
		// bunun de�erini uc yontemide kullanarak her defas�nda 1 eksiltin
		
		int num1 = 12;
		
		num1 = num1 - 1; // uzun yol
		System.out.println(num1);
		
		num1-= 1; // K�sa yol
		System.out.println(num1);
		
		num1--;  // En k�sa yol
		System.out.println(num1);
		
		
		/*num1 = num1*3; // Uzun yol  ===> Carpma ve Bolmede sadece Uzun yol ile K�sa yol uygulan�r.
		System.out.println(num1);
		
		num1 *= 3;	// K�sa yol
		System.out.println(num1);
		
		num1 = num1/3;
		System.out.println(num1);
		
		num1 /= 3;
		System.out.println(num1);*/  
		

	}

}
