package day16overloading;

public class Constructor03 {
	
	String isim = "Ali Can";
	int yas = 33;
	int kilo = 85;
	String meslek = "Automation Tester";
	boolean emekli = false;
	
	Constructor03(){  //Constructor olu�turma main method'un d���nda
		
	}
	
	Constructor03(String isim, int yas, boolean emekli){  //Constructor olu�turma main method'un d���nda
		this.isim = isim;
		this.yas = yas;
		this.emekli = emekli;		
	}
	Constructor03(String isim){  
		this.isim = isim;		
	}
	public static void main(String[] args) {
		
		Constructor03 insan01 = new Constructor03(); //Object olu�turma main method'un i�inde
		System.out.println(insan01.isim+"\n");

		Constructor03 insan02 = new Constructor03("Ayhan yildiz", 56, true); 
		System.out.println(insan02.isim);
		System.out.println(insan02.yas);
		System.out.println(insan02.meslek);
		System.out.println(insan02.emekli+"\n");
		
		Constructor03 insan03 = new Constructor03("Ayse yildiz"); 
		System.out.println(insan03.isim);
		System.out.println(insan03.kilo);
	}

}
