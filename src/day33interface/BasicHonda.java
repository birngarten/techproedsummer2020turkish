package day33interface;

public class BasicHonda extends Araba implements IcAraba, DisAraba{

	//Class ==> Interface: implements
	//Class ==> Class : extends
	//Interface ==> Interface : extends
	
	public static void main(String[] args) {
		BasicHonda basicHonda = new BasicHonda();
		basicHonda.dizel();		 //Dizel 2.0 Turbo
		basicHonda.direksiyon();//�yi kalitede suni deri direksiyon
		basicHonda.kapi();		//Uzaktan kumandal� kap�
		basicHonda.koltuk();	//Kuma� koltuklar
		basicHonda.move();		//10 saniyede 100 km'lik h�za ula��r
		

	}

	@Override
	public void kapi() {
		System.out.println("Uzaktan kumandal� kap�");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("�yi kalitede suni deri direksiyon");
		
	}

	@Override
	public void koltuk() {
		System.out.println("Kuma� koltuklar");
		
	}

	@Override
	public void klima() {
		System.out.println("Manuel Klima");
		
	}

	@Override
	public void move() {
		System.out.println("10 saniyede 100 km'lik h�za ula��r");
		
	}

}
