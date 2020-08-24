package day38interviewhazirlik;

public class InterviewHazirlik01 {
	/*
	 * 	 1) Java "Platform Independent" programlama dilidir. 
	 * 		Yani Windows'da yazýlan java kodu  Mac vb diðer platformlarda da çalýþýr. yada tersi
	 * 
	 * 	2) IDE ==> Integrated Development Environment demektir. Eclipse ve IntelliJ piyasada kullanýlan
	 * 		meþhur iki IDE'dir.
	 * 
	 * 	3) Constructor ==> Yeni bir object üretilirken Constructor aktive olur ve objecti üretir.
	 * 		Return Type'ý yoktur.
	 * 		Ismi class ismi ile ayný olmalýdýr.
	 * 		Object üretmek için Consructor üretmek zorunda deðiliz. Çünkü Java her class için default bir constructor üretmiþtir.
	 * 		Default constructor'lar parametresizdir.
	 * 		Biz herhangi bir consructor ürettiðimizde default consructor'lar yok olur.
	 * 		Consructor'lar overload edilebilirler.
	 * 		Consructor'lar child class'lardan caðrýlabilirler, ama override edilemezler.
	 * 
	 * 	4)	OOP (Object Oriented Programmig) concept nedir?
	 * 		OOP concept; a) Inheritance
	 * 					 b) Encapsulation
	 * 					 c) Polymorhism
	 * 					 d) Abstraction
	 * 					 e) Interface içerir.
	 * 
	 * 	5) Inheritance nedir?
	 * 		Inheritance parent(super class)- child(sub class) iliþkisidir.
	 * 		A Class'ý B Interface'ine implement ederse A child, B parent olur.
	 * 		A Class'ý B Class'ýna extends ederse A child, B parent olur.
	 * 		A interface'i B interface'ine extends ederse A child, B parent olur.
	 * 		Child parent'taki public ve protected olanlarýný kullanabilir,  private olanlarýný kullanamaz.
	 * 		Reusability(tekrar kullanabilme), short coding, maintanance(tamir) faydalarý vardýr.
	 * 		
	 * 	6) Encapsulation nedir?
	 * 		Data hiding demektir. Data'lar private yapýlarak gizlenir.
	 * 		Gizlenen datalar getter() ile okunur, setter() ile update edilir.
	 * 		Deðiþtirilmesini istemediðimiz kodlarý koruma altýna almak için kullanýlýr.
	 * 		Maintenance(tamir) faydasý da vardýr.
	 * 		Kodun hiç deðiþtirilmesi istenmiyorsa sadece okunmasý isteniyorsa o zaman sadece getter oluþturulur, setter() oluþturulmaz.
	 * 		Kodun ne deðiþtirilmesi ne de okunmasý isteniyorsa sadece okunmasý isteniyorsa o zaman getter() ve setter() oluþturulmaz
	 * 
	 * 	7)	Polymorhism nedir?
	 * 		Polymorphism (çoklu yapý) overloading ve overriding'dir.
	 * 
	 * 	8)	Abstract Class nedir?
	 * 		Abstract class üretmek için abstract keyword kullanýlmalýdýr.
	 * 		Abstract class'lardan object üretilemez, (instantiate-görünürlülük yapýlamaz)
	 * 		Abstract class'larda hem abstract hem de concrete methodlar bulunabilir.
	 * 		Abstract methodun bulunduðu class kesinlikle abstract olmalýdýr.
	 * 		Abstract method'larýn(body'siz) concrete child'ler tarafýndan override edilme zorunluluðu vardýr.
	 * 		Concrete'ler override edilmese de olur.
	 * 		Abstract class'ý child class'larý bazý görevleri yapmak zorunda býrakmak için oluþturulur.
	 * 
	 * 	9)	Interface nedir?
	 * 		Java normalde multiple inheritance'a izin vermez, bu nedenle Abstract class kullandýðýmýzda multiple inheritance yapamayýz. 
	 * 		Fakat bazý projelerde multiple inheritance kullanmak zorunluluðu doðabilir. Bunu Java Interface kullanarak çözmüþtür.
	 * 		Çünkü Interface'lere multiple implements yapýlabilir.  extends de yapýlabilir.
	 * 
	 * 	10)	Overloading nedir?
	 * 		Method ismi ayný tutularak parametrelerin sayýlarý, yerleri veya data type'leri deðiþtirilerek methodlar oluþturmadýr.
	 * 		Overloading Compile Time'dýr.
	 * 		Ayný isme sahip method'larla farklý iþlemler yapabilmek için overloading kullanýlýr.
	 * 		Mesela substring(+) ve substring(4,7) method'larýnýn fonksiyonlarý aslýnda aynýdýr.
	 * 		Ýkiside bir String'in belli bir bölümünü almaya yarar. fakat bazý durumlarda bitiþ indexini söylemek gerekir., 
	 * 		bazý durumlarda gerekmez. Bunun için parametreleri farklýlaþtýrýlýr. Bu da overloading'i doðurur.
	 * 
	 * 	11)	Overriding nedir?
	 * 		Method signature'a (method ismi ve parametreler) dokunulmaz, sadce body deðiþtirilir. Overriding inheritance olunca olur.
	 * 		Ayný method'un farklý kullanýmlarý için overriding gereklidir.
	 * 		Animal da ses(){Ses çýkarýr} ===> Dog(){Havlama} ==> Kedi(){Miyavlama} gibi...
	 * 		Overriding Run Time Error verir.
	 * 
	 * 	12)	Array ile ArrayList arasýndaki farklar nelerdir?
	 * 		Array oluþturulurken uzunluðu belli edilmek zorundadýr. ve daha sonra uzunluðu deðiþtirilemez.
	 * 		fakat ArayList'lerde baþlangýçta uzunluðu belirtme zorunluluðu yok, eleman ekledikçe uzunluðu artar,
	 * 		eleman silindikçe uzunluðu azalýr.
	 * 
	 * 	13)	String ile StringBuilder arasýndaki farklar nedir?
	 * 		String'ler immutable'dir, StringBuilder ise mutable'dir.(deðiþime açýktýr) 
	 * 		StringBuilder class'ý daha fazla kullanýþlý method'lara sahiptir.
	 * 		Mesela bir String'i tersten yazdýrmak için kullanýlan reverse() methodu gibi...
	 * 
	 */

}
