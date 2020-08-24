package day37maps;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		// Map bir Interface'dir. Map'in 3 tane child class'ý vardýr;
		/*	1) HashMap;
		 * 			HashMap key-value yapýsýný kullanýr. Key ve value programcý tarafýndan yazýlýr.
		 * 			Key ve Value'da null deðeri kullanýlabilir.
		 * 			Key'de 1 den fazla null deðeri kullanýlýrsa Java son kullanýlan null'ý kabul eder.
		 * 			Value'de 1 den fazla null deðeri kullanýlabilir.
		 * 			HashÖMap console'a yazdýrýldýðýnda hem key deðerleri hem de value deðerleri aralarýna = sembolu ile return eder.
		 * 			HashMap'ler ekrana yazdýrýrken rastgele sýralama yapar.
		 * 			HashMap map'ler arasýnda en hýzlýsýdýr.
		 *  		 HashMap’ler “therad safe” deðildir. Bazen bir application’da ayný anda iki birlikte çalýþýr.
		 * 			bir application buna müsaitse buna “thread safe” deniyor, yani ayný anda baþka þeyler yapabiliyor.
		 */
		
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(3, "Ali"); //*****put()*****
		hashMap.put(11, "Veli");
		hashMap.put(211, "Mine");
		System.out.println(hashMap);// {3=Ali, 211=Mine, 11=Veli} ==>rastgele sýralama yaptý
		
		System.out.println();hashMap.remove(11);//Veli==> Sildiði elemanýný return etti.
		System.out.println(hashMap);//{3=Ali, 211=Mine}
		
		System.out.println(hashMap.remove(211, "Mine"));//true ==> ****remove****
		System.out.println(hashMap.remove(3, "Ahmet"));//false ==> eleman olarak Ahmet yok ki
		
		System.out.println(hashMap.get(3));//Ali ==>****get()****
		System.out.println(hashMap.get(33));//null ==> böyle bir key yok
		
		hashMap.put(21, "Liza");
		System.out.println(hashMap);//{3=Ali, 21=Liza}
		
		System.out.println(hashMap.keySet());//[3, 21] *****keySet()**** ==> sadece key'leri verdi.
		
		System.out.println(hashMap.values());//[Ali, Liza]
		
		System.out.println(hashMap.size());//2 ==> *****size()**** ==> eleman sayýsýný return eder
		
		System.out.println(hashMap.containsKey(21));//true *****containsKey() ****
		System.out.println(hashMap.containsKey(45));//false
		
		System.out.println(hashMap.containsValue("Ali"));//true ******containsValue() ****
		System.out.println(hashMap.containsValue("Can"));//false
		
		hashMap.replace(3, "Emin");
		System.out.println(hashMap);//{3=Emin, 21=Liza}==> Ali, Emin oldu. *****replace()****
	
		
		hashMap.clear();// Tüm elemanlarý siler
		System.out.println(hashMap);//{}
	}

}
