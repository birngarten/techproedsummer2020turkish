package day37maps;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		// Map bir Interface'dir. Map'in 3 tane child class'� vard�r;
		/*	1) HashMap;
		 * 			HashMap key-value yap�s�n� kullan�r. Key ve value programc� taraf�ndan yaz�l�r.
		 * 			Key ve Value'da null de�eri kullan�labilir.
		 * 			Key'de 1 den fazla null de�eri kullan�l�rsa Java son kullan�lan null'� kabul eder.
		 * 			Value'de 1 den fazla null de�eri kullan�labilir.
		 * 			Hash�Map console'a yazd�r�ld���nda hem key de�erleri hem de value de�erleri aralar�na = sembolu ile return eder.
		 * 			HashMap'ler ekrana yazd�r�rken rastgele s�ralama yapar.
		 * 			HashMap map'ler aras�nda en h�zl�s�d�r.
		 *  		 HashMap�ler �therad safe� de�ildir. Bazen bir application�da ayn� anda iki birlikte �al���r.
		 * 			bir application buna m�saitse buna �thread safe� deniyor, yani ayn� anda ba�ka �eyler yapabiliyor.
		 */
		
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(3, "Ali"); //*****put()*****
		hashMap.put(11, "Veli");
		hashMap.put(211, "Mine");
		System.out.println(hashMap);// {3=Ali, 211=Mine, 11=Veli} ==>rastgele s�ralama yapt�
		
		System.out.println();hashMap.remove(11);//Veli==> Sildi�i eleman�n� return etti.
		System.out.println(hashMap);//{3=Ali, 211=Mine}
		
		System.out.println(hashMap.remove(211, "Mine"));//true ==> ****remove****
		System.out.println(hashMap.remove(3, "Ahmet"));//false ==> eleman olarak Ahmet yok ki
		
		System.out.println(hashMap.get(3));//Ali ==>****get()****
		System.out.println(hashMap.get(33));//null ==> b�yle bir key yok
		
		hashMap.put(21, "Liza");
		System.out.println(hashMap);//{3=Ali, 21=Liza}
		
		System.out.println(hashMap.keySet());//[3, 21] *****keySet()**** ==> sadece key'leri verdi.
		
		System.out.println(hashMap.values());//[Ali, Liza]
		
		System.out.println(hashMap.size());//2 ==> *****size()**** ==> eleman say�s�n� return eder
		
		System.out.println(hashMap.containsKey(21));//true *****containsKey() ****
		System.out.println(hashMap.containsKey(45));//false
		
		System.out.println(hashMap.containsValue("Ali"));//true ******containsValue() ****
		System.out.println(hashMap.containsValue("Can"));//false
		
		hashMap.replace(3, "Emin");
		System.out.println(hashMap);//{3=Emin, 21=Liza}==> Ali, Emin oldu. *****replace()****
	
		
		hashMap.clear();// T�m elemanlar� siler
		System.out.println(hashMap);//{}
	}

}
