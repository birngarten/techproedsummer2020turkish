package day03operators;

public class TypeCasting01 {
	
	public static void main(String[] args) {
		
		byte by = 101;
		int sayi1 = by;  // Kucuk data tipini buyuk data tipine cevirmek icin extra kad yazmaya gerek yok.
						// Java bunu otomatik yapýyor. ( Auto Widening)
		
		System.out.println(sayi1); 
		
		int sayi2 = 53;
		byte by2 = (byte) sayi2; //Buyuk data tipini kucuk data tipine Java cevirmez. Bunu manuel yaparýz. 
									//= sonrasýnda data tipini yazmalýyýz. (byte)
		System.out.println(by2);
		
		
		double sayi3 = 23.5;
		int by3 = (int) sayi3;
		
		System.out.println(by3);
		
		
		float sayi4 = -24.9f;
		short by4 = (short) sayi4;
		
		System.out.println(by4);
		
		
		double sayi5 = 4.8;
		double sayi6 = 1.4;
		double sonuc1 = sayi5/sayi6;
		
		System.out.println(sonuc1);
		
		
		int sonuc2 = (int) (sayi5/sayi6);
		System.out.println(sonuc2);
		
		
		int sayi7 = 5;
		int sayi8 = 3;
		int sonuc3 = sayi7/ sayi8;
		
		System.out.println(sonuc3); // Normalde 5/3=1.6666666....ama data tip iny yaparsaniz sadece tam kismi gorursunuz.
		
		
		int sayi9 = 255;
		byte by5 = (byte) sayi9;
		
		System.out.println(by5); //-1 cünkü 255 Byte'n sýnýrlarý içinde yok. Byte toplam 256 (-128...0...127) var. 255 koyduk, 1 tane eksik.
									// bu nedenle sonuç; -1.
		
		
		
		
		
	
	
	}

}
