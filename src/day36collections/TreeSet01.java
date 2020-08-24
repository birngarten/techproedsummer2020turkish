package day36collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		// TreeSet;
		//	1) HashSet ile benzer.Duplicationa m�saade etmez. Key-value yap�s� kullan�r
		//	2) TreeSet elemanlar�n� natural order'a g�re dizer. 
		//	   HashSet ise elemanlar�n� rastgele dizer
		//	3) HashSet TreeSet'e g�re daha h�zl�d�r.
		//	4) Natural Order'a sahip bir Set laz�m oldu�unda HashSet olu�turulur, elemanlar eklenir 
		//	   sonra bu HashSet TreeSet'e d�n��t�r�l�r,  bu �ekilde h�z problemi halledilir.
		
		
		TreeSet<String> tSet = new TreeSet<>();
		tSet.add("ABC");
		tSet.add("String");
		tSet.add("Test");
		tSet.add("Pen");
		tSet.add("Ink");
		tSet.add("Jack");		
		System.out.println(tSet);//[ABC, Ink, Jack, Pen, String, Test] ==> G�r�ld��� gibi alfabetik s�raya dizdi.
		
		HashSet<String> hSet1 = new HashSet<>(); //Bir HashSet olu�turduk
		hSet1.add("ABC");
		hSet1.add("String");
		hSet1.add("Test");
		hSet1.add("Pen");
		hSet1.add("Ink");
		hSet1.add("Jack");
		System.out.println(hSet1);//[ABC, Test, Ink, Pen, String, Jack]//HashSet olunca rastgele dizdi
		
		//HashSet TreeSet'e d�n��t�rme;
		//BU vesile ile HashSet'in h�z� ile TreeSet'in natural order'�n� birle�tirmi� oluyoruz.
		//Olu�turt�umuz HashSet'i TreeSet constructor'�na parametre olarak koyup TreeSet'e ceviririz.
		//B�ylelikle TreeSet'in elemanlar� natural order yapma �zelli�inden istifade etmi� oluruz.
		
		TreeSet<String> tSet1 = new TreeSet<>(hSet1);
		System.out.println(tSet1);//[ABC, Ink, Jack, Pen, String, Test] ==> Alfabetik s�raya dizdi.
		

	}

}
