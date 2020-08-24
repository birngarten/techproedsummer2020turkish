package day17constructors;

public class Constructors04 {
	
	int num1 = 12;
	static int num2 = 22;

	public static void main(String[] args) {
		//static methodun içinde sadece static elemanlar kullanılabilir.
		// num1 static olmadığından main method un içinde kullanılamaz.
		// num2 static olduğundan  main method un kullanılabilir
//		num1++; ==> comment kaldırılırsa kırmızı çizer
		num2++;
		
	}

}
