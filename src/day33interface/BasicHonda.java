package day33interface;

public class BasicHonda extends Araba implements IcAraba, DisAraba{

	//Class ==> Interface: implements
	//Class ==> Class : extends
	//Interface ==> Interface : extends
	
	public static void main(String[] args) {
		BasicHonda basicHonda = new BasicHonda();
		basicHonda.dizel();		 //Dizel 2.0 Turbo
		basicHonda.direksiyon();//Ýyi kalitede suni deri direksiyon
		basicHonda.kapi();		//Uzaktan kumandalý kapý
		basicHonda.koltuk();	//Kumaþ koltuklar
		basicHonda.move();		//10 saniyede 100 km'lik hýza ulaþýr
		

	}

	@Override
	public void kapi() {
		System.out.println("Uzaktan kumandalý kapý");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Ýyi kalitede suni deri direksiyon");
		
	}

	@Override
	public void koltuk() {
		System.out.println("Kumaþ koltuklar");
		
	}

	@Override
	public void klima() {
		System.out.println("Manuel Klima");
		
	}

	@Override
	public void move() {
		System.out.println("10 saniyede 100 km'lik hýza ulaþýr");
		
	}

}
