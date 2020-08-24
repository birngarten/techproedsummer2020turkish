package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		
		// toArray() methodu List'i Array'e cevirmek için kullanýlýr.
		
		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		
		System.out.println(list);
		//.1.Yontem : toArray() method'unun içinde parametre olarak new String[0] kullanýnýz
		String arr[]=list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
		
		//2. Yntem : Oluþturduðunuz array'in data type'ini Object olarak secin.
		//Object Class, Java'da tüm Class'larýn parent'idir.
		//Object Class, Java'da parenti olmayan tek Class'týr.
		//String, Object clas'ýn child'ý olduðunda data type olarak bazý durumlarda String yerine Object kullanýrýz. 
		Object[] arr1 = list.toArray();
		
		System.out.println(Arrays.toString(arr1));
		
		
		//asList() methodu array'leri List'e cevirmek için kullanýlýr
		//asList() methodu parametre olarak array'in ismini kabul eder.
		String arr2[] = {"Aliye", "Canan"};
		Arrays.asList(arr2);
		List<String> list1 = Arrays.asList(arr2);
		System.out.println(list1);//[Aliye, Canan]
		
		//Array'den List'e cevirme yaptýðýnýzda, elde edilen list uzunluk olarak esnek deðildir. Array gibidir.
		//Yani Array'den oluþturduðunuz list'e add() ekleme ve remove() cýkarma yapamazsýnýz
		
		list1.add("Emine"); //add() yapýlamaz. Run Time Error verir. ==>"java.lang.UnsupportedOperationException"
		list1.remove("Aliye");//remove() yapýlamaz. Run Time Error verir. ==>"java.lang.UnsupportedOperationException"
		System.out.println(list1);
		
		
		
		
	}

}
