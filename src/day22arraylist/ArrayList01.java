package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		//equals() methodu iki list'in biribirine esit olup olmad���n� return eder.
		//List'ler esit ise true; de�ilse false return eder.
		//equals() methodu ayn� index'de ayn� eleman olunca true verir. index yeri �NEML�!!!
		//equals() methodu fotokopi gibi birbirinin ayn�s� olmal�.
		//equals() methodu objelerin reference(adres)'lar�na bakmaz
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		list1.equals(list2); //iki List'i bribiriyle kars�la�t�r�r. e�it ise true, de�ilse false yazar.
		System.out.println(list1.equals(list2));//true
		
		list1.add("A");
		list1.add("B");
		System.out.println(list1.equals(list2));//false
		
		list2.add("B");
		list2.add("A");
		System.out.println(list1.equals(list2));//false ==> elemanlar�n� kontrol ediyor, say�lar�n� de�il.

	}

}
