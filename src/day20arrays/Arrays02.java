package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// Bir array'in elemanlarýný küçükten büyüðe diziniz.
		// ve ekrana iki durumu da yazdýrýnýz.
		
		int arr[] = {2, 11, 0, 23, 7};
		System.out.println("Sýralamadan önce  "+ Arrays.toString(arr));
		
		//*** Arrays.sort() *** methoduna parametre olarak array'in ismi yazýlýrsa
		// o array'in elemanlarý kucukten buyuge (Ascending order, natural order) sýralanmýs olur.
		Arrays.sort(arr); //*************
		
		System.out.println("Sýralamadan sonra "+ Arrays.toString(arr));
		
		
		//SORU: char'lardan oluþan bir array oluþturunuz ve ascending order yapýnýz
		// char'lar sýralanýrken Java ASCII kodlarýný kullanýr. Dolayýsýyla buyuk harfler daha önce yazdýrýlýr.
		char arrCh[] = { 'r', 'b', 'v' , 'F', 'h', 'k','a','c'};
		
		System.out.println("Sýralamadan önce  "+ Arrays.toString(arrCh));
		
		Arrays.sort(arrCh);
		System.out.println("Sýralamadan sonra  "+ Arrays.toString(arrCh));
		
		
		//SORU: String'lerde oluþan bir array oluþtyurun. ascending order yapýn.
		
		String arrStr[] = { "ayþe", "ali", "yaz", "kýs", "sonbahar", "ilkbahar"};
		System.out.println("Sýralamadan önce  "+ Arrays.toString(arrStr));
		
		Arrays.sort(arrStr);
		System.out.println("Sýralamadan sonra  "+ Arrays.toString(arrStr));
		
		//SORU: Boolean bir array oluþturun ascending order yapýn
		// Boolean'lar için Arrays.sort() methodu kullanýlamaz
		
	}

}
