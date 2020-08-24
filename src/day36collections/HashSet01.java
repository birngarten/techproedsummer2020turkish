package day36collections;

import java.util.HashSet;

public class HashSet01 {

	public static void main(String[] args) {
		//HashSet;
		//	1) Tekrarl� eleman kullan�m�na (Duplication) izin vermez.
		//	2) Key-value yap�s�n� kullan�r. Key'ler ve Value'lar HashSet i�in uniqye'dir.
		//		Normalde; Key'ler har zaman uniquedir., Value'lar kullan�lan Classa ba�l�
		//		olarak unique olabilir veya olmayabilir. Kullan�lan class HasSet ise Value'lar da unique olur 
		//		ama ArrayList ise unique olma zorunlulu�u yoktur.
		
		HashSet<String> hSet = new HashSet<>();
		//Listlerde add() methodu hep yeni eleman� sona ekler. Ama HashSet'lerde �yle bir zorunluluk yok.
		// HashSet'lerde elemanlar�n� ekrana rasgele yazd�r�r, kural yoktur.
		hSet.add("Apple");
		hSet.add("Mango");
		hSet.add("Grape");
		hSet.add("Orange");
		hSet.add("Fig");
		hSet.add("Apple");//Ekleme yapmaz, ��nk� HashSet duplicationa izin vermez. Listede tek bir Apple var. Herhangi bir Error vermez.
		System.out.println(hSet); //[Apple, Fig, Grape, Mango, Orange] 
		
		
		
		
	}

}
