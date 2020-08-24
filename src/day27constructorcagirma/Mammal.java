package day27constructorcagirma;

public class Mammal extends Animal{

	public boolean dogum = true; 
	
	public static void main(String[] args) {
		Mammal mammal = new Mammal();//Animal parametresiz constructor ==> Animal Class'tan geldi.Parent
									 //Mammal parametresiz constructor
		Mammal mammal01 = new Mammal(15); 			
		
	}
	
	public void feed() {
		System.out.println("Cocuklarýný besler");
	}
	
	Mammal(){
		this(11); // Parent'taki parametresiz constructor'ý caðýr demektir.Çünkü burda da parametre yok
				// super() keyword'ünü kullanýlmasa da olur. ama bazýlarý kullanýr, Þaþýrmayýn!!!
				// super() kullanýlacaksa mutlaka ilk satýrda olmalýdýr.
				// super() ve this() ayný constructor'ýn içinde kullanýlamaz. ilk satýrda olma zorunluluðu!!!
				// this() ayný Class içindeki parametresiz constructor'ý çaðýrmak için kullanýlýr.
		System.out.println("Mammal parametresiz constructor");
	}	
	
	public Mammal(int age) {
		super();
		System.out.println("Mammal parametreli Constructor ");
	}

}
