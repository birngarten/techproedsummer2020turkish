package day11stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
		
		// ****startsWith()*****
		//methodu bir String'in istenen harfle ba�lay�p ba�lamad���n� kontrol eder.
		//�stenen harfle ba�l�yorsa true, ba�lam�yorsa false return eder.
		
		String str1 = "Ali Can";
		
		//startsWith() 1. versiyonu
		
		System.out.println(str1.startsWith("A")); //true
		System.out.println(str1.startsWith("B")); //false
		System.out.println(str1.startsWith("a")); //false
		
		System.out.println(str1.startsWith("Ali")); //true
		
		//startsWith() 2. versiyonu
		
		System.out.println(str1.startsWith("a", 3));//false ==> index 3 ve sonras�nda a ile mi basl�yor diye bak�yor
		System.out.println(str1.startsWith("a", 5));//true  ==> 5. index a ile mi basl�yor diye bak�yor
		System.out.println(str1.startsWith("Can",4)); //true
		
		
		//****endsWith()***** methodubir String'in istenen harfle bitip bitmedi�ini kontrol eder.
		//�stenen harfle bitiyorsa true, bitmiyorsa false return eder.
		
		String str2 = "Ayse Canan";
		
		System.out.println(str2.endsWith("n"));//true en son harf n.
		System.out.println(str2.endsWith("Canan"));//true
		System.out.println(str2.endsWith("CANAN"));//false ==> case sensitive
		System.out.println(str2.endsWith("")); // true  ve " " tamamiyla farklidir. Ikincinin icinde bosluk karakteri var
        									   // Birincinin icinde hicbirsey yok. true verir
		
		String str3 = "Ali ";
		System.out.println(str3.endsWith(" "));//true ==> Ali den sonra (sonda) space var.
		System.out.println(str3.endsWith(""));//true
		System.out.println(str3.startsWith(""));//true
		
	}

}
