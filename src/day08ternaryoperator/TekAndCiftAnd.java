package day08ternaryoperator;

public class TekAndCiftAnd {

	public static void main(String[] args) {
		
		//System.out.println(3<2 && 5>4);
		
		// && kullan�l�rsa Java ilk false bulduktan sonra diger kontrolleri yapmaz.
		// Buda Java'n�n yuku azalt�r ve sure kazand�r�r ve Java hata yapma riskini azalt�r.
		
		System.out.println(3<2 & 5>4); // Tek & kullan�l�rsa Java ilk false bulsa da kontrollere devam eder, ona g�re sonuc yazar
		
		
	}

}
