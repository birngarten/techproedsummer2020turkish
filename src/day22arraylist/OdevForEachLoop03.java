package day22arraylist;

public class OdevForEachLoop03 {

	public static void main(String[] args) {
		// Soru 3) �ki String array olu�turunuz ve bu array�lerdeki ortak elemanlar�
		// For-each loop kullanarak bulunuz. Sonucu ekrana yazd�r�n�z.
		// Ortak eleman yoksa ekrana �Ortak eleman yok� yazd�r�n�z

		String arr1[] = { "gul", "rosa", "rose" };
		String arr2[] = { "rosa", "can", "rose" };

		int count = 0;
		for (String w : arr1) {
			for (String z : arr2) {
				if (w == z) {
					System.out.println(w);
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("Ortak eleman yok");
		}
	}

}
