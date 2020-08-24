package day08ternaryoperator;

public class TekAndCiftAnd {

	public static void main(String[] args) {
		
		//System.out.println(3<2 && 5>4);
		
		// && kullanýlýrsa Java ilk false bulduktan sonra diger kontrolleri yapmaz.
		// Buda Java'nýn yuku azaltýr ve sure kazandýrýr ve Java hata yapma riskini azaltýr.
		
		System.out.println(3<2 & 5>4); // Tek & kullanýlýrsa Java ilk false bulsa da kontrollere devam eder, ona göre sonuc yazar
		
		
	}

}
