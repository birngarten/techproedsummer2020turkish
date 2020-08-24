package day32abstraction;

public interface Interface01 {

	//interface içine concrete method yazýlamaz. Aksi takdirde Compile Time Error verir.
	//interface'de method oluþturulurken kesinlikle body yazýlmaz.
	//interface'deki methodlar kesinlikle abstract olmalýdýr.
	//interface'deki abstract methodlar oluþturulurken abstract keyword kullanma, kullanmama arasýnda fark yoktur.
	//		Çünkü interface kendi içine yazýlan methodlarý otomatik olarak abstract olarak kabul eder.
	
	//Class ==> Interface: implements
	//Class ==> Class : extends
	//Interface ==> Interface : extends
	
	public void add();
	public abstract void subtract();//<===>public void add(); ==>ikisi arasýnda fark yok
	
	//Interface de variable'lar mutlaka; public, static, final olmalý ve 
	// mutlaka initialize(deðer atanmasý) edilmelidir.
	//Variable oluþturulurken public, static, final keywordlarý kullanýlsada olur kullanýlmasa da.
	public static final int a= 12;
	public static int aa= 12;
	int b=11;
	public int c = 12;
	final int d = 13;
	static int e = 12;//Hepsi olur
}
