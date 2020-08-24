package day32abstraction;

public class AileOdasi extends Otel{

	public static void main(String[] args) {
		AileOdasi musteri2 = new AileOdasi();
		musteri2.kahvalti();	//Kahvaltýnýz kafeteryada olacaktýr
		musteri2.odaFiyati();	//Oda ücreti günlük 80 Euro'dur
		System.out.println("Wifi ücreti: "+musteri2.wifi(6));
		

	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvaltýnýz kafeteryada olacaktýr");
		
	}

	@Override
	public void odaFiyati() {
		System.out.println("Oda ücreti günlük 80 Euro'dur");
	}

}
