package day16overloading;

public class Constructor02 {

	public static void main(String[] args) {
		
		// 1) Baska bir Class ta ürettiðimiz object'i yeni Class'ta kullanabiliriz.
		// Örnek: Constructor01 de ürettiðimiz hondaAraba objeyi bu Class ta kullandýk.
		// 2) Object'in özelliklerini deðiþtirebiliriz. Fakat deðiþim sadece o object ile sýnýrlý kalýr. 
		// Yeni üretilecek object ler bu deðiþimden etkilenmez
		// 3)Eger uretilecek her object'in degisime ugramis olmasini istiyorsaniz ilk class'daki instance 
		//   variable ozellikleri degistirmelisiniz.
		
		Constructor01 hondaAraba01 = new Constructor01();
		System.out.println("Zamlý fiyat : " + (hondaAraba01.price + 1000)); 
		
		System.out.println("Model Yýlý  : " + (hondaAraba01.year -1));
		
		System.out.println("Yeni Marka  : " + (hondaAraba01.make.replace("Honda", "Toyota")));
		System.out.println("Model Type  : " + (hondaAraba01.type.replace("Civic", "Corolla")));
		
		

	}

}
