package day32abstraction;

public class TekKisilikOda extends Otel {

	public static void main(String[] args) {
		TekKisilikOda musteri1 = new TekKisilikOda();
		musteri1.kahvalti(); //Kahvaltýnýz sandvictir
		musteri1.odaFiyati(); //Oda ücreti günlük 50 Euro'dur
		System.out.println("Tv ücreti: " + musteri1.tv(5)); //Tv ücreti: 10
		System.out.println("Wifi ücreti: " + musteri1.wifi(1)); //Wifi ücreti: 2

	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvaltýnýz sandvictir");
		
	}
	
	public int tv(int saat) {
		return saat*2;
		
	}

	@Override
	public void odaFiyati() {
		System.out.println("Oda ücreti günlük 50 Euro'dur");
	}

}
