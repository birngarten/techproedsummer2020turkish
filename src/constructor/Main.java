package constructor;

public class Main {
	
	String marka = "BMW";
	String renk = "Lacivert";	
	int yil = 2017;
	
//	Main(){
//		this.marka="mor";
//	}
//	Main(String renk){
//		
//	}
//	Main(String renk, int yil){
//		
//	}
	public static void main(String[] args) {
		
	Araba main = new Araba();
	System.out.println(main.marka);
	System.out.println(main.renk);
	System.out.println(main.yil);
	
	Main main1 = new Main();
	System.out.println(main1.marka);
	
	
	}
	

}