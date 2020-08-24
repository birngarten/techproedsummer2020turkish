package day22arraylist;

public class OdevForEachLoop01 {

	public static void main(String[] args) {

		// Soru 1 ) Bir integer array oluþturunuz ve bu array’deki tum sayýlarýn çarpýmýný
		// For-each loop kullanarak bulunuz. Sonucu ekrana yazdýrýnýz

		int arr[] = { 2, 3, 7, 4, 5 };

		int prod = 1;

		for (int w : arr) {
			prod *= w;
		}
		System.out.println(prod);
	}

}
