package day06ifstatement;

public class IfStatement01 {

	public static void main(String[] args) {
		
		//Bir int variable olusturun ve deger atayin.
		//Eger deger pozitif ise ekrana "pozitif" yazs�n.
		//Eger deger negatif ise ekrana "Negatif" yazs�n.
		// "0" s�f�r isaretsiz bir sayidir.
		int num= 0; 
		
		if (num > 0) {
			System.out.println("positive"); //num pozitif ise ekrana pozitif
			
		}
		
		if (num< 0) {
			System.out.println("Negatif");//num negatif ise ekrana negatif
		}
		
		if (num==0) {
			
		System.out.println("Notr");//num = = ise ekrana Notr
		}
	}

}
