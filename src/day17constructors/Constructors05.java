package day17constructors;

public class Constructors05 {

	public static void main(String[] args) {
		
		Constructors04 obj1 = new Constructors04();
		System.out.println(obj1.num1);
		System.out.println(obj1.num2); // num2 static oldu�undan Java object kullanarak ca��rmam�z� istemiyor.
		System.out.println(Constructors04.num2); //Class ismiyle ca��rd���m�zdan sar� �izgi yok
		
		
		Constructors04 obj2 =new Constructors04();
		
		System.out.println(obj2.num2 * obj2.num1);
		
	}

}
