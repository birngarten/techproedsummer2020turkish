package day35collections;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		// LinkedList bir Class't�r.
		//Linked list'de head hari� her eleman i�in bir data bir de pointer var.
		//head de sadece pointer var.
		//Her eleman�n pointer'� bir sonraki elman� g�sterir.
		//Son eleman�n(tail) pointer'� null g�sterir.
		//Data ve pointer i�eren her eleman�n di�er ad� "Node" dur
		//linked List eleman ekleme ve ��karma durumlar�nda ba�ar�l�d�r.
		
		// linkedList de her elaman bir sonraki elemana baglidir.
        //diyelim ki bir program yazarken bir list olusturmamiz lazim(eleman silmek ve eleman eklemek icin)
		//o zaman linkedlist kullanmaliyim cunku hatasiz ve hizli calisir.
		//tek tek indexlere bakmaz. direk navigasyon cihazi gibi o indexdeki elemani bulur.


		
		//LinkedList objesi olu�turunuz
		LinkedList<String> linkList = new LinkedList<>();
		linkList.add("Mark");
		linkList.add("Amanda");
		linkList.add("John");
		linkList.add("Ann");
		linkList.add("Pamela");
		System.out.println(linkList); //[Mark, Amanda, John, Ann, Pamela]
		
		linkList.remove(2);//John buradan silindi
		System.out.println(linkList);//[Mark, Amanda, Ann, Pamela]

		linkList.removeFirst();//ilk eleman Mark gitti
		System.out.println(linkList);//[Amanda, Ann, Pamela]
		
		linkList.removeLast();//Son eleman Pamela gitti 
		System.out.println(linkList);//[Amanda, Ann]
		
		linkList.add(1, "Ali");//Ali'yi 1. indexe ekler
		System.out.println(linkList);//[Amanda, Ali, Ann]
		
		linkList.addFirst("Kemal");//Kemal'i ilk yere ekledi
		System.out.println(linkList);//[Kemal, Amanda, Ali, Ann]
		
		linkList.addLast("Zeynep");//Zeynep'i son yere ekledi
		System.out.println(linkList);//[Kemal, Amanda, Ali, Ann,Zeynep]
		
		linkList.set(1, "Ajanda");//Amanda Ajanda olacak
		System.out.println(linkList);//[Kemal, Ajanda, Ali, Ann, Zeynep]
		
		LinkedList<String> linkList2 = new LinkedList<>();
		linkList2.add("X");
		linkList2.add("Y");
		
		linkList.addAll(linkList2); //linkList'e linkList2'nin elemanlar�n� ekler
		System.out.println(linkList);//[Kemal, Ajanda, Ali, Ann, Zeynep, X, Y]
		
		linkList2.addAll(linkList);
		System.out.println(linkList2);//[X, Y, Kemal, Ajanda, Ali, Ann, Zeynep, X, Y]
		
		linkList.addAll(3, linkList2);//index 3'e eleman silinmeden linkList2'nin tamam� gelecek.
		System.out.println(linkList);//[Kemal, Ajanda, Ali, X, Y, Kemal, Ajanda, Ali, Ann, Zeynep, X, Y, Ann, Zeynep, X, Y]
		
		
		System.out.println(linkList2.contains("Can"));//false
		System.out.println(linkList2.contains("Ali"));//true
		
		linkList2.clear();//Elemanlar�n�n tamam�n� siler
		System.out.println(linkList2);//[]
		
		
	}

}
