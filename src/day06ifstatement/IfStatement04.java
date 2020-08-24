package day06ifstatement;

public class IfStatement04 {

	public static void main(String[] args) {
		
		// Bir tane String variable olusturun ve bir gun ismini kucuk harflerle deger olarak atayin
        // Eger atadiginiz deger hafta ici gunlerinden biri ise
        // ekrana "hafta ici" yazdirin.
        // Eger atadiginiz deger hafta sonu gunlerinden biri ise
        // ekrana "hafta sonu" yazdirin.
        // Hafta Ici:pazartesi, sali, carsamba, persembe, cuma
        // Hafta Sonu: cumartesi, pazar
		
		String gun = "pazar";
		
		if (gun.equals("Pazartesi") || gun.equals("salý")|| gun.equals("carsamba")||gun.equals("persembe")||gun.equals("cuma")) {
			System.out.println("Haftaiçi");
		}
		
		
		if (gun.equals("pazar") ||gun.equals("cumartesi")) {
			System.out.println("Haftasonu");
		}
	}

}
