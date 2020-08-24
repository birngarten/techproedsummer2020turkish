package day24varargsaccessmodifiers;

public class Varargs02 {

	public static void main(String[] args) {
		
		//Varargs'�n yanl�� Kullan�mlar�
		
		//Kural 1: Varargs her zaman son parametre olmal�d�r.
		//��nk� Varargs ilk parametre olursa girilen her de�er Varargs'�n i�ine d��er.
		//Bu nedenle asla ikinci parametreye ge�ilemez dolay�s�yla de�er verilemez.
		
		valueChar("Character",'a');
		valueChar("Character", 'a', 'b');
		
		product(5,6,7);// 42 ==> Burada 5 X'i temsil ediyor, Varargs de�il ve �arpmaya girmiyor.

	}
	public static void valueChar(String s, char... c) {
		for(char w: c) {
			System.out.print(s+" ");
			System.out.println(w);
		}
	}
	
		//Kural 2:
		//Parametre olarak birden fazla Varargs kullan�lamaz. 
		//��nk� g�nderilen her de�eri ilk Varargs yutar. �kinciye imkan tan�m�yor. 
	public static void product(int x, int... y) {
		int product=1;
		for(int w: y) {
			product = product*w;
		}
		System.out.println(product);
	}

}
