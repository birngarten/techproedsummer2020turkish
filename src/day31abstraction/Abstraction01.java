package day31abstraction;

public abstract class Abstraction01 {

	public static void main(String[] args) {
		// 1) Abstract class'lardan object �eretilemez.
		// 2) Constructor'lar� yoktur.
		// 3) Abstract clas'lar concrete(body'li) ve abstract(body'siz) methodlar i�erebilir.
		// 4) Abstract class'lar�n hem concrete hem de abstract child'leri olabilir.
		// 5) abstract class'lar final ve private olamaz. Compile Time Error
		
		// ==> Abstract class'�n child'i concrete class ise Abstract class'taki abstract method'lar� mutlaka override edilmeli ve
		// onlara body eklenmelidir.
		//		==> Bunun faydas� �udur; Child class'larda mecburen olmas� gereken methodlar� bu �ekilde belirlemi� oluruz.
		//Abstract class'�n child'i Abstract class ise Abstract class'taki herhangi bir seyi override etmek zorunda de�ildir.
		
		//Herhangi bir parent tarafindan override edilen abstract method;
		//alttaki concrete child�lar tarafindan override edilmese de olur.
		//��nk� zaten onu parent'i concrete etmi�, tekrar concrete etmeye gerek yok.
	
		//abstract method final ve private olamaz. overide olamaz o zaman.
	}
	
	public void concreteMethod() {
		System.out.println("Ben cocrete'im");
	}
	
	public  abstract void abstractMethod();	

}
