package day24varargsaccessmodifiers;

public class Varargs01 {

	public static void main(String[] args) {
		// Varargs : Variables Arguments
		// Bir method oluþturduðumuzda istediðimiz kadar argument girmemizi saðlar.

		countNum(5);// 1
		countNum(5, 7, 9);// 3
		countNum(5, 7, 9, 11, 13, 15, 17, 19, 21);// 9

		sumNums(2, 3);// 5.0
		sumNums(2, 3, 4, 5);// 14.0
		sumNums(2, 3, 4, 5, 5, 6, 7, 8, 9);// 49.0
		
		printName("Ali");//Ali
		printName("Ali", "Kahraman"); //Ali Kahraman
		printName("Ali", "Can", "Kahraman"); //Ali Can Kahraman

	}

	public static void countNum(int... a) {
		System.out.println(a.length);

	}

	public static void sumNums(double... b) {

		double sum = 0;
		for (double w : b) {
			sum = sum + w;
		}
		System.out.println(sum);
	}

	public static void printName(String... n) {
		for(String w: n) {
			System.out.print(w +" ");
		}

	}

}
