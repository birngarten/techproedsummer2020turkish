package day18statickeyword;

public class ThisKeyword {

	int x = 12;
	static int y = 13;
	
	ThisKeyword(int x){
		//this, içinde bulunulan Class'taki instance veya static variable'lara ulaþmak için kullanýlýr.
		
		//this() içinde bulunulan class'taki parametresiz constructor ý caðýrmak için kullanýlýr.
		//this("Ali") içinde bulunduðunuz class'taki String parametreli constructori caðýrmak için kullanýlýr.
		
		//this() kullanýlacaksa mutlaka ilk satýra yazýlmalýdýr.
		//Aksi takdirde Compile Time Error verir.

		this("Ali");//==> parantezli this() mutlaka ilk satýra yazýlmalýdýr. Yoksa Compile Time Error verir.
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
