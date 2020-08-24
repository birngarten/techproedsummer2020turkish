package day17constructors;

public class Constructors02 {

	//buyume() methodu bu Class'ta de�il Constructors01 Class'�nda.
	//Bu nedenle Java buyume() methodu'nun burada kullanmam�za izin vermiyor. �rnek: buyume(33);
	
	//�NEML� : Ba�ka bir Class'taki method kullan�lmak istendi�inde;
	// O Class'tan bir object olu�turarak o methot kullan�labilir
	public static void main(String[] args) {
		
		Constructors01 obj1 = new Constructors01();
		
		
		obj1.buyume(33);//buyume() methodu static oldugundan Java object kullan�larak buyume() methodu 
						 //cag�rmam�z� istemez ve alt�n� sar� renkle �izer.
		Constructors01.buyume(45);// ==> Ama direkt Class ismiyle ca��rd���m�zda sar� renk yok olur.
		obj1.isimDegistir("Kemal Can");//isimDegistirme() methodu static oldugundan Java object kullan�larak 
									//isimDegistirme() methodu cag�rmam�z� istemez ve alt�n� sar� renkle �izer.
		Constructors01.isimDegistir("Belkis");
		System.out.println(obj1.isim);//Ali Can ==> Constructors01'den geliyor
		System.out.println(obj1.yas); //60 ==> Constructors01'den
		
		Constructors01 obj2 = new Constructors01();
		obj2.buyume(23);
		
		System.out.println(Constructors03.ad);//Ali Can ==> Constructors03 ten geldi.
								 //Constructors03 Class'�n�n ismini yazarak oradaki variable'lara ula�abiliriz.
								 //��nk� Constructors03 Class'�n�n variab lar� static olarak tan�mlanm��.
		Constructors03.artirma(49);
		Constructors03.degistirme("Bilal");
		Constructors01.buyume(37);
		
	}

}
