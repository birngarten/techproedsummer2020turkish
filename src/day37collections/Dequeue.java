package day37collections;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {

	public static void main(String[] args) {
		// Deque; Double Ended Queue (Iki Uçlu Queue)
		// ==> Queue'larda ekleme sona yapýlýr, silme baþtan yapýlýr.
		// Deque eklemeyi hem baþa hem de sona yapabilir.
		// ayný þekilkde silmeyi de hem baþtan hem de sondan yapýlabilir.
		// Deque'da FÝFO(first in first out) var, ayrýca LIFO(Last In First Out)'da var
		
		// Queue'lara eleman olarak null eklenebilir ama Deque'lara null eleman olarak eklenmez.
		
		Deque<String> dq = new LinkedList<>();
		dq.add("Son1");
		dq.addFirst("Baþ1");
		dq.addLast("Son2");//sout==>[Baþ1, Son1, Son2]
		dq.push("Bas2");//sout==>[Bas2, Baþ1, Son1, Son2]===> ***** push() en baþa ekler.
		dq.offer("Son3");//sout==>[Bas2, Baþ1, Son1, Son2, Son3] ===> ******offer() en sona ekler.
		dq.offerFirst("Bas3");//sout==> [Bas3, Bas2, Baþ1, Son1, Son2, Son3]
		dq.offerLast("Son4"); //sout==> [Bas3, Bas2, Baþ1, Son1, Son2, Son3, Son4]
		System.out.println(dq);//[Eleman Baþ 1, Eleman Son 1]
		
		//pop() methodu Deque'larda baþtaki elemaný siler ve baþtaki elemaný return eder.
		System.out.println(dq.pop());//==> Bas3 ==> En baçtakini silecek yani  ==>[Bas3, Bas2, Baþ1, Son1, Son2, Son3, Son4]
		System.out.println(dq);//[Bas2, Baþ1, Son1, Son2, Son3, Son4] ==> artýk Bas3 yok
		
		System.out.println(dq.removeLast());//Son4 ==> en son elemaný sildi ve return etti.
		System.out.println(dq);//[Bas2, Baþ1, Son1, Son2, Son3] ==> artýk Son4 yok
		
		System.out.println(dq.removeFirst());//Bas2 ==> en baþ elemaný sildi ve return etti
		System.out.println(dq);//[Baþ1, Son1, Son2, Son3] ==> artýk Bas2 yok
		
		
		

	}

}
