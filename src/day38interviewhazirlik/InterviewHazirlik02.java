package day38interviewhazirlik;

public class InterviewHazirlik02 {
	/*
	 * 	14)	Access Modifier nedir?
	 * 		Bir Class'a, variable'a veya method'a ulaþýmý düzenler.
	 * 		4 tane Access Modifier vardýr. Bunlar;
	 * 		1) Public: Herkes ulaþabilir.
	 * 		2) Protected: Ayný package içinde ve farklý package'lerdeki child class'lardan ulaþýlabilinir.
	 * 		3) Default (Package Private): Sadece ayný package'den ulaþýlabilinir
	 * 		4) Private: Sadece class içinden ulaþýlabilinir.
	 * 
	 * 	15)	Pass by Value Pass by Reference nedir?
	 * 		Bir method'a variable yollandýðýnda java o variable'ýn kopyasýný oluþturur ve
			method'a kopyasýný yollar. 
			Bu yüzden variable'ýn orijinal deðeri method çalýþtýktan sonra da ayný kalýr.
			Mesela bir firma Yaþlýya %10, gençlere %5, engellilere %15 indirim yapsýn.
			eger Pass By Value olmasa  firmanýn gömleði yaþlýya fiyatýn %90'ýna, gençlere % 85'e, engellilere %70 olurdu.
		 	ama aslýnda yaþlýlara %90, gençlere %95, engellilere %85 fiyatla satýyor. Java bunu Pass By Value saðlýyor.
		
			Pass by Reference'da ise referance'nin kopyasý oluþtutrulur ve methoda yollanýr.
			fakat reference'nin kopyasý da kendisi gibi ayný object'i gösterdiði için orjinal deðer deðiþir.
			
	 *  * 16) *** Abstract Class ile Interface farklari nedir?
	 *         Abstract class'lar multiple inheritance'a musaade etmez, Interface'ler eder.
	 *         Interface'de abstract methodlar olur, concrete methodlar static ve default
	 *         keywordleri ile olusturulur, halbuki abstract class'larda normal concrete
	 *         methodlar bulunabilir.
	 *         Interface'lerin variable'lari public, static, final olmak zorundadir ve initialize
	 *         edilmelidirler. Halbuki abstract class'larda bu zorunluluklarin hicbirisi yoktur
	 *         Bir interface'in parent'i class olamaz, child'i class da olur interface de olur,
	 *         ama abstractlarin child'i da parent'i hem abstract class hem concrete class olur. 
	 * 
	 * 
	 */
}
