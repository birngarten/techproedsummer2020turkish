package day26encapsulation;

public class Encapsulation02 {

	private char ilkHarf = 'S';
	private double para = 23.75;
	private boolean emekli = false;
	
	// Variable atanan deðerin deðiþtirilmesini istenmiyorsa, 
	// o variable ile alakalý setter() oluþturulmamalýdýr.
	
	//Variable atanan deðerin okunmasý istenmiyorsa, 
	// o variable ile alakalý getter() oluþturulmamalýdýr.
	
	
	// Sadece getter() kullanýlýr ve hiç setter() kullanýlmazsa variab deðerleri deðiþtirilemez demektir.
	// Bu tarz Class'lara "immutable Class" denir.
	
	// Sadece setter() kullanýlýr ve hiç getter() kullanýlmazsa variab deðerleri okunamaz demektir.
	
	public static void main(String[] args) {
		Encapsulation01 obj = new  Encapsulation01();
		System.out.println(obj.getKimlikNo());//3423423424 Encapsulation01 Class'na 
											// ulaþmak için bulundðum bu Class'ta oluþturduðumuz obje ile 
											// getter() methodu ile getKimlikNo()'yu bu sayfada yazdýrabildim.
		obj.setKimlikNo("100000222222");
		System.out.println(obj.getKimlikNo());//100000222222 ==> setKimlikNo ile deðiþtirdim. 
											  //Ama deðiþiklik sadece bu Class'ta geçerli.
	}

	public char getIlkHarf() {
		return ilkHarf;
	}

	public void setIlkHarf(char ilkHarf) {
		this.ilkHarf = ilkHarf;
	}

	public double getPara() {
		return para;
	}

	public void setPara(double para) {
		this.para = para;
	}

	public boolean isEmekli() {
		return emekli;
	}

	public void setEmekli(boolean emekli) {
		this.emekli = emekli;
	}

}
