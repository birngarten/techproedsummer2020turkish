package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// Bir array'in elemanlar�n� k���kten b�y��e diziniz.
		// ve ekrana iki durumu da yazd�r�n�z.
		
		int arr[] = {2, 11, 0, 23, 7};
		System.out.println("S�ralamadan �nce  "+ Arrays.toString(arr));
		
		//*** Arrays.sort() *** methoduna parametre olarak array'in ismi yaz�l�rsa
		// o array'in elemanlar� kucukten buyuge (Ascending order, natural order) s�ralanm�s olur.
		Arrays.sort(arr); //*************
		
		System.out.println("S�ralamadan sonra "+ Arrays.toString(arr));
		
		
		//SORU: char'lardan olu�an bir array olu�turunuz ve ascending order yap�n�z
		// char'lar s�ralan�rken Java ASCII kodlar�n� kullan�r. Dolay�s�yla buyuk harfler daha �nce yazd�r�l�r.
		char arrCh[] = { 'r', 'b', 'v' , 'F', 'h', 'k','a','c'};
		
		System.out.println("S�ralamadan �nce  "+ Arrays.toString(arrCh));
		
		Arrays.sort(arrCh);
		System.out.println("S�ralamadan sonra  "+ Arrays.toString(arrCh));
		
		
		//SORU: String'lerde olu�an bir array olu�tyurun. ascending order yap�n.
		
		String arrStr[] = { "ay�e", "ali", "yaz", "k�s", "sonbahar", "ilkbahar"};
		System.out.println("S�ralamadan �nce  "+ Arrays.toString(arrStr));
		
		Arrays.sort(arrStr);
		System.out.println("S�ralamadan sonra  "+ Arrays.toString(arrStr));
		
		//SORU: Boolean bir array olu�turun ascending order yap�n
		// Boolean'lar i�in Arrays.sort() methodu kullan�lamaz
		
	}

}
