package day30exceptions;

public class TryCatch01 {

	public static void main(String[] args) {
		// 
		int num1 = 12;
		int num2 = 0;
		
		//finally{} block exception olsa da olmasa da her zaman �al���r.
		//finally{} block try_catch block'tan sonra kullan�l�r.
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("S�f�r ile b�lme yap�lamaz");
		}finally {
			System.out.println("Aferin sana");
		}

	}

}
// 			Interview sorusu: final, finally, finalize keyword'lerinin fark� nedir?
			/* 1) finally{}  ==> bir block't�r.==> try-catch block'tan sonra kullan�l�r. (finally{}
			 * 			Exception olsa da olmasa da �al���r.
			 * 2) final ==> bir keyword'dur ==> Variable'larda final kullan�l�rsa,o variable'nin de�eri de�i�tirilemez. final 
			 * 			Mesela pi sayisi final yap�ld��� zaman de�eri de�i�tirilemez. 
			 * 
			 * 			Method'larda final kullan�l�rsa, method body'leri de�i�tirilemez dolay�s�yla overriding yap�lamaz.
			 * 
			 * 			Class'larda final kullan�l�rsa, o class extend edilemez.
			 * 			 Yani final class parent olamaz, ama child olabilir. Inheritance m�mk�n olmaz.
			 * 
			 * 3) finalize() ==> bir method'tur==> bu method, Garbage Collector'�n imha edece�i datalar� imha edilecek hale getirir.
			 * */
