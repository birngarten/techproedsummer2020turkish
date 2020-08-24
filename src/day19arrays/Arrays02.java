package day19arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// 4 elemanlý bir char  Array oluþturun. Bu Array'e elemanlar yerleþtirin
		// Tum elemnalarý for döngüsü kullanarak ekrana yazdýrýn
		// sadece son elemaný ekrana yazdýrýn
		
		char arr1 [] = {'N','E','S','T'};
	
		for(int i=0; i<4; i++) {
			System.out.print(arr1[i] +" ");
			
			
		}System.out.println();
		
//		Array'in length'ini bulmak için " ArrayIsmi.length" yazarýz.
		// String'lerde parantezli (length), Array'lerde parantezsiz length" kullanýlýr.
		System.out.println(arr1.length);// 4 ==> Array'in uzunluðu
		
		//Array'deki son elemaný yazdýrmak için;
		System.out.println(arr1[arr1.length-1]); // T
	}

}
