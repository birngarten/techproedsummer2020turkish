package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		
		String str = "Ali Can okula basladi";

		//split() methodu kullan�ld���nda MUTLAKA bir Array olu�turulmal�d�r.
		String kelime[] = str.split(" ");
		System.out.println(Arrays.toString(kelime));
		System.out.println("Kelime say�s� : " +kelime.length); //Kelime say�s� almak i�in
		
		String str2 = "Kahramanmaras";

		String harf[] = str2.split("");//Harf harf almak istiyorsak biti�ik "" kullanmal�y�z
		System.out.println(Arrays.toString(harf));
		System.out.println("Harf say�s� : " +harf.length);//Harf say�s� almak i�in
	}

}
