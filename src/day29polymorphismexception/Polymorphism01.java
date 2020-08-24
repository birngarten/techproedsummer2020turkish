package day29polymorphismexception;
//1.Class
public class Polymorphism01 {

	public static void main(String[] args) {
		// Polymorphism => Coklu yapý
		//Overloading ve Overriding ile bir method polymorphism haline getirilir.
		//Polymorphism'i Overloading ile yapýlýrsa "Compile Time Polymorphism" denir.
		//				Diðer adý "Static Polymorphism"dir.
		
		//Polymorphism'i Overriding ile yapýlýrsa "Run Time Polymorphism" denir.
		//				Diðer adý dinamic Polymorphism'dir.

	}
	
	public void eat() {
		System.out.println("Ye!");
		
	}
	//Overloading ile Polymorphism
	public void eat(String name) {
		System.out.println(name+"Ye!");
}
	}

// 2.class
class Yeni extends Polymorphism01{
	
	//Overriding ile Polymorphism
	public void eat() {
		System.out.println("Lütfen ye!");
		
	}
}

