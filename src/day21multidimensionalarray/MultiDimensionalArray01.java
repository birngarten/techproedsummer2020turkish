package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray01 {

	public static void main(String[] args) {
		
		//Multi Dimensional Array Olusturma (2 boyutlu olusturma)
		
		int arr[][] = new int[3][4]; //ilk k��eli parantez d�� array'in uzunlu�u, 2.k��eli parantez 
																// ise array'in i�inde ka� array old. g�sterir.
		System.out.println(Arrays.toString(arr)); //[[I@4554617c, [I@74a14482, [I@1540e19d] adresleri
		
		System.out.println(Arrays.deepToString(arr)); //[[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
		
		//De�er Atama 1.Y�ntem
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
		
		//De�er Atama 2.Y�ntem bir sonraki Class'ta ==>
	}

}
