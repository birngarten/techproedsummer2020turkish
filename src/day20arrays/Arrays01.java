package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
		// Kullanýcýdan kaç elemanlý bir array girmesini  isteyin.
		// Bu array’i oluþturup tum elemanlarýný ekrana yazdýrýn.
		// Bu array'in ilk elemanýný son eleman yapýn ve tum elemanlarýný ekrana yazdýrýn.
		// Mesela; array {1, 2, 3} ise ekrana {2, 3, 1} seklinde yazdýrýn.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kac elemanlý bir intiger Array oluþturmak istersiniz");
		int length = scan.nextInt();
		
		int arr[] = new int[length];
		
		System.out.println("Array elemanlarýný giriniz");
		
		for(int i=0; i<length; i++) {
			arr[i] = scan.nextInt();			
		}		
		//*****************
		//Arrays.toString() methoduna parametre olarak array'in ismini yazarsanýz,
		// o array'in tüm elemanlarýný ekrana yazdýrýr
		System.out.println(Arrays.toString(arr));
		
		
		
		int arrSon[] = new int[length];
		
		for(int i=1; i<length; i++) {
			arrSon[i-1] = arr[i];
		}
		
		arrSon[length-1] = arr[0];
		System.out.println(Arrays.toString(arrSon));
		
		scan.close();
	}
	

}
