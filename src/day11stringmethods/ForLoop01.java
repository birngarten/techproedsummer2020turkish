package day11stringmethods;

public class ForLoop01 {

	public static void main(String[] args) {
		
		//4, 3, ve 2 yi ekrana yazd�ran for loop olu�turun.
		
		for (int i=4; i>1; i--) {
			System.out.println(i);
		}
		
		// 3,4,5,6,7 say�lar�n� ekrana yazd�ran for loop olu�turunuz
		for (int i=3; i<8; i++) {
			System.out.println(i);
		}
		
		
		//�lk y�z sayma say�s�n� ekrana yan yana yazd�ran ve aralar�na bo�luk koyan program�
		//for loop kullanarak yaziniz
		
		for (int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		
		//�lk y�z sayma say�s�n� 100 den 1e dogru ekrana yan yana yazd�ran ve aralar�na bo�luk koyan program�
		//for loop kullanarak yaziniz
				
		for (int i=100; i>0; i--) {
			System.out.print(i+" ");
		
	}
		
		//ilk 50 cift sayma say�s�n� yazd�r�n.
		
		for (int i=2; i<101; i=i+2) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		//�lk 50 tekli say�y� yazd�r�n
		for (int i=1; i<100; i+=2) {
			System.out.print(i+" ");
		}
		
		
		
	}
}