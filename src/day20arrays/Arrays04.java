package day20arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		// Bir Array'in içinde belli bir elemanýn var olup olmadýðýný kontrol ediniz.
		//binarySearch() methodu bu iþ için kullanýlýr
		//binarySearch() methodu eleman var olduðunda o elemanýn index'ini verir.
		//binarySearch() methodu olmayan elemanlar için negatif sayýlar return eder.
		//ÖNEMLÝ NOT: binarySearch() methodunu kullanmadan önce sort() methodu kullanmak ZORUNLU!
		// aksi takdirde binarySearch() methodu doðru sonuç vermeyebilir.
		//Ayný elemandan birden fazla olduðunda ilkinin indexini verir.
		int arr[] = {1, 5, 2, 4, 3};
		
		// Yukarýdaki verilen array'de 3 elemaný var mý?
		
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 3));//2==>çünkü sort edilmiþ hali ve 3 ün indexi ==>2 {1,2,3,4,5}
		
	}

}
