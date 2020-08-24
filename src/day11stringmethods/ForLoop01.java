package day11stringmethods;

public class ForLoop01 {

	public static void main(String[] args) {
		
		//4, 3, ve 2 yi ekrana yazdýran for loop oluþturun.
		
		for (int i=4; i>1; i--) {
			System.out.println(i);
		}
		
		// 3,4,5,6,7 sayýlarýný ekrana yazdýran for loop oluþturunuz
		for (int i=3; i<8; i++) {
			System.out.println(i);
		}
		
		
		//Ýlk yüz sayma sayýsýný ekrana yan yana yazdýran ve aralarýna boþluk koyan programý
		//for loop kullanarak yaziniz
		
		for (int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		
		//Ýlk yüz sayma sayýsýný 100 den 1e dogru ekrana yan yana yazdýran ve aralarýna boþluk koyan programý
		//for loop kullanarak yaziniz
				
		for (int i=100; i>0; i--) {
			System.out.print(i+" ");
		
	}
		
		//ilk 50 cift sayma sayýsýný yazdýrýn.
		
		for (int i=2; i<101; i=i+2) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		//Ýlk 50 tekli sayýyý yazdýrýn
		for (int i=1; i<100; i+=2) {
			System.out.print(i+" ");
		}
		
		
		
	}
}