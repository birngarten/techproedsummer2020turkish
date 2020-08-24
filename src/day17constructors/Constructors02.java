package day17constructors;

public class Constructors02 {

	//buyume() methodu bu Class'ta deðil Constructors01 Class'ýnda.
	//Bu nedenle Java buyume() methodu'nun burada kullanmamýza izin vermiyor. Örnek: buyume(33);
	
	//ÖNEMLÝ : Baþka bir Class'taki method kullanýlmak istendiðinde;
	// O Class'tan bir object oluþturarak o methot kullanýlabilir
	public static void main(String[] args) {
		
		Constructors01 obj1 = new Constructors01();
		
		
		obj1.buyume(33);//buyume() methodu static oldugundan Java object kullanýlarak buyume() methodu 
						 //cagýrmamýzý istemez ve altýný sarý renkle çizer.
		Constructors01.buyume(45);// ==> Ama direkt Class ismiyle caðýrdýðýmýzda sarý renk yok olur.
		obj1.isimDegistir("Kemal Can");//isimDegistirme() methodu static oldugundan Java object kullanýlarak 
									//isimDegistirme() methodu cagýrmamýzý istemez ve altýný sarý renkle çizer.
		Constructors01.isimDegistir("Belkis");
		System.out.println(obj1.isim);//Ali Can ==> Constructors01'den geliyor
		System.out.println(obj1.yas); //60 ==> Constructors01'den
		
		Constructors01 obj2 = new Constructors01();
		obj2.buyume(23);
		
		System.out.println(Constructors03.ad);//Ali Can ==> Constructors03 ten geldi.
								 //Constructors03 Class'ýnýn ismini yazarak oradaki variable'lara ulaþabiliriz.
								 //Çünkü Constructors03 Class'ýnýn variab larý static olarak tanýmlanmýþ.
		Constructors03.artirma(49);
		Constructors03.degistirme("Bilal");
		Constructors01.buyume(37);
		
	}

}
