package day18statickeyword;

public class Static01 {
	
	static int en= 12;
	static int boy = 10;
	static int yaricap= 4;
	static double pi;
	static int alan;
	//Bir variable deðerini oluþtururken hesap yapmamýz gerekirse;
	//"static block" oluþturmak iyidir. Yani "int alan = en*boy;" demek yerine
	//"static block" oluþturup bu iþlemleri static block'un içine yazmak daha iyidir.
	//"static block" variable'lara deðer atamak için de kullanýlabilir.
	
	//"static block" Class'ýn içinde main dahil bütün method'larýn ve consructor'larýn dýþýnda oluþturulmalýdýr.
	
	//"static block" Class oluþturulduðu zaman oluþturulur.
	
	//"static block" tüm method'lardan önce çalýþtýrýlýr.
	// birden fazla "static block" varsa sýrasýyla en üstten alta doðru çalýþýr.
	
	static{ //==> "static block"
		alan = en*boy;
		
		
	}

	public static void main(String[] args) {
		
		System.out.println(alan);
		
	}
	
	//"static class" olusturulabilir. Ama alt class'lar (inner class) static class olabilir.
		//Ust Class'lar (outer class) static olamazlar.
	
	public static class AltClass { //==> alt class
		
	}

}
