package day32abstraction;

public class AileOdasi extends Otel{

	public static void main(String[] args) {
		AileOdasi musteri2 = new AileOdasi();
		musteri2.kahvalti();	//Kahvalt�n�z kafeteryada olacakt�r
		musteri2.odaFiyati();	//Oda �creti g�nl�k 80 Euro'dur
		System.out.println("Wifi �creti: "+musteri2.wifi(6));
		

	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvalt�n�z kafeteryada olacakt�r");
		
	}

	@Override
	public void odaFiyati() {
		System.out.println("Oda �creti g�nl�k 80 Euro'dur");
	}

}
