package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods01 {

	public static void main(String[] args) {
		// Elemanlar� A, B, C Stringleri olN B�R L�ST OLU�TURUNUZ.

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);// [A, B, C]

		
		// list iterator olu�turunuz ve list elemanlar�n� console yazd�r�n�z.
		ListIterator<String> listIterator = list.listIterator();
		
		while (listIterator.hasNext()) {//listIterator �n elemanlar aras�nda gezmek �c�n herzaman while() d�ng�s� kullan�l�r.
			Object element = listIterator.next();
			System.out.print(element + " "); //A B C
			
		}
		System.out.println();
		//hasPrevious() bir �ncesinde eleman var m� yok mu diye bakar. vehasNext'in tersi
		//hasPrevious() ve previous() methodlar�n� kullanarak bir listin elemanlar�n� tersten yazd�rmak isterseniz, 
		//mutlaka �nce hasNext() ve next() kullanmal�s�n�z.
		while(listIterator.hasPrevious()) {
			Object element = listIterator.previous();
			System.out.print(element + " ");//C B A 
			
		}

	}

}
