package day18statickeyword;

public class Static01 {
	
	static int en= 12;
	static int boy = 10;
	static int yaricap= 4;
	static double pi;
	static int alan;
	//Bir variable de�erini olu�tururken hesap yapmam�z gerekirse;
	//"static block" olu�turmak iyidir. Yani "int alan = en*boy;" demek yerine
	//"static block" olu�turup bu i�lemleri static block'un i�ine yazmak daha iyidir.
	//"static block" variable'lara de�er atamak i�in de kullan�labilir.
	
	//"static block" Class'�n i�inde main dahil b�t�n method'lar�n ve consructor'lar�n d���nda olu�turulmal�d�r.
	
	//"static block" Class olu�turuldu�u zaman olu�turulur.
	
	//"static block" t�m method'lardan �nce �al��t�r�l�r.
	// birden fazla "static block" varsa s�ras�yla en �stten alta do�ru �al���r.
	
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
