package day19arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		// Integer Array olu�turma
		
		int arr1[] = new int[5];
//		System.out.println(arr1); //Array'in reference'ini ekrana yazd�r�r.
//		System.out.println(arr1[2]); // Array'in index'i 2 olan eleman�n� ekrana yazd�r�r.
//		
		arr1[0] = 12; // index'i 0 olana 12 atama yapt�k.
		System.out.println(arr1[0]);
//		
		arr1[1] = 13;// index'i 1 olana 13 atama yapt�k.
		System.out.println(arr1[1]);
//		
		arr1[2] = 17;// index'i 2 olana 17 atama yapt�k.
		System.out.println(arr1[2]);
//		
		arr1[3] = 23;// index'i 3 olana 23 atama yapt�k.
		System.out.println(arr1[3]);
		arr1[4] = 25;// index'i 4 olana 25 atama yapt�k.
		System.out.println(arr1[4]);
//		
		// Array'dei elemanlar� ekrana yazd�rmak i�in for d�ng�s� kullan�n�z.
		
		for(int i=0; i<5; i++) {
			System.out.println(arr1[i]);
			
		
			//Array'de olmayan index'e deger atamas�
			
			arr1[5] = 23;
			System.out.println(arr1[5]);// Array'de olmayan index'e deger atamas� yap�l�rsa Run Time Error verir.
//										// Array'de   "		 index'i kullan�rsak "ArrayIndexOutOfBoundsException" al�r�z.
			
		}
	}

}
