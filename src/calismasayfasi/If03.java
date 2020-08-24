package calismasayfasi;

public class If03 {

	public static void main(String[] args) {
		
		// Bir char variable olusturun ve bir buyuk harf deger atayin
        // Eger atanan deger, haftanin gunlerinden herhangi birinin ilk harfi ise o gunleri yazdirin
        // Eger atanan deger, haftanin gunlerinden herhangi birinin ilk harfi degil ise 
        // ekrana "Boyle bir gun yok" yazdirin.
        // Pazar, Pazartesi, Persembe <-> Sali <-> Carsamba, Cuma, Cumartesi
		
		char gun = 'S';
		
		if (gun == 'P') {
			System.out.println("Pazartesi, Persembe, Pazar");
			
		}
		if (gun == 'S') {
			
			System.out.println("Salı");
		}
		
		if (gun == 'C') {
			System.out.println("Carsamba, Cuma, Cumartesi");
			
		}if (gun!='P' && gun!='S' && gun!='C') {
			System.out.println("Böyle Bir Gün Yok");
		}
		
	
	}

}
