package day36collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		// Queue;
		//	Queue eklenen elemanlar list'lerde olduðu gibi en sona eklenir.
		//	Queue'da silinen elemanlar en baþtan silinir.
		//	[1,2,3] ==> Bu Queue'da eleman silmeye baþladýðýnýzda önce 1 silinir.
		//	FIFO ==> First In First Out
		
		
//		// PriorityQueue elemanlarý natural order'a göre sýralar.
//		Queue<String> q = new PriorityQueue<>();
//		q.add("B");
//		q.add("A");
//		q.add("C");
//		System.out.println(q);//[A, B, C]
//		
//		//remove() methodu kullanalým
//		System.out.println("Silinen eleman: "+ q.remove());//A ==> remove() methodu sildiði elemaný return eder.
//		System.out.println("Kalan queue: "+q);//[B, C] ==> A silindi
//		System.out.println(q.remove("C"));//true ==> Çünkü biz javaya C'yi sil dedik, Oda tamam dedi true
//		System.out.println(q);//[B]
//		
//		//LinkesdLÝst elemanlarý girilen sýraya göre yazdýrýr.
		Queue<String> qll = new LinkedList<>();
		qll.add("B");
		qll.add("A");
		qll.add("C");
		System.out.println(qll);//[B, A, C]
		
		System.out.println("ilk eleman: " +qll.element());//B ilk elemaný return eder
		
		System.out.println(qll.poll());//B'yi aldý ve Queue'da artýk B yok. sildi ve return etti.
		System.out.println(qll);//[A, C]
		
		//NOT : remove() methodu boþ Queue'lar için kullanýlýrsa Exception verir.
		//		poll() methodu boþ Queue'lar için kullanýlýrsa null verir.
		//		Dolu Queue'lar da iki method ayný iþi yapar, siler, farklarý yoktur.

	}

}
