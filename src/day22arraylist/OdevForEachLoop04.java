package day22arraylist;

public class OdevForEachLoop04 {

	public static void main(String[] args) {
		//Soru 4)  Bir String olu�turunuz, bu String�deki character�leri yukar�dan a�a��ya
		// for-each loop kullanarak yazd�r�n�z. �pucu: split()

		String str = "Nationalpark Eifel";
		String character[] = str.split("");

		for (String w : character) {
			System.out.println(w);
		}

	}

}
