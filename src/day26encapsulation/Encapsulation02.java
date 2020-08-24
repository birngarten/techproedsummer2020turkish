package day26encapsulation;

public class Encapsulation02 {

	private char ilkHarf = 'S';
	private double para = 23.75;
	private boolean emekli = false;
	
	// Variable atanan de�erin de�i�tirilmesini istenmiyorsa, 
	// o variable ile alakal� setter() olu�turulmamal�d�r.
	
	//Variable atanan de�erin okunmas� istenmiyorsa, 
	// o variable ile alakal� getter() olu�turulmamal�d�r.
	
	
	// Sadece getter() kullan�l�r ve hi� setter() kullan�lmazsa variab de�erleri de�i�tirilemez demektir.
	// Bu tarz Class'lara "immutable Class" denir.
	
	// Sadece setter() kullan�l�r ve hi� getter() kullan�lmazsa variab de�erleri okunamaz demektir.
	
	public static void main(String[] args) {
		Encapsulation01 obj = new  Encapsulation01();
		System.out.println(obj.getKimlikNo());//3423423424 Encapsulation01 Class'na 
											// ula�mak i�in bulund�um bu Class'ta olu�turdu�umuz obje ile 
											// getter() methodu ile getKimlikNo()'yu bu sayfada yazd�rabildim.
		obj.setKimlikNo("100000222222");
		System.out.println(obj.getKimlikNo());//100000222222 ==> setKimlikNo ile de�i�tirdim. 
											  //Ama de�i�iklik sadece bu Class'ta ge�erli.
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
