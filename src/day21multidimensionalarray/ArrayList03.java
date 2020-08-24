package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		// ["Ali", "Can", "Ayse", "Ali"] oluþturun

		List<String> list = new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Ali");
		System.out.println(list);
		
		//***remove() *** methodu eleman siler
		
		list.remove("Ali");
		System.out.println(list);//ilk Ali gitti. Birden fazla ayný eleman varsa remove() ilkini siler.
		
		list.remove("Kemal");
		System.out.println(list);//remove() methodu liste de olmayan elamaný silmeye çalýþtýðýmýzdsa hata vermez.
		//remove() methodunda parantez içine sayý yazýldýðýnda java onu index kabul eder ve o index list'e yoksa Exception verir 
		System.out.println(list.remove("Ali"));//var olan elamanlardan birini sildiðinde ===> true sonucunu verir. olmayan eleman için false der.
		System.out.println(list.remove(0)); //ilk elemaný siler ve ekrana onu getirir.
		
		//***Ayse elemanýný Aysegul yapalým***
		
		// Bunun için ===> *****set()****** methodu kullanýlýr. *****
		list.set(0, "Aysegul");
		System.out.println(list);
		System.out.println(list.set(0, "Aysegul"));
		
		//List'e Kenan ve Zeynep ekleyin
		
		list.add("Kenan");
		list.add("Zeynep");
		System.out.println(list);//[Aysegul, Kenan, Zeynep]
		
		list.clear(); //===> clear() tüm elemanlarý siler
		System.out.println(list);//[] ==> tüm elemanlarý sildi
		
		System.out.println(list.isEmpty());// true ==> yani list boþ.
	}

}
