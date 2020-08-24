package day32abstraction;

public abstract class Otel {

	//Herhangi bir parent tarafindan override edilen abstract method;
	//alttaki concrete child�lar tarafindan override edilmese de olur.
	//��nk� zaten onu parent'i concrete etmi�, tekrar concrete etmeye gerek yok.
	
	//abstract class'lar final olamazlar. ��nk� final class'lar�n cocu�u olmaz. Compile Time Error
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
