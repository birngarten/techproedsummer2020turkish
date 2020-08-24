package day36collections;

import java.util.HashSet;

public class HashSet01 {

	public static void main(String[] args) {
		//HashSet;
		//	1) Tekrarlý eleman kullanýmýna (Duplication) izin vermez.
		//	2) Key-value yapýsýný kullanýr. Key'ler ve Value'lar HashSet için uniqye'dir.
		//		Normalde; Key'ler har zaman uniquedir., Value'lar kullanýlan Classa baðlý
		//		olarak unique olabilir veya olmayabilir. Kullanýlan class HasSet ise Value'lar da unique olur 
		//		ama ArrayList ise unique olma zorunluluðu yoktur.
		
		HashSet<String> hSet = new HashSet<>();
		//Listlerde add() methodu hep yeni elemaný sona ekler. Ama HashSet'lerde öyle bir zorunluluk yok.
		// HashSet'lerde elemanlarýný ekrana rasgele yazdýrýr, kural yoktur.
		hSet.add("Apple");
		hSet.add("Mango");
		hSet.add("Grape");
		hSet.add("Orange");
		hSet.add("Fig");
		hSet.add("Apple");//Ekleme yapmaz, çünkü HashSet duplicationa izin vermez. Listede tek bir Apple var. Herhangi bir Error vermez.
		System.out.println(hSet); //[Apple, Fig, Grape, Mango, Orange] 
		
		
		
		
	}

}
