package day22arraylist;

public class OdevForEachLoop01 {

	public static void main(String[] args) {

		// Soru 1 ) Bir integer array olu�turunuz ve bu array�deki tum say�lar�n �arp�m�n�
		// For-each loop kullanarak bulunuz. Sonucu ekrana yazd�r�n�z

		int arr[] = { 2, 3, 7, 4, 5 };

		int prod = 1;

		for (int w : arr) {
			prod *= w;
		}
		System.out.println(prod);
	}

}
