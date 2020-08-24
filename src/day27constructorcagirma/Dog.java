package day27constructorcagirma;

public class Dog extends Mammal{

	public boolean sadik = true;
	
	public static void main(String[] args) {

		Dog dog = new Dog();
//		Animal parametresiz constructor ==> dog objesi hem Animal, hem Mammal hem de Dog Class'larýndaki
											//Contructor'larý direkt run ediyor.
//		Mammal parametresiz constructor
//		Dog parametresiz constructor

	}

	public void bark() {
		System.out.println("Köpekler havlar");
	}
	
	Dog(){
		System.out.println("Dog parametresiz constructor");
	}
	
}
