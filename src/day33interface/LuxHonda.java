package day33interface;

public class LuxHonda extends Araba implements IcAraba, DisAraba{

	public static void main(String[] args) {
		LuxHonda luxHonda = new LuxHonda();
		luxHonda.benzin();	//Benzin 3.5 Turbo
		luxHonda.direksiyon();//Gercek deri direksiyon
		luxHonda.kapi();	//Parmakizi ayarl� kap�
		luxHonda.klima();	//Digital klima
		luxHonda.koltuk();	//Is�tmal� deri koltuk
		luxHonda.move();	//3 saniyede 100 km'lik h�za ula��r
		luxHonda.doseme();//Interface'de default keyword ile d��eme yapt�m
		IcAraba.isitma();
		System.out.println(IcAraba.price);//2000 ==>//	Farkl� Interface�lerde Variable�lar i�in data type ve isimler ayn� 
										  //ama de�erler farkl� ise implements durumunda bu variable�lara Interface isimleri ile ula�abiliriz.
										 // Burada IcAraba ve DisAraba isimleri ile ca��rmal�y�z.		
		System.out.println(DisAraba.price);//3000
		System.out.println(old);//true ==> iki tane old isimli variable olmad���ndan interface ad�n� kullanmaya gerek yok.
		
	}

	@Override
	public void move() {
		System.out.println("3 saniyede 100 km'lik h�za ula��r");
		
	}

	@Override
	public void kapi() {
		System.out.println("Parmakizi ayarl� kap�");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Gercek deri direksiyon");
		
	}

	@Override
	public void koltuk() {
		System.out.println("Is�tmal� deri koltuk");
		
	}

	@Override
	public void klima() {
		System.out.println("Digital klima");
		
	}

}
