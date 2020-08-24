package day37maps;

import java.util.Hashtable;

public class Maps02 {

	public static void main(String[] args) {
		/* HashTable :
		 * 			HashMap ile hemen hemen aynýdýr.
		 * 			1) HashTable console yazdýrýldýðýnda HashMap gibi rastgele sýralamada yazdýrýr.
		 * 		Farklarý:
		 * 			1) HashTable Key ve value'larda null'a müsaade etmez.
		 * 			2) HashTable thread safe'dir. Birkaç iþi ayný anda yapabilir.
		 * 			3) HashTable HashMap'e göre daha yavaþtýr.
		 * 
		 */
		
		Hashtable<String, String> hTable = new Hashtable<>();
		hTable.put("Dil", "Kalp");
		hTable.put("Gönul", "Kalp");
		hTable.put("Dil", "Tat alma Organý");
		System.out.println(hTable);//{Gönul=Kalp, Dil=Tat alma Organý} ==> ayný key birden fazla kullanýlýrsa son value'yu return eder
		
		hTable.put("Ali", "");
		hTable.put("", "Ayþe");
		System.out.println(hTable);//{Gönul=Kalp, Ali=, Dil=Tat alma Organý, =Ayþe}
		
		//===>  hTable.put(null, "Aðýzlýk");//Run Time Error ==> key ve value null olamaz!!!
		//===>  hTable.put("Kanaat", null);//Run Time Error	==> key ve value null olamaz!!!
		
		
		//HashMap'te kullanýlan methodlar HashTable'de de kullanýlýr.

	}

}
