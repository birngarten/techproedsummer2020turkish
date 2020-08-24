package day29polymorphismexception;
//1.Class
public class Polymorphism01 {

	public static void main(String[] args) {
		// Polymorphism => Coklu yap�
		//Overloading ve Overriding ile bir method polymorphism haline getirilir.
		//Polymorphism'i Overloading ile yap�l�rsa "Compile Time Polymorphism" denir.
		//				Di�er ad� "Static Polymorphism"dir.
		
		//Polymorphism'i Overriding ile yap�l�rsa "Run Time Polymorphism" denir.
		//				Di�er ad� dinamic Polymorphism'dir.

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
		System.out.println("L�tfen ye!");
		
	}
}

