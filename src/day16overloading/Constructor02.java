package day16overloading;

public class Constructor02 {

	public static void main(String[] args) {
		
		// 1) Baska bir Class ta �retti�imiz object'i yeni Class'ta kullanabiliriz.
		// �rnek: Constructor01 de �retti�imiz hondaAraba objeyi bu Class ta kulland�k.
		// 2) Object'in �zelliklerini de�i�tirebiliriz. Fakat de�i�im sadece o object ile s�n�rl� kal�r. 
		// Yeni �retilecek object ler bu de�i�imden etkilenmez
		// 3)Eger uretilecek her object'in degisime ugramis olmasini istiyorsaniz ilk class'daki instance 
		//   variable ozellikleri degistirmelisiniz.
		
		Constructor01 hondaAraba01 = new Constructor01();
		System.out.println("Zaml� fiyat : " + (hondaAraba01.price + 1000)); 
		
		System.out.println("Model Y�l�  : " + (hondaAraba01.year -1));
		
		System.out.println("Yeni Marka  : " + (hondaAraba01.make.replace("Honda", "Toyota")));
		System.out.println("Model Type  : " + (hondaAraba01.type.replace("Civic", "Corolla")));
		
		

	}

}
