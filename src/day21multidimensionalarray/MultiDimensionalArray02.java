package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray02 {

	public static void main(String[] args) {
		// Multi Dimensional Array Olusturup deðer atama
		// 2.Yöntem

		int arr[][] = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

		System.out.println(Arrays.deepToString(arr)); // [[1, 2], [3], [4, 5, 6]]
		
		//2,3,6 nýn toplamýný ekrana yazdýrýnýz.
		System.out.println(arr[0][1] + arr[1][0] + arr[2][2]);//11
		
		//arr array'indeki tüm elemanlarýn toplamýný veren program
		//{ { 1, 2 }, { 3 }, { 4, 5, 6 } }
		
//		1.yol
		System.out.println(arr[0][0] + arr[0][1]+  arr[1][0] + arr[2][0]+ arr[2][1]+ arr[2][2]);
		
//		2.Yol
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				sum = sum+ arr[i][j];			
				}
		}
		System.out.println("Tüm elemanlarýn toplamý = " + sum);

	}
	

}
