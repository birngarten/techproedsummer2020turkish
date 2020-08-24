package day32abstraction;

public interface Interface01 {

	//interface i�ine concrete method yaz�lamaz. Aksi takdirde Compile Time Error verir.
	//interface'de method olu�turulurken kesinlikle body yaz�lmaz.
	//interface'deki methodlar kesinlikle abstract olmal�d�r.
	//interface'deki abstract methodlar olu�turulurken abstract keyword kullanma, kullanmama aras�nda fark yoktur.
	//		��nk� interface kendi i�ine yaz�lan methodlar� otomatik olarak abstract olarak kabul eder.
	
	//Class ==> Interface: implements
	//Class ==> Class : extends
	//Interface ==> Interface : extends
	
	public void add();
	public abstract void subtract();//<===>public void add(); ==>ikisi aras�nda fark yok
	
	//Interface de variable'lar mutlaka; public, static, final olmal� ve 
	// mutlaka initialize(de�er atanmas�) edilmelidir.
	//Variable olu�turulurken public, static, final keywordlar� kullan�lsada olur kullan�lmasa da.
	public static final int a= 12;
	public static int aa= 12;
	int b=11;
	public int c = 12;
	final int d = 13;
	static int e = 12;//Hepsi olur
}
