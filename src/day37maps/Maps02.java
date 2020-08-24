package day37maps;

import java.util.Hashtable;

public class Maps02 {

	public static void main(String[] args) {
		/* HashTable :
		 * 			HashMap ile hemen hemen ayn�d�r.
		 * 			1) HashTable console yazd�r�ld���nda HashMap gibi rastgele s�ralamada yazd�r�r.
		 * 		Farklar�:
		 * 			1) HashTable Key ve value'larda null'a m�saade etmez.
		 * 			2) HashTable thread safe'dir. Birka� i�i ayn� anda yapabilir.
		 * 			3) HashTable HashMap'e g�re daha yava�t�r.
		 * 
		 */
		
		Hashtable<String, String> hTable = new Hashtable<>();
		hTable.put("Dil", "Kalp");
		hTable.put("G�nul", "Kalp");
		hTable.put("Dil", "Tat alma Organ�");
		System.out.println(hTable);//{G�nul=Kalp, Dil=Tat alma Organ�} ==> ayn� key birden fazla kullan�l�rsa son value'yu return eder
		
		hTable.put("Ali", "");
		hTable.put("", "Ay�e");
		System.out.println(hTable);//{G�nul=Kalp, Ali=, Dil=Tat alma Organ�, =Ay�e}
		
		//===>  hTable.put(null, "A��zl�k");//Run Time Error ==> key ve value null olamaz!!!
		//===>  hTable.put("Kanaat", null);//Run Time Error	==> key ve value null olamaz!!!
		
		
		//HashMap'te kullan�lan methodlar HashTable'de de kullan�l�r.

	}

}
