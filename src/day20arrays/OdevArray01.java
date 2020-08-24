package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OdevArray01 {

	public static void main(String[] args) {
		 
		//Soru: Kullanýcýya kaç elemanlý bir array gireceðini sorun. 
		//Kullanýcýdan array’in elemanlarýný girmesini isteyin.
		//a) Bu array’in tum elemanlarýný ekrana yazdýrýn. 
		//b) Bu arayýn son elemanýný ilk eleman yapýn ve tum elemanlarýný ekrana yazdýrýn.      
		//Mesela; array {1, 2, 3} ise ekrana {3, 1, 2} seklinde yazdýrýn.

		Scanner scan =new Scanner(System.in);
		System.out.println("Kac elemanlý bir intiger Array oluþturmak istersiniz");
		int length = scan.nextInt();
		
		int arr[] = new int[length];
		
		System.out.println("Array elemanlarýný giriniz");
		
		for(int i=0; i<length; i++) {
			arr[i] = scan.nextInt();			
		}
		System.out.println(Arrays.toString(arr));
		
		int arrEnd []= new int[length];
		
		for(int i=0; i<length; i++) {
			arrEnd [i-1] = arr[i];
			}
		arrEnd[length-1] = arr[0];
		System.out.println(Arrays.toString(arrEnd));
	
	scan.close();
	}
}
