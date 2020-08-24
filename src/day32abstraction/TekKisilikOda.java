package day32abstraction;

public class TekKisilikOda extends Otel {

	public static void main(String[] args) {
		TekKisilikOda musteri1 = new TekKisilikOda();
		musteri1.kahvalti(); //Kahvalt�n�z sandvictir
		musteri1.odaFiyati(); //Oda �creti g�nl�k 50 Euro'dur
		System.out.println("Tv �creti: " + musteri1.tv(5)); //Tv �creti: 10
		System.out.println("Wifi �creti: " + musteri1.wifi(1)); //Wifi �creti: 2

	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvalt�n�z sandvictir");
		
	}
	
	public int tv(int saat) {
		return saat*2;
		
	}

	@Override
	public void odaFiyati() {
		System.out.println("Oda �creti g�nl�k 50 Euro'dur");
	}

}
