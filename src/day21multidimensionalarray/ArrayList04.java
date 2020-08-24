package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		// ["A", "C", "B", "C"] olu�turun
		
		List<String> list= new ArrayList<>();
		
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		//list'de eleman olarak B VAR m�;************
		
		System.out.println(list.contains("B"));//true ==> Eger B eleman olarak varsa true yoksa false return eder
		System.out.println(list.contains("Z"));//false
		
		//list'deki elemanlar� alfabetik s�raya koyunuz********
		//Collection ===> Bir araya getirilmi� parcalar
		//Collections.sort() methodu kullan�l�r. Argument olark list'in ad� yaz�l�r.
		Collections.sort(list);
		System.out.println(list);//[A, B, C, C] ==> alfabetik s�raya koyuyor. (Natural Order)

	}

}
