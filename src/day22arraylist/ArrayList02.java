package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		
		// toArray() methodu List'i Array'e cevirmek i�in kullan�l�r.
		
		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		
		System.out.println(list);
		//.1.Yontem : toArray() method'unun i�inde parametre olarak new String[0] kullan�n�z
		String arr[]=list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
		
		//2. Yntem : Olu�turdu�unuz array'in data type'ini Object olarak secin.
		//Object Class, Java'da t�m Class'lar�n parent'idir.
		//Object Class, Java'da parenti olmayan tek Class't�r.
		//String, Object clas'�n child'� oldu�unda data type olarak baz� durumlarda String yerine Object kullan�r�z. 
		Object[] arr1 = list.toArray();
		
		System.out.println(Arrays.toString(arr1));
		
		
		//asList() methodu array'leri List'e cevirmek i�in kullan�l�r
		//asList() methodu parametre olarak array'in ismini kabul eder.
		String arr2[] = {"Aliye", "Canan"};
		Arrays.asList(arr2);
		List<String> list1 = Arrays.asList(arr2);
		System.out.println(list1);//[Aliye, Canan]
		
		//Array'den List'e cevirme yapt���n�zda, elde edilen list uzunluk olarak esnek de�ildir. Array gibidir.
		//Yani Array'den olu�turdu�unuz list'e add() ekleme ve remove() c�karma yapamazs�n�z
		
		list1.add("Emine"); //add() yap�lamaz. Run Time Error verir. ==>"java.lang.UnsupportedOperationException"
		list1.remove("Aliye");//remove() yap�lamaz. Run Time Error verir. ==>"java.lang.UnsupportedOperationException"
		System.out.println(list1);
		
		
		
		
	}

}
