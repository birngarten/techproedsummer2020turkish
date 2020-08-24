package day31abstraction;

public abstract class Abstraction01 {

	public static void main(String[] args) {
		// 1) Abstract class'lardan object üeretilemez.
		// 2) Constructor'larý yoktur.
		// 3) Abstract clas'lar concrete(body'li) ve abstract(body'siz) methodlar içerebilir.
		// 4) Abstract class'larýn hem concrete hem de abstract child'leri olabilir.
		// 5) abstract class'lar final ve private olamaz. Compile Time Error
		
		// ==> Abstract class'ýn child'i concrete class ise Abstract class'taki abstract method'larý mutlaka override edilmeli ve
		// onlara body eklenmelidir.
		//		==> Bunun faydasý þudur; Child class'larda mecburen olmasý gereken methodlarý bu þekilde belirlemiþ oluruz.
		//Abstract class'ýn child'i Abstract class ise Abstract class'taki herhangi bir seyi override etmek zorunda deðildir.
		
		//Herhangi bir parent tarafindan override edilen abstract method;
		//alttaki concrete child’lar tarafindan override edilmese de olur.
		//Çünkü zaten onu parent'i concrete etmiþ, tekrar concrete etmeye gerek yok.
	
		//abstract method final ve private olamaz. overide olamaz o zaman.
	}
	
	public void concreteMethod() {
		System.out.println("Ben cocrete'im");
	}
	
	public  abstract void abstractMethod();	

}
