package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		// ["A", "C", "B", "C"] oluþturun
		
		List<String> list= new ArrayList<>();
		
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		//list'de eleman olarak B VAR mý;************
		
		System.out.println(list.contains("B"));//true ==> Eger B eleman olarak varsa true yoksa false return eder
		System.out.println(list.contains("Z"));//false
		
		//list'deki elemanlarý alfabetik sýraya koyunuz********
		//Collection ===> Bir araya getirilmiþ parcalar
		//Collections.sort() methodu kullanýlýr. Argument olark list'in adý yazýlýr.
		Collections.sort(list);
		System.out.println(list);//[A, B, C, C] ==> alfabetik sýraya koyuyor. (Natural Order)

	}

}
