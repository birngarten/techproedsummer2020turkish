package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// Array'lerde length sabittir, de�i�tirilemez.
		// ArrayList'lerde (List) length esnektir. 
		//Siz eleman ekledik�e veya sildik�e List length'ini art�r�r veya eksiltir.
		
		List<String> list01 = new ArrayList<>();
		System.out.println(list01);//[]
		
		//List'e eleman eklemek i�in *** add() *** methodu kullan�l�r.
		
		list01.add("Ali");
		System.out.println(list01);//[Ali]
		
		list01.add("Can");
		System.out.println(list01); //[Ali, Can] ==> �nce ekleneni one koyar
		
		//Veli'yi Ali ile Can'�n aras�na ekleyelim ==> ***add(0,"ali") methodu***
		list01.add(1, "Veli");
		System.out.println(list01);//[Ali, Veli, Can]
		
		//[Han,Ali,Kemal,Veli, Can,Ayse] yazd�ral�m.
		list01.add(0, "Han");
		list01.add(2, "Kemal");
		list01.add(5, "Ayse");
		System.out.println(list01);
		System.out.println(list01);
		
		//list01'in eleman say�s�n� ekrana yazd�rma ***size() method*** ==> list01.size
		System.out.println(list01.size());
		
	}

}
