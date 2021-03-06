package day16overloading;

public class Constructor01 {

	int price = 20000;
	int year = 2020;
	String make = "Honda";
	String type = "Civic";

	public static void main(String[] args) {
		//Class oluşturduğumuzda Java Class la beraber bir constructor olusturur,  onu 
		// herhangi bir code yazmadan direkt kullanılabilir. Bu constructor'a "default constructor" denir.
		// Default Constructor'larda parametre olmaz.
		// Default Constructor' Class olusturuldugunda Java tarafından oluşturulur.
		// bir constructor ürettiğimizde, Java  'Default Constructor'ı imha eder.
		Constructor01 hondaAraba = new Constructor01(); // Bir tane object uretildi.
//		 Data Type     isim	   yeni Obje  Constructor
		
		System.out.println(hondaAraba.price); //20000		
		System.out.println(hondaAraba.year); //2020
		System.out.println(hondaAraba.make); //Honda	
		System.out.println(hondaAraba.type); //Civic
	}

}
