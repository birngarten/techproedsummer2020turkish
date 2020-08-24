package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray01 {

	public static void main(String[] args) {
		
		//Multi Dimensional Array Olusturma (2 boyutlu olusturma)
		
		int arr[][] = new int[3][4]; //ilk köþeli parantez dýþ array'in uzunluðu, 2.köþeli parantez 
																// ise array'in içinde kaç array old. gösterir.
		System.out.println(Arrays.toString(arr)); //[[I@4554617c, [I@74a14482, [I@1540e19d] adresleri
		
		System.out.println(Arrays.deepToString(arr)); //[[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
		
		//Deðer Atama 1.Yöntem
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		
		arr[1][0] = 5;
		arr[1][1] = 6;
		arr[1][2] = 7;
		arr[1][3] = 8;
		
		arr[2][0] = 9;
		arr[2][1] = 10;
		arr[2][2] = 11;
		arr[2][3] = 12;
		
		System.out.println(Arrays.deepToString(arr));// [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]

		System.out.println(arr[1][2]); //7
		System.out.println(arr[2][1] + arr[0][3]); //10+4 ==> 14
		
		//Deðer Atama 2.Yöntem bir sonraki Class'ta ==>
	}

}
