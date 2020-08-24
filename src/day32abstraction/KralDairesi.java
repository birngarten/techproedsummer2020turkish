package day32abstraction;

public class KralDairesi extends Otel{

	public static void main(String[] args) {
		KralDairesi musteri3 = new KralDairesi();
		musteri3.kahvalti(); //Kahvalt�n�z teras kat Kral Restaurant'dad�r
		musteri3.odaFiyati();//Oda �creti g�nl�k 280 Euro'dur
		System.out.println("Tv �creti: "+musteri3.tv("international", 12)); //Tv �creti: 60
		System.out.println("Wifi �creti: "+musteri3.wifi(11)); //Wifi �creti: 22

	}

	
	public void kahvalti() {
		System.out.println("Kahvalt�n�z teras kat Kral Restaurant'dad�r");
		
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
		System.out.println("Oda �creti g�nl�k 280 Euro'dur");
	}

}
