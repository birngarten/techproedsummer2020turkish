package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02 {

	public static void main(String[] args) {
		//Elemanlarý A, B,C olan bir list oluþturunuz,
		//Listiterator kullanarak bu elemanlarý AW,BW,CW'ye donüþtürünüz.
		
		List<String> list = new ArrayList<>(); 
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		ListIterator<String> listIterator = list.listIterator();
		
		//elemanlarý AW BW CW yapma!
		while(listIterator.hasNext()) {
			Object element = listIterator.next();
			listIterator.set(element + "W");//set() methodu en baþtaki listi deðiþtiriyor.
			
		}
		System.out.println(list);//[AW, BW, CW] 
		
		listIterator.add("Ali");
		listIterator.add("Veli");
		
		System.out.println(list);//[AW, BW, CW, Ali, Veli]
		

	}

}
