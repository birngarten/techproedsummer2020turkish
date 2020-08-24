package day36collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		// TreeSet;
		//	1) HashSet ile benzer.Duplicationa müsaade etmez. Key-value yapýsý kullanýr
		//	2) TreeSet elemanlarýný natural order'a göre dizer. 
		//	   HashSet ise elemanlarýný rastgele dizer
		//	3) HashSet TreeSet'e göre daha hýzlýdýr.
		//	4) Natural Order'a sahip bir Set lazým olduðunda HashSet oluþturulur, elemanlar eklenir 
		//	   sonra bu HashSet TreeSet'e dönüþtürülür,  bu þekilde hýz problemi halledilir.
		
		
		TreeSet<String> tSet = new TreeSet<>();
		tSet.add("ABC");
		tSet.add("String");
		tSet.add("Test");
		tSet.add("Pen");
		tSet.add("Ink");
		tSet.add("Jack");		
		System.out.println(tSet);//[ABC, Ink, Jack, Pen, String, Test] ==> Görüldüðü gibi alfabetik sýraya dizdi.
		
		HashSet<String> hSet1 = new HashSet<>(); //Bir HashSet oluþturduk
		hSet1.add("ABC");
		hSet1.add("String");
		hSet1.add("Test");
		hSet1.add("Pen");
		hSet1.add("Ink");
		hSet1.add("Jack");
		System.out.println(hSet1);//[ABC, Test, Ink, Pen, String, Jack]//HashSet olunca rastgele dizdi
		
		//HashSet TreeSet'e dönüþtürme;
		//BU vesile ile HashSet'in hýzý ile TreeSet'in natural order'ýný birleþtirmiþ oluyoruz.
		//Oluþturtðumuz HashSet'i TreeSet constructor'ýna parametre olarak koyup TreeSet'e ceviririz.
		//Böylelikle TreeSet'in elemanlarý natural order yapma özelliðinden istifade etmiþ oluruz.
		
		TreeSet<String> tSet1 = new TreeSet<>(hSet1);
		System.out.println(tSet1);//[ABC, Ink, Jack, Pen, String, Test] ==> Alfabetik sýraya dizdi.
		

	}

}
