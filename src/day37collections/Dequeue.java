package day37collections;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {

	public static void main(String[] args) {
		// Deque; Double Ended Queue (Iki U�lu Queue)
		// ==> Queue'larda ekleme sona yap�l�r, silme ba�tan yap�l�r.
		// Deque eklemeyi hem ba�a hem de sona yapabilir.
		// ayn� �ekilkde silmeyi de hem ba�tan hem de sondan yap�labilir.
		// Deque'da F�FO(first in first out) var, ayr�ca LIFO(Last In First Out)'da var
		
		// Queue'lara eleman olarak null eklenebilir ama Deque'lara null eleman olarak eklenmez.
		
		Deque<String> dq = new LinkedList<>();
		dq.add("Son1");
		dq.addFirst("Ba�1");
		dq.addLast("Son2");//sout==>[Ba�1, Son1, Son2]
		dq.push("Bas2");//sout==>[Bas2, Ba�1, Son1, Son2]===> ***** push() en ba�a ekler.
		dq.offer("Son3");//sout==>[Bas2, Ba�1, Son1, Son2, Son3] ===> ******offer() en sona ekler.
		dq.offerFirst("Bas3");//sout==> [Bas3, Bas2, Ba�1, Son1, Son2, Son3]
		dq.offerLast("Son4"); //sout==> [Bas3, Bas2, Ba�1, Son1, Son2, Son3, Son4]
		System.out.println(dq);//[Eleman Ba� 1, Eleman Son 1]
		
		//pop() methodu Deque'larda ba�taki eleman� siler ve ba�taki eleman� return eder.
		System.out.println(dq.pop());//==> Bas3 ==> En ba�takini silecek yani  ==>[Bas3, Bas2, Ba�1, Son1, Son2, Son3, Son4]
		System.out.println(dq);//[Bas2, Ba�1, Son1, Son2, Son3, Son4] ==> art�k Bas3 yok
		
		System.out.println(dq.removeLast());//Son4 ==> en son eleman� sildi ve return etti.
		System.out.println(dq);//[Bas2, Ba�1, Son1, Son2, Son3] ==> art�k Son4 yok
		
		System.out.println(dq.removeFirst());//Bas2 ==> en ba� eleman� sildi ve return etti
		System.out.println(dq);//[Ba�1, Son1, Son2, Son3] ==> art�k Bas2 yok
		
		
		

	}

}
