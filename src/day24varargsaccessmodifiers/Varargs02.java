package day24varargsaccessmodifiers;

public class Varargs02 {

	public static void main(String[] args) {
		
		//Varargs'ýn yanlýþ Kullanýmlarý
		
		//Kural 1: Varargs her zaman son parametre olmalýdýr.
		//Çünkü Varargs ilk parametre olursa girilen her deðer Varargs'ýn içine düþer.
		//Bu nedenle asla ikinci parametreye geçilemez dolayýsýyla deðer verilemez.
		
		valueChar("Character",'a');
		valueChar("Character", 'a', 'b');
		
		product(5,6,7);// 42 ==> Burada 5 X'i temsil ediyor, Varargs deðil ve çarpmaya girmiyor.

	}
	public static void valueChar(String s, char... c) {
		for(char w: c) {
			System.out.print(s+" ");
			System.out.println(w);
		}
	}
	
		//Kural 2:
		//Parametre olarak birden fazla Varargs kullanýlamaz. 
		//Çünkü gönderilen her deðeri ilk Varargs yutar. Ýkinciye imkan tanýmýyor. 
	public static void product(int x, int... y) {
		int product=1;
		for(int w: y) {
			product = product*w;
		}
		System.out.println(product);
	}

}
