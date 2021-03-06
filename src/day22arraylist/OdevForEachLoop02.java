package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class OdevForEachLoop02 {

	public static void main(String[] args) {

		// Soru 2) Bir integer list olu�turunuz ve bu list�deki tum say�lar�n karesinin
		// toplam�n�
		// For-each loop kullanarak bulunuz. Sonucu ekrana yazd�r�n�z.

		List<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(3);
		list.add(4);

		int sum = 0;

		for (int w : list) {
			sum = sum + (w * w);
		}
		System.out.println(sum);
	}

}
