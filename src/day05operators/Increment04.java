package day05operators;

public class Increment04 {

	public static void main(String[] args) {
		
		// int data tipinde bir tane valiable olusturun. 
		// Bunu her seferinde 1 art�rmak icin 3 yontemide kullan�n.
		
		int sayi1 = 12;
		sayi1 = sayi1 + 1; //Uzun yol
		System.out.println(sayi1);
		
		sayi1 += 1; // K�sa yol
		System.out.println(sayi1);
		
		sayi1++; // En k�sa yol
		System.out.println(sayi1);

	}

}
