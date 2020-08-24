package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		//equals() methodu iki list'in biribirine esit olup olmadýðýný return eder.
		//List'ler esit ise true; deðilse false return eder.
		//equals() methodu ayný index'de ayný eleman olunca true verir. index yeri ÖNEMLÝ!!!
		//equals() methodu fotokopi gibi birbirinin aynýsý olmalý.
		//equals() methodu objelerin reference(adres)'larýna bakmaz
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		list1.equals(list2); //iki List'i bribiriyle karsýlaþtýrýr. eþit ise true, deðilse false yazar.
		System.out.println(list1.equals(list2));//true
		
		list1.add("A");
		list1.add("B");
		System.out.println(list1.equals(list2));//false
		
		list2.add("B");
		list2.add("A");
		System.out.println(list1.equals(list2));//false ==> elemanlarýný kontrol ediyor, sayýlarýný deðil.

	}

}
