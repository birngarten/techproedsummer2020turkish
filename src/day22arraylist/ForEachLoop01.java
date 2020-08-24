package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		// For Each Loop, for loop'un �st versiyonudur. Diger ad� "Enhanced For Loop"
		// ==> Enhanced : zenginle�tirilmi�

		int arr[] = { 12, 21, 13, 43 };

		// for loop kullanarak elemanlar� ekrana yazd�r.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=====");
		// for each loop kullanarak elemanlar� ekrana yazd�r.

		for (int w : arr) {
			System.out.println(w);
		}

		// String i�eren bir array olu�turun. Elemanlar�n� yanyana aralar�na bo�luk
		// koyarak for each loop yazd�r�n

		String arr2[] = { "ali", "ayse", "can" };

		for (String w : arr2) {
			System.out.print(w + " ");
		}

		// Integer elemanlar ,�eren bir list olu�turun. For each Loop kullanarak
		// elemanlar�n toplam�n� ekrana yazd�r�n

		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(13);
		list1.add(15);

		int sum = 0;
		for (int w : list1) {
			sum = sum + w;

		}
		System.out.println(sum);

		// {{1, 2}, {5}, {6, 7, 8}} array'indeki t�m elemanlar�n toplam�n� bulunuz

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
