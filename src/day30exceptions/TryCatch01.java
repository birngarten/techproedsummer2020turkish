package day30exceptions;

public class TryCatch01 {

	public static void main(String[] args) {
		// 
		int num1 = 12;
		int num2 = 0;
		
		//finally{} block exception olsa da olmasa da her zaman çalýþýr.
		//finally{} block try_catch block'tan sonra kullanýlýr.
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("Sýfýr ile bölme yapýlamaz");
		}finally {
			System.out.println("Aferin sana");
		}

	}

}
// 			Interview sorusu: final, finally, finalize keyword'lerinin farký nedir?
			/* 1) finally{}  ==> bir block'týr.==> try-catch block'tan sonra kullanýlýr. (finally{}
			 * 			Exception olsa da olmasa da çalýþýr.
			 * 2) final ==> bir keyword'dur ==> Variable'larda final kullanýlýrsa,o variable'nin deðeri deðiþtirilemez. final 
			 * 			Mesela pi sayisi final yapýldýðý zaman deðeri deðiþtirilemez. 
			 * 
			 * 			Method'larda final kullanýlýrsa, method body'leri deðiþtirilemez dolayýsýyla overriding yapýlamaz.
			 * 
			 * 			Class'larda final kullanýlýrsa, o class extend edilemez.
			 * 			 Yani final class parent olamaz, ama child olabilir. Inheritance mümkün olmaz.
			 * 
			 * 3) finalize() ==> bir method'tur==> bu method, Garbage Collector'ýn imha edeceði datalarý imha edilecek hale getirir.
			 * */
