package day20arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// Iki Array oluþturup bu array'lerin birbirine eþit olup olmadýðýný kontrol ediniz.
		//Not:	Ýki array'in eþit olabilmesi;
		//		1) Elemanlarýn ayný olmasý ve
		//		2) Eþit elemanlarýn index'leri de eþit olmalýdýr.
		
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		
		System.out.println(arr1==arr2); //false ==> çünkü reference'ler farklý
										// "==" adresleride kontrol eder. Adresleri farklý olduðundan false verir.
		
		System.out.println(Arrays.equals(arr1, arr2)); //true ==> cunku Arrays.equals() methodu sadece deðer ve 
																//indexleri kontrol eder. Adreslere bakmaz.
		
	}

}
