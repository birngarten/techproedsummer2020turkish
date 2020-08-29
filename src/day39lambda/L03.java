package day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class L03 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Ali");
		list.add("Mark");
		
//		SORU : List elemanlarindan tekrarli olanlari 1 kere yazmak sartiyla ekrana sirali yazdirin
		list.
			stream().
			distinct().
			sorted().
			forEach(System.out::println);
		
		System.out.println("====================");
//		SORU : List elemanlarindan tekrarli olanlari 1 kere yazmak sartiyla ekrana uzunluklarina gore
//		 siralayarak yazdirin	
		list.
		  stream().
		  distinct().
		  sorted(Comparator.comparing(t->t.length())).
		  forEach(System.out::println);
		
		System.out.println("====================");
//		SORU : List elemanlarindan tekrarli olanlari 1 kere yazmak sartiyla ekrana son harflerine gore
//		 siralayarak yazdirin	
		list.
			stream().
			distinct().
			sorted(Comparator.comparing(t->t.substring(t.length()-1))).
			forEach(System.out::println);
		
		System.out.println("====================");		
//		SORU : List elemanlarindan tekrarli olanlari 1 kere yazmak sartiyla ekrana ters olarak
//		  yazdirin
		list.
		stream().
		distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}
}
