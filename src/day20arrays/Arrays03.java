package day20arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// Iki Array olu�turup bu array'lerin birbirine e�it olup olmad���n� kontrol ediniz.
		//Not:	�ki array'in e�it olabilmesi;
		//		1) Elemanlar�n ayn� olmas� ve
		//		2) E�it elemanlar�n index'leri de e�it olmal�d�r.
		
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		
		System.out.println(arr1==arr2); //false ==> ��nk� reference'ler farkl�
										// "==" adresleride kontrol eder. Adresleri farkl� oldu�undan false verir.
		
		System.out.println(Arrays.equals(arr1, arr2)); //true ==> cunku Arrays.equals() methodu sadece de�er ve 
																//indexleri kontrol eder. Adreslere bakmaz.
		
	}

}
