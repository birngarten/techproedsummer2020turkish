package day38interviewhazirlik;

public class PassByValuePassByReference {

	public static void main(String[] args) {
		//Bir method'a variable yolland���nda java o variable'�n kopyas�n� olu�turur ve
		// method'a kopyas�n� yollar. 
		//Bu y�zden variable'�n orijinal de�eri method �al��t�ktan sonra da ayn� kal�r.
		//Mesela bir firma Ya�l�ya %10, gen�lere %5, engellilere %15 indirim yaps�n.
		//eger Pass By Value olmasa  firman�n g�mle�i ya�l�ya fiyat�n %90'�na, gen�lere % 85'e, engellilere %70 olurdu.
		// ama asl�nda ya�l�lara %90, gen�lere %95, engellilere %85 fiyatla sat�yor. Java bunu Pass By Value sa�l�yor.
		
		//Pass by Reference'da ise referance'nin kopyas� olu�tutrulur ve methoda yollan�r.
		//fakat reference'nin kopyas� da kendisi gibi ayn� object'i g�sterdi�i i�in orjinal de�er de�i�ir.
		
		int x = 12;
		System.out.println(increment(x));//13
		System.out.println(x);//12
	}

	public static int increment(int a) {
		a = a + 1;
		return a;
	}

}
