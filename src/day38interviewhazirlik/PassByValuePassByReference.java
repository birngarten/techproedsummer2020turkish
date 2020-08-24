package day38interviewhazirlik;

public class PassByValuePassByReference {

	public static void main(String[] args) {
		//Bir method'a variable yollandýðýnda java o variable'ýn kopyasýný oluþturur ve
		// method'a kopyasýný yollar. 
		//Bu yüzden variable'ýn orijinal deðeri method çalýþtýktan sonra da ayný kalýr.
		//Mesela bir firma Yaþlýya %10, gençlere %5, engellilere %15 indirim yapsýn.
		//eger Pass By Value olmasa  firmanýn gömleði yaþlýya fiyatýn %90'ýna, gençlere % 85'e, engellilere %70 olurdu.
		// ama aslýnda yaþlýlara %90, gençlere %95, engellilere %85 fiyatla satýyor. Java bunu Pass By Value saðlýyor.
		
		//Pass by Reference'da ise referance'nin kopyasý oluþtutrulur ve methoda yollanýr.
		//fakat reference'nin kopyasý da kendisi gibi ayný object'i gösterdiði için orjinal deðer deðiþir.
		
		int x = 12;
		System.out.println(increment(x));//13
		System.out.println(x);//12
	}

	public static int increment(int a) {
		a = a + 1;
		return a;
	}

}
