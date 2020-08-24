package day27constructorcagirma;

public class Mammal extends Animal{

	public boolean dogum = true; 
	
	public static void main(String[] args) {
		Mammal mammal = new Mammal();//Animal parametresiz constructor ==> Animal Class'tan geldi.Parent
									 //Mammal parametresiz constructor
		Mammal mammal01 = new Mammal(15); 			
		
	}
	
	public void feed() {
		System.out.println("Cocuklar�n� besler");
	}
	
	Mammal(){
		this(11); // Parent'taki parametresiz constructor'� ca��r demektir.��nk� burda da parametre yok
				// super() keyword'�n� kullan�lmasa da olur. ama baz�lar� kullan�r, �a��rmay�n!!!
				// super() kullan�lacaksa mutlaka ilk sat�rda olmal�d�r.
				// super() ve this() ayn� constructor'�n i�inde kullan�lamaz. ilk sat�rda olma zorunlulu�u!!!
				// this() ayn� Class i�indeki parametresiz constructor'� �a��rmak i�in kullan�l�r.
		System.out.println("Mammal parametresiz constructor");
	}	
	
	public Mammal(int age) {
		super();
		System.out.println("Mammal parametreli Constructor ");
	}

}
