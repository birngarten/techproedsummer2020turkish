package java_review_turkish;

public class Day11Practice01 {

	public static void main(String[] args) {
		
		//SORU: 0 ile 1000 aras�nda random bir say� olu�turarak 
				//bu say�n�n rakamlar� toplam�n� veren java algoritma kodunu yaz�n�z ?	
				//�rn. random sayi= 185  toplamlar� = 14
				
				int randomSayi = (int)(Math.random()*1000); // 0 ile 1000 aras�ndaki say�lar bu sekilde al�n�r. 1000 haric
				System.out.println(randomSayi);
															//int ramdomSayi= (int)(Math.random()*10)+10; // 10 ile 20 aras� de�erler	
				int birler=randomSayi%10;
				int onlar=randomSayi/10%10;
				int yuzler=randomSayi/100;
				System.out.println(birler+onlar+yuzler);
				
				//1. yol
				//int rNum = (int)(Math.random()*1000); 
			    // 0 ile 1000 aras�ndaki say�lar bu sekilde al�n�r. 1000 haric										
												
				//2.yol
				//Random random = new Random(); //Burada Random u import ediyoruz.
				//int randSayi = random.nextInt(1000);		
													

	}

}
