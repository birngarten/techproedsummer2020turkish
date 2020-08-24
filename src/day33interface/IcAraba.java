package day33interface;

public interface IcAraba {

//	Farklý Interface’lerde ayný isimde farklý Return type’lerdeki metodlar yazýlýrsa Compile Time Error verir.
//	 Farklý Interface’lerde ayný isim ve ayný Return type’lerdeki metodlar olursa implements durumunda
//	sorun olmaz
//	Farklý Interface’lerde Variable’lar için data type ve isimler ayný ama deðerler farklý ise
//	implements durumunda bu variable’lara Interface isimleri ile ulaþabiliriz.

	int price = 2000;
	boolean old = true;
	
	public abstract void direksiyon(); //üç method ayný
	
	void koltuk();//public abstract konulabilir, kullanýlmayabilir
	
	abstract void klima();
	
	public default void doseme() { //default kelimesiyle interface method'ta body{} eklenebilir. Static ile de yapýlabilir.
									//concrete methoda dönüþtü
		System.out.println("Interface'de default keyword ile döþeme yaptým");
	}
		
	public static void isitma() {	

		System.out.println("Interface'de default keyword ile döþeme yaptým");
	}
}
