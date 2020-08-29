package day39lambda;

import java.util.ArrayList;
import java.util.List;

public class L01 {
	/*
	 Lambda = Functional Programming
	 Normal Java = Structured Programming
	 */

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		list.add("Kemal");
		list.add("Mucella");
		list.add("Ayse");
		list.add("Emine");
		System.out.println(list);
		
//		Listin tum elemanlarini ekrana yazdiriniz.
//		1.YOL: Structured Programming
		for(String w : list) {
			System.out.println(w);			
	
		}
		
//		2.YOL: Lambda (Functional Programming) 
		list.
			stream().
			forEach(t->System.out.println(t)); // t->System.out.println(t) ==> Lambda Expression
		
//		list'in icindeki harf sayisi 5'ten az olanlari yaziniz?
//		1.YOL: Structured Programming
		for(String w : list) {
			if(w.length()<5) {
				System.out.println("harf sayisi 5'ten az : " +w);
			}
		}
//		2.YOL: Structured Programming
		list.
			stream().
			filter(t->t.length()<5).
			forEach(t->System.out.println("harf sayisi 5'ten az : " + t));
		
//		list'in icindeki son harfi e  olanlari yaziniz?
		list.
		stream().
		filter(t-> t.endsWith("e")).
		forEach(t->System.out.println(t + " "));
		

//		list'in icindeki a harfi icerenleri ekrana  olanlari yaziniz?
		list.
		stream().
		filter(t-> t.contains("a")).
		forEach(t->System.out.print(t+" "));
		
		System.out.println();
//		list'in icindeki elemanlardan karakter sayisi 4'ten fazla UPPERCASE yaparak  ekrana yaziniz?
		list.
		stream(). // *** Elemanlari yukaridan asagiya dizer
		filter(t->t.length()>4). // *** Belli sartlara gore eleman secmemize yarar
		map(t->t.toUpperCase()). //*** map() : Elemanlari update(degistirme) etmek icin kullanilir
		forEach(t->System.out.print(t+" ")); // Loop'lar gibi her bir elemani birer birer alarak islem yapar
		
//		list'in icindeki elemanlarin eleman sayilarini(size) yaziniz?
		list.stream().map(t->t.length()).forEach(t->System.out.print(t+" "));
		
//		list'in icindeki elemanlardan icinde e olanlarin eleman sayilarinin karesini yaziniz?
		list.
		stream().
		filter(t->t.contains( "e")).
		map(t->t.length()*t.length()).
		forEach(t->System.out.print(t + " "));
		
		
		
		
		
	}
}
