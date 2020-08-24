package day32abstraction;

public class KralDairesi extends Otel{

	public static void main(String[] args) {
		KralDairesi musteri3 = new KralDairesi();
		musteri3.kahvalti(); //Kahvaltýnýz teras kat Kral Restaurant'dadýr
		musteri3.odaFiyati();//Oda ücreti günlük 280 Euro'dur
		System.out.println("Tv ücreti: "+musteri3.tv("international", 12)); //Tv ücreti: 60
		System.out.println("Wifi ücreti: "+musteri3.wifi(11)); //Wifi ücreti: 22

	}

	
	public void kahvalti() {
		System.out.println("Kahvaltýnýz teras kat Kral Restaurant'dadýr");
		
	}
	
	public int tv(String international, int saat) {
		if(international.equals("international")) {
			return saat*5;
		}else {
			return 0;
		}
	}


	@Override
	public void odaFiyati() {
		System.out.println("Oda ücreti günlük 280 Euro'dur");
	}

}
