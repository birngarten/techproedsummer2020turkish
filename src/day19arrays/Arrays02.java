package day19arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// 4 elemanl� bir char  Array olu�turun. Bu Array'e elemanlar yerle�tirin
		// Tum elemnalar� for d�ng�s� kullanarak ekrana yazd�r�n
		// sadece son eleman� ekrana yazd�r�n
		
		char arr1 [] = {'N','E','S','T'};
	
		for(int i=0; i<4; i++) {
			System.out.print(arr1[i] +" ");
			
			
		}System.out.println();
		
//		Array'in length'ini bulmak i�in " ArrayIsmi.length" yazar�z.
		// String'lerde parantezli (length), Array'lerde parantezsiz length" kullan�l�r.
		System.out.println(arr1.length);// 4 ==> Array'in uzunlu�u
		
		//Array'deki son eleman� yazd�rmak i�in;
		System.out.println(arr1[arr1.length-1]); // T
	}

}
