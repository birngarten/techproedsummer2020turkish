package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		// ["Ali", "Can", "Ayse", "Ali"] olu�turun

		List<String> list = new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Ali");
		System.out.println(list);
		
		//***remove() *** methodu eleman siler
		
		list.remove("Ali");
		System.out.println(list);//ilk Ali gitti. Birden fazla ayn� eleman varsa remove() ilkini siler.
		
		list.remove("Kemal");
		System.out.println(list);//remove() methodu liste de olmayan elaman� silmeye �al��t���m�zdsa hata vermez.
		//remove() methodunda parantez i�ine say� yaz�ld���nda java onu index kabul eder ve o index list'e yoksa Exception verir 
		System.out.println(list.remove("Ali"));//var olan elamanlardan birini sildi�inde ===> true sonucunu verir. olmayan eleman i�in false der.
		System.out.println(list.remove(0)); //ilk eleman� siler ve ekrana onu getirir.
		
		//***Ayse eleman�n� Aysegul yapal�m***
		
		// Bunun i�in ===> *****set()****** methodu kullan�l�r. *****
		list.set(0, "Aysegul");
		System.out.println(list);
		System.out.println(list.set(0, "Aysegul"));
		
		//List'e Kenan ve Zeynep ekleyin
		
		list.add("Kenan");
		list.add("Zeynep");
		System.out.println(list);//[Aysegul, Kenan, Zeynep]
		
		list.clear(); //===> clear() t�m elemanlar� siler
		System.out.println(list);//[] ==> t�m elemanlar� sildi
		
		System.out.println(list.isEmpty());// true ==> yani list bo�.
	}

}
