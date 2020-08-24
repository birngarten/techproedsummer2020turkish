package day15methodcreation;

public class MethodCreation01 {

	// 1) main Method
	public static void main(String[] args) {
		
		System.out.println(toplama(3,5.2)); // 3,5.2 ==> argument
		System.out.println(carpma(11,5));
		

	}
	//Bir methodu main methodun icinden cagirmak icin mutlaka static kelimesini kullanmalisiniz.
	//Method parantezinin içinde oluşturulan variable lara "parametre" denir. ==> int num1, double num2 vb.
	//Method u cagirirken method parantezinin icine yazilan degerlere "argument" denir.
//	Parametrenin data type ile argument in data type eslesmeli. yani ***** int num1 parametresi 3 argumenti ile
																		// ayni olmalı cünkü ikiside integer.
																    //*****double num2   "   5.2 argumenti ile 
																		// ayni olmalı cunku ikiside double
	// 2) toplama method
	public static double toplama(int num1, double num2) {  // int num1, int num2 ==> parametre
		return num1+num2;
	}

	
	// 3) carpma method 
	public static int carpma(int num1, int num2) {
		return num1*num2;
	}

}
