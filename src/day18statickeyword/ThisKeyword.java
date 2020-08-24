package day18statickeyword;

public class ThisKeyword {

	int x = 12;
	static int y = 13;
	
	ThisKeyword(int x){
		//this, i�inde bulunulan Class'taki instance veya static variable'lara ula�mak i�in kullan�l�r.
		
		//this() i�inde bulunulan class'taki parametresiz constructor � ca��rmak i�in kullan�l�r.
		//this("Ali") i�inde bulundu�unuz class'taki String parametreli constructori ca��rmak i�in kullan�l�r.
		
		//this() kullan�lacaksa mutlaka ilk sat�ra yaz�lmal�d�r.
		//Aksi takdirde Compile Time Error verir.

		this("Ali");//==> parantezli this() mutlaka ilk sat�ra yaz�lmal�d�r. Yoksa Compile Time Error verir.
		this.x = 25;
		System.out.println("Parametreli consructor");
		
	}
	ThisKeyword(){
		System.out.println("Parametresiz consructor");
		
	}
	
	ThisKeyword(String str){
		System.out.println("String Parametreli consructor");
	}
		
	
	public static void main(String[] args) {
		ThisKeyword obj1 = new ThisKeyword(15);
		System.out.println(obj1.x); //15
		
	

	}

}
