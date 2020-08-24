package day22arraylist;

public class OdevForEachLoop04 {

	public static void main(String[] args) {
		//Soru 4)  Bir String oluþturunuz, bu String’deki character’leri yukarýdan aþaðýya
		// for-each loop kullanarak yazdýrýnýz. Ýpucu: split()

		String str = "Nationalpark Eifel";
		String character[] = str.split("");

		for (String w : character) {
			System.out.println(w);
		}

	}

}
