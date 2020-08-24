package day03operators;

public class Day03odev01 {

	public static void main(String[] args) {
		

		
		//4) double 100.235 i int’e çevirip ekrana yazdiriniz.
		
		double dsayi = 100.235;
		int dcevir = (int) dsayi;
		
		System.out.println(dcevir); // 100
		
		
		
		//5) int data type’ýnda oluþturulan 5 sayýsý ile double data type’ýnda oluþturulan
		// 6.2 sayýsýný toplayýp sonucu ekrana yazdýrýnýz.
		
		System.out.println(" Int data type 5 sayiyi double tada type 6.2 ile toplayin!");
		
		int i1 = 10;
		int i2 = 15;
		int i3 = 23;
		int i4 = 32;
		int i5 = 44;
		
		double d1 = 6.2;
		
		int id1 = (int) d1;
		
		System.out.println(i1+i2+i3+i4+i5+id1); // 130
		
		
		// 6) Ekranda ne görürüsünüz?
		
		short num1 = 255;
		byte num2 = (byte) num1;
		
		System.out.println(num2); //-1
		
		
		
			
		
		
		
	}

}
