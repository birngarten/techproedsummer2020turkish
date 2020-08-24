package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		// For Each Loop, for loop'un üst versiyonudur. Diger adý "Enhanced For Loop"
		// ==> Enhanced : zenginleþtirilmiþ

		int arr[] = { 12, 21, 13, 43 };

		// for loop kullanarak elemanlarý ekrana yazdýr.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=====");
		// for each loop kullanarak elemanlarý ekrana yazdýr.

		for (int w : arr) {
			System.out.println(w);
		}

		// String içeren bir array oluþturun. Elemanlarýný yanyana aralarýna boþluk
		// koyarak for each loop yazdýrýn

		String arr2[] = { "ali", "ayse", "can" };

		for (String w : arr2) {
			System.out.print(w + " ");
		}

		// Integer elemanlar ,çeren bir list oluþturun. For each Loop kullanarak
		// elemanlarýn toplamýný ekrana yazdýrýn

		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(13);
		list1.add(15);

		int sum = 0;
		for (int w : list1) {
			sum = sum + w;

		}
		System.out.println(sum);

		// {{1, 2}, {5}, {6, 7, 8}} array'indeki tüm elemanlarýn toplamýný bulunuz

		int arr3[][] = { { 1, 2 }, { 5 }, { 6, 7, 8 } };

		int sum1 = 0;
		for (int[] w : arr3) {
			for (int z : w) {
				sum1 = sum1 + z;
			}
		}
		System.out.println(sum1);
	}

}
