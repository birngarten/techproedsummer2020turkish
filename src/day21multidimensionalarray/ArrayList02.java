package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// List olu�turun
		
		//List'le data type olarak primitive'leri kabul etmez.
		//Primitive data type ni non-primitive yapmak i�in wrapper class'lar� kullan�r�z.
		List<Integer> list01 = new ArrayList<>();
		
		//Bu list'in i�inde eleman olup olmad���n� kontrol ediniz. ==> isEmty() methodu kullan�l�r.
		//Bos ise true, dolu ise false return eder.
		
		System.out.println(list01.isEmpty());//true ==> olunca liste de eleman yok demek
		
		//Bu list'e bir eleman ekleyin
		
		list01.add(123);
		System.out.println(list01.isEmpty());//false
		
		//List'en eleman silmek. ******remove() ******* methodu kullan�l�r.
		list01.add(124);
		list01.add(125);
		list01.add(124);
		System.out.println(list01);//[123,124,125,124]
		list01.remove(1);//index'i 1 olan eleman� siler
		System.out.println(list01);//[123,125,124]
		list01.remove(0);//index'i 0 olan eleman� siler
		System.out.println(list01);//[125,124]
		
		list01.remove(list01.size()-1);//son eleman� silme***
		System.out.println(list01);//[125] kald�

	}

}
