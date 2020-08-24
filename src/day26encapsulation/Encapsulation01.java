package day26encapsulation;

public class Encapsulation01 {
	
	private String kimlikNo ="3423423424";
	private int krediKartNo = 12345678;
	private boolean soguk = true;

	public static void main(String[] args) {
		// Encaptulation data saklama (data-hiding) yöntemidir.
		// Encaptulation iki stepte yapýlýr:
		// 	1) Data'yi(variable, method) private yapýlmalý,
		//	2) public olan getter() ve setter() method'lar üretilmelidir.
		//	getter() data'yý okumamýza yarar; getter() methodu data'da deðiþiklik yapamaz
		// 	setter() data'yi deðiþtirmemize yarar.	
				
	}
	
	//getter() üretmek için;
	// 1) Access Modifier public olmalýdýr.
	// 2) Return type variable'in return type'i ile ayný olmalýdýr,
	// 3) Method ismi "get + variable ismi" seklinde olmalýdýr.
	public String getKimlikNo() {
		return kimlikNo;
	}
	
	public int getKrediKartNo() {
		return krediKartNo;
	}
	// return type boolean ise method ismi "is" ile baþlar. "get" kullanýlmaz.
	public boolean isSoguk() {
		return soguk;
	}
	// void; 1)Consola yazdýrmada ve 2) aksiyonlarda kullanýlýr.
	// void olduðunda return kullanmayýz
	
	//setter() üretmek için;
	// 1) Accsess Modifier public olmalý,
	// 2) Return type void olmalý,
	// 3) method ismi "set + variable ismi" seklinde olmalý,
	// 4) parametre kullanýlmalý %99
	// 5) setter() methodlarýn ismi boolean'lar için de "set" ile baþlar
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
