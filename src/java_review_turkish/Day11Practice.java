package java_review_turkish;

public class Day11Practice {

	public static void main(String[] args) {

		
		// verilen iki say�n�n yerlerini de�i�tiriniz
        int num1 = 11; // ==>33
        int num2 = 33;// ==>11
        int gec = 0;
        
        gec  = num1;
        num1 = num2;
        num2 = gec;
        
        System.out.println(num1);
        System.out.println(num2);
		
		//*** interview question***
	       // Verilen iki de�eri ���nc� bir de�er kullanmadan yerlerini de�i�tiriniz
		
	      int  x  = 50; //=>10
	       int  y  = 10; //=>50
	       
	      x = x+y;
	      y = x-y;
	      x = x-y;
	      
	      System.out.println(x);
	      System.out.println(y); 
		
		
	}

}
