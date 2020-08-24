package day32abstraction;

public abstract class Otel {

	//Herhangi bir parent tarafindan override edilen abstract method;
	//alttaki concrete child’lar tarafindan override edilmese de olur.
	//Çünkü zaten onu parent'i concrete etmiþ, tekrar concrete etmeye gerek yok.
	
	//abstract class'lar final olamazlar. Çünkü final class'larýn cocuðu olmaz. Compile Time Error
	//abstract method final olamaz. overide olamaz o zaman.
	//abstract method private olamaz. overide olamaz o zaman.
	public static void main(String[] args) {
		

	}
	
	public abstract void kahvalti();
	
	public abstract void odaFiyati();
	
	
	public int wifi(int kisiSayisi) {
		return kisiSayisi*2;
		
	}

}
