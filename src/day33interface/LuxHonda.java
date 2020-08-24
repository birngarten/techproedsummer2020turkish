package day33interface;

public class LuxHonda extends Araba implements IcAraba, DisAraba{

	public static void main(String[] args) {
		LuxHonda luxHonda = new LuxHonda();
		luxHonda.benzin();	//Benzin 3.5 Turbo
		luxHonda.direksiyon();//Gercek deri direksiyon
		luxHonda.kapi();	//Parmakizi ayarlý kapý
		luxHonda.klima();	//Digital klima
		luxHonda.koltuk();	//Isýtmalý deri koltuk
		luxHonda.move();	//3 saniyede 100 km'lik hýza ulaþýr
		luxHonda.doseme();//Interface'de default keyword ile döþeme yaptým
		IcAraba.isitma();
		System.out.println(IcAraba.price);//2000 ==>//	Farklý Interface’lerde Variable’lar için data type ve isimler ayný 
										  //ama deðerler farklý ise implements durumunda bu variable’lara Interface isimleri ile ulaþabiliriz.
										 // Burada IcAraba ve DisAraba isimleri ile caðýrmalýyýz.		
		System.out.println(DisAraba.price);//3000
		System.out.println(old);//true ==> iki tane old isimli variable olmadýðýndan interface adýný kullanmaya gerek yok.
		
	}

	@Override
	public void move() {
		System.out.println("3 saniyede 100 km'lik hýza ulaþýr");
		
	}

	@Override
	public void kapi() {
		System.out.println("Parmakizi ayarlý kapý");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Gercek deri direksiyon");
		
	}

	@Override
	public void koltuk() {
		System.out.println("Isýtmalý deri koltuk");
		
	}

	@Override
	public void klima() {
		System.out.println("Digital klima");
		
	}

}
