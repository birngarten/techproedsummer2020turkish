package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// List oluþturun
		
		//List'le data type olarak primitive'leri kabul etmez.
		//Primitive data type ni non-primitive yapmak için wrapper class'larý kullanýrýz.
		List<Integer> list01 = new ArrayList<>();
		
		//Bu list'in içinde eleman olup olmadýðýný kontrol ediniz. ==> isEmty() methodu kullanýlýr.
		//Bos ise true, dolu ise false return eder.
		
		System.out.println(list01.isEmpty());//true ==> olunca liste de eleman yok demek
		
		//Bu list'e bir eleman ekleyin
		
		list01.add(123);
		System.out.println(list01.isEmpty());//false
		
		//List'en eleman silmek. ******remove() ******* methodu kullanýlýr.
		list01.add(124);
		list01.add(125);
		list01.add(124);
		System.out.println(list01);//[123,124,125,124]
		list01.remove(1);//index'i 1 olan elemaný siler
		System.out.println(list01);//[123,125,124]
		list01.remove(0);//index'i 0 olan elemaný siler
		System.out.println(list01);//[125,124]
		
		list01.remove(list01.size()-1);//son elemaný silme***
		System.out.println(list01);//[125] kaldý

	}

}
