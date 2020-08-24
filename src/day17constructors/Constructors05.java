package day17constructors;

public class Constructors05 {

	public static void main(String[] args) {
		
		Constructors04 obj1 = new Constructors04();
		System.out.println(obj1.num1);
		System.out.println(obj1.num2); // num2 static olduðundan Java object kullanarak caðýrmamýzý istemiyor.
		System.out.println(Constructors04.num2); //Class ismiyle caðýrdýðýmýzdan sarý çizgi yok
		
		
		Constructors04 obj2 =new Constructors04();
		
		System.out.println(obj2.num2 * obj2.num1);
		
	}

}
