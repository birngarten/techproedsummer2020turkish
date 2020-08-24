package day26encapsulation;

public class Encapsulation01 {
	
	private String kimlikNo ="3423423424";
	private int krediKartNo = 12345678;
	private boolean soguk = true;

	public static void main(String[] args) {
		// Encaptulation data saklama (data-hiding) y�ntemidir.
		// Encaptulation iki stepte yap�l�r:
		// 	1) Data'yi(variable, method) private yap�lmal�,
		//	2) public olan getter() ve setter() method'lar �retilmelidir.
		//	getter() data'y� okumam�za yarar; getter() methodu data'da de�i�iklik yapamaz
		// 	setter() data'yi de�i�tirmemize yarar.	
				
	}
	
	//getter() �retmek i�in;
	// 1) Access Modifier public olmal�d�r.
	// 2) Return type variable'in return type'i ile ayn� olmal�d�r,
	// 3) Method ismi "get + variable ismi" seklinde olmal�d�r.
	public String getKimlikNo() {
		return kimlikNo;
	}
	
	public int getKrediKartNo() {
		return krediKartNo;
	}
	// return type boolean ise method ismi "is" ile ba�lar. "get" kullan�lmaz.
	public boolean isSoguk() {
		return soguk;
	}
	// void; 1)Consola yazd�rmada ve 2) aksiyonlarda kullan�l�r.
	// void oldu�unda return kullanmay�z
	
	//setter() �retmek i�in;
	// 1) Accsess Modifier public olmal�,
	// 2) Return type void olmal�,
	// 3) method ismi "set + variable ismi" seklinde olmal�,
	// 4) parametre kullan�lmal� %99
	// 5) setter() methodlar�n ismi boolean'lar i�in de "set" ile ba�lar
	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
	}
	
	public void setKrediKartNo(int krediKartNo) {
		this.krediKartNo = krediKartNo;
	}
	
	public void setSoguk(boolean soguk) {
		this.soguk = soguk;
	}
	

}
