package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// Array'lerde length sabittir, deðiþtirilemez.
		// ArrayList'lerde (List) length esnektir. 
		//Siz eleman ekledikçe veya sildikçe List length'ini artýrýr veya eksiltir.
		
		List<String> list01 = new ArrayList<>();
		System.out.println(list01);//[]
		
		//List'e eleman eklemek için *** add() *** methodu kullanýlýr.
		
		list01.add("Ali");
		System.out.println(list01);//[Ali]
		
		list01.add("Can");
		System.out.println(list01); //[Ali, Can] ==> önce ekleneni one koyar
		
		//Veli'yi Ali ile Can'ýn arasýna ekleyelim ==> ***add(0,"ali") methodu***
		list01.add(1, "Veli");
		System.out.println(list01);//[Ali, Veli, Can]
		
		//[Han,Ali,Kemal,Veli, Can,Ayse] yazdýralým.
		list01.add(0, "Han");
		list01.add(2, "Kemal");
		list01.add(5, "Ayse");
		System.out.println(list01);
		System.out.println(list01);
		
		//list01'in eleman sayýsýný ekrana yazdýrma ***size() method*** ==> list01.size
		System.out.println(list01.size());
		
	}

}
