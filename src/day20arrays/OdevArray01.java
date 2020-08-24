package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OdevArray01 {

	public static void main(String[] args) {
		 
		//Soru: Kullan�c�ya ka� elemanl� bir array girece�ini sorun. 
		//Kullan�c�dan array�in elemanlar�n� girmesini isteyin.
		//a) Bu array�in tum elemanlar�n� ekrana yazd�r�n. 
		//b) Bu aray�n son eleman�n� ilk eleman yap�n ve tum elemanlar�n� ekrana yazd�r�n.      
		//Mesela; array {1, 2, 3} ise ekrana {3, 1, 2} seklinde yazd�r�n.

		Scanner scan =new Scanner(System.in);
		System.out.println("Kac elemanl� bir intiger Array olu�turmak istersiniz");
		int length = scan.nextInt();
		
		int arr[] = new int[length];
		
		System.out.println("Array elemanlar�n� giriniz");
		
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
