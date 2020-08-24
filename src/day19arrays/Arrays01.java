package day19arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		// Integer Array oluþturma
		
		int arr1[] = new int[5];
//		System.out.println(arr1); //Array'in reference'ini ekrana yazdýrýr.
//		System.out.println(arr1[2]); // Array'in index'i 2 olan elemanýný ekrana yazdýrýr.
//		
		arr1[0] = 12; // index'i 0 olana 12 atama yaptýk.
		System.out.println(arr1[0]);
//		
		arr1[1] = 13;// index'i 1 olana 13 atama yaptýk.
		System.out.println(arr1[1]);
//		
		arr1[2] = 17;// index'i 2 olana 17 atama yaptýk.
		System.out.println(arr1[2]);
//		
		arr1[3] = 23;// index'i 3 olana 23 atama yaptýk.
		System.out.println(arr1[3]);
		arr1[4] = 25;// index'i 4 olana 25 atama yaptýk.
		System.out.println(arr1[4]);
//		
		// Array'dei elemanlarý ekrana yazdýrmak için for döngüsü kullanýnýz.
		
		for(int i=0; i<5; i++) {
			System.out.println(arr1[i]);
			
		
			//Array'de olmayan index'e deger atamasý
			
			arr1[5] = 23;
			System.out.println(arr1[5]);// Array'de olmayan index'e deger atamasý yapýlýrsa Run Time Error verir.
//										// Array'de   "		 index'i kullanýrsak "ArrayIndexOutOfBoundsException" alýrýz.
			
		}
	}

}
