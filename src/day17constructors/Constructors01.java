package day17constructors;

public class Constructors01 {

	String isim = "Ali Can";
	int yas = 60;
	
	//Method ile main method ayn� Class'ta ise 
	//methodu sadece ismini yazarak kullan�labilir. �rnek : buyume();
	
	public static void main(String[] args) {
		
		buyume(40);//43 ==> return type'i void oldugundan sout'a gerek yok.
		isimDegistir("Ayse Han");
	}
	public static void buyume(int yas) {
		yas+=3; //buyume(40) methodunu 3 artirir ve yas 33 olur
		System.out.println(yas);
	}
	public static void isimDegistir(String isim) {
		System.out.println(isim);
		
	}

}
