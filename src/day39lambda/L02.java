package day39lambda;

import java.util.ArrayList;
import java.util.List;

public class L02 {

	/*
	 stream()  => elemanlari (List`e eklenen) alt-alta dizer
	forEach()  => for loop gibi, herbir eleman icin islem yapar
	filter()   => if() gibi
	map()  	   => update, degisiklik yapmak icin
	reduce()   => sayilari islem yapmak icin (azaltmak)
	distinct() => tekrarlara izin vermeden elemanlari run eder
	 */
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		
//		Tum cift sayi olan elemanlarinin kuplerini ekrana yazdiriniz		
		list.
			stream().
			filter(t->t%2==0).
			map(t->t*t*t).
			forEach(t->System.out.print(t+" "));
		
		System.out.println();		
//		listeki elemanlarin toplamini ekrana yazdiriniz
		int toplam = list.
						stream().
						reduce(0,(t,u)->t+u);
		System.out.println(toplam);
		
//		listedeki tum tek elemanlarin carpimini ekrana yazdiriniz
		int carpim = list.
						stream().
						filter(t->t%2==1).
						reduce(1, (t,u)->t*u);
		System.out.println(carpim);
		
//		listedeki 3 ile bolunebilen elemanlarin 2 fazlalarinin toplamini ekrana yazdiriniz
		int num = list.
					stream().
					filter(t-> t%3==0).
					map(t->t+2).
					reduce(0, (t,u)-> t+u);
		System.out.println(num);
		System.out.println();
//		listedeki  elemanlari ekrana yazdirin ancak tekrarli olanlari bir kez ekrana yazdiriniz
		list.
			stream().
			distinct().
			forEach(System.out::print); // t->System.out.println(t+ " "); ==> Lambda Expression
						  // Lambda Expression kullanilabilir ama mumkunse "Method Reference" kullanin
						  // "Method Reference" : Class Ismi :: Method Ismi
		
	}

}
