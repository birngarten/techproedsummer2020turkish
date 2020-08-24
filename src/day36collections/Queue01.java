package day36collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		// Queue;
		//	Queue eklenen elemanlar list'lerde oldu�u gibi en sona eklenir.
		//	Queue'da silinen elemanlar en ba�tan silinir.
		//	[1,2,3] ==> Bu Queue'da eleman silmeye ba�lad���n�zda �nce 1 silinir.
		//	FIFO ==> First In First Out
		
		
//		// PriorityQueue elemanlar� natural order'a g�re s�ralar.
//		Queue<String> q = new PriorityQueue<>();
//		q.add("B");
//		q.add("A");
//		q.add("C");
//		System.out.println(q);//[A, B, C]
//		
//		//remove() methodu kullanal�m
//		System.out.println("Silinen eleman: "+ q.remove());//A ==> remove() methodu sildi�i eleman� return eder.
//		System.out.println("Kalan queue: "+q);//[B, C] ==> A silindi
//		System.out.println(q.remove("C"));//true ==> ��nk� biz javaya C'yi sil dedik, Oda tamam dedi true
//		System.out.println(q);//[B]
//		
//		//LinkesdL�st elemanlar� girilen s�raya g�re yazd�r�r.
		Queue<String> qll = new LinkedList<>();
		qll.add("B");
		qll.add("A");
		qll.add("C");
		System.out.println(qll);//[B, A, C]
		
		System.out.println("ilk eleman: " +qll.element());//B ilk eleman� return eder
		
		System.out.println(qll.poll());//B'yi ald� ve Queue'da art�k B yok. sildi ve return etti.
		System.out.println(qll);//[A, C]
		
		//NOT : remove() methodu bo� Queue'lar i�in kullan�l�rsa Exception verir.
		//		poll() methodu bo� Queue'lar i�in kullan�l�rsa null verir.
		//		Dolu Queue'lar da iki method ayn� i�i yapar, siler, farklar� yoktur.

	}

}
