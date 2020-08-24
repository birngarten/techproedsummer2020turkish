package day33interface;

public interface IcAraba {

//	Farkl� Interface�lerde ayn� isimde farkl� Return type�lerdeki metodlar yaz�l�rsa Compile Time Error verir.
//	 Farkl� Interface�lerde ayn� isim ve ayn� Return type�lerdeki metodlar olursa implements durumunda
//	sorun olmaz
//	Farkl� Interface�lerde Variable�lar i�in data type ve isimler ayn� ama de�erler farkl� ise
//	implements durumunda bu variable�lara Interface isimleri ile ula�abiliriz.

	int price = 2000;
	boolean old = true;
	
	public abstract void direksiyon(); //�� method ayn�
	
	void koltuk();//public abstract konulabilir, kullan�lmayabilir
	
	abstract void klima();
	
	public default void doseme() { //default kelimesiyle interface method'ta body{} eklenebilir. Static ile de yap�labilir.
									//concrete methoda d�n��t�
		System.out.println("Interface'de default keyword ile d��eme yapt�m");
	}
		
	public static void isitma() {	

		System.out.println("Interface'de default keyword ile d��eme yapt�m");
	}
}
