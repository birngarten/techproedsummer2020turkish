package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		
		String str = "Ali Can okula basladi";

		//split() methodu kullanýldýðýnda MUTLAKA bir Array oluþturulmalýdýr.
		String kelime[] = str.split(" ");
		System.out.println(Arrays.toString(kelime));
		System.out.println("Kelime sayýsý : " +kelime.length); //Kelime sayýsý almak için
		
		String str2 = "Kahramanmaras";

		String harf[] = str2.split("");//Harf harf almak istiyorsak bitiþik "" kullanmalýyýz
		System.out.println(Arrays.toString(harf));
		System.out.println("Harf sayýsý : " +harf.length);//Harf sayýsý almak için
	}

}
