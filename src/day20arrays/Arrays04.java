package day20arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		// Bir Array'in i�inde belli bir eleman�n var olup olmad���n� kontrol ediniz.
		//binarySearch() methodu bu i� i�in kullan�l�r
		//binarySearch() methodu eleman var oldu�unda o eleman�n index'ini verir.
		//binarySearch() methodu olmayan elemanlar i�in negatif say�lar return eder.
		//�NEML� NOT: binarySearch() methodunu kullanmadan �nce sort() methodu kullanmak ZORUNLU!
		// aksi takdirde binarySearch() methodu do�ru sonu� vermeyebilir.
		//Ayn� elemandan birden fazla oldu�unda ilkinin indexini verir.
		int arr[] = {1, 5, 2, 4, 3};
		
		// Yukar�daki verilen array'de 3 eleman� var m�?
		
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 3));//2==>��nk� sort edilmi� hali ve 3 �n indexi ==>2 {1,2,3,4,5}
		
	}

}
