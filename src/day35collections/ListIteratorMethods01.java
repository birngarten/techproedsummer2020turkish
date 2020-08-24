package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods01 {

	public static void main(String[] args) {
		// Elemanlarý A, B, C Stringleri olN BÝR LÝST OLUÞTURUNUZ.

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);// [A, B, C]

		
		// list iterator oluþturunuz ve list elemanlarýný console yazdýrýnýz.
		ListIterator<String> listIterator = list.listIterator();
		
		while (listIterator.hasNext()) {//listIterator ýn elemanlar arasýnda gezmek ýcýn herzaman while() döngüsü kullanýlýr.
			Object element = listIterator.next();
			System.out.print(element + " "); //A B C
			
		}
		System.out.println();
		//hasPrevious() bir öncesinde eleman var mý yok mu diye bakar. vehasNext'in tersi
		//hasPrevious() ve previous() methodlarýný kullanarak bir listin elemanlarýný tersten yazdýrmak isterseniz, 
		//mutlaka önce hasNext() ve next() kullanmalýsýnýz.
		while(listIterator.hasPrevious()) {
			Object element = listIterator.previous();
			System.out.print(element + " ");//C B A 
			
		}

	}

}
