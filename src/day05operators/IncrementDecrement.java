package day05operators;

public class IncrementDecrement {

	public static void main(String[] args) {


		// Int data tipinde bir variable olustur.
		// bunun degerini carpma ve bolme kullanarak artýr ve azalt.
		
		int num1 = 12;
		
		// Uzun yol carpma increment
		
		num1 = num1 * 3;
		System.out.println(num1); //12*3=36
		
		// Kýsa yol
		
		num1*= 3;
		System.out.println(num1); //36*3 = 108  !!!Burada "*=" bitiþik olmalý.
		
		//Bolme
		
		num1 = num1 / 9;
		System.out.println(num1); // 108/9=12
		
		num1/=2;
		System.out.println(num1); //12/2=6
		
	}

}
