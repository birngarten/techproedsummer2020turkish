package day37maps;

import java.util.TreeMap;

public class Map03 {

	public static void main(String[] args) {
		/* TreeMap :
		 * 			1) TreeMap key'lerde null kullanmaya musaade etmez ama value'lerde birden fazla null kullanmaya izin verir
		 * 			2) TreeMap elemanlar�n� key'lere g�re natural order return eder.
		 * 			3) TreeMap en yava� map'tir
		 */
		
		TreeMap<String, Integer> tMap = new TreeMap<>();
		tMap.put("Kanaat", null);
		tMap.put("Bezelye",7);
		tMap.put("Elma", 10);
		tMap.put("Armut", 8);
		System.out.println(tMap);//{Armut=8, Bezelye=7, Elma=10, Kanaat=null} ==> key'e g�re alfabetik s�ra yapt�
		
		//Di�er methodlar� kullanmada di�er map'ler ile fark� yok. Hepsini kullan�r.

	}

}
