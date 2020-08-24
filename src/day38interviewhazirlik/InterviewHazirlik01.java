package day38interviewhazirlik;

public class InterviewHazirlik01 {
	/*
	 * 	 1) Java "Platform Independent" programlama dilidir. 
	 * 		Yani Windows'da yaz�lan java kodu  Mac vb di�er platformlarda da �al���r. yada tersi
	 * 
	 * 	2) IDE ==> Integrated Development Environment demektir. Eclipse ve IntelliJ piyasada kullan�lan
	 * 		me�hur iki IDE'dir.
	 * 
	 * 	3) Constructor ==> Yeni bir object �retilirken Constructor aktive olur ve objecti �retir.
	 * 		Return Type'� yoktur.
	 * 		Ismi class ismi ile ayn� olmal�d�r.
	 * 		Object �retmek i�in Consructor �retmek zorunda de�iliz. ��nk� Java her class i�in default bir constructor �retmi�tir.
	 * 		Default constructor'lar parametresizdir.
	 * 		Biz herhangi bir consructor �retti�imizde default consructor'lar yok olur.
	 * 		Consructor'lar overload edilebilirler.
	 * 		Consructor'lar child class'lardan ca�r�labilirler, ama override edilemezler.
	 * 
	 * 	4)	OOP (Object Oriented Programmig) concept nedir?
	 * 		OOP concept; a) Inheritance
	 * 					 b) Encapsulation
	 * 					 c) Polymorhism
	 * 					 d) Abstraction
	 * 					 e) Interface i�erir.
	 * 
	 * 	5) Inheritance nedir?
	 * 		Inheritance parent(super class)- child(sub class) ili�kisidir.
	 * 		A Class'� B Interface'ine implement ederse A child, B parent olur.
	 * 		A Class'� B Class'�na extends ederse A child, B parent olur.
	 * 		A interface'i B interface'ine extends ederse A child, B parent olur.
	 * 		Child parent'taki public ve protected olanlar�n� kullanabilir,  private olanlar�n� kullanamaz.
	 * 		Reusability(tekrar kullanabilme), short coding, maintanance(tamir) faydalar� vard�r.
	 * 		
	 * 	6) Encapsulation nedir?
	 * 		Data hiding demektir. Data'lar private yap�larak gizlenir.
	 * 		Gizlenen datalar getter() ile okunur, setter() ile update edilir.
	 * 		De�i�tirilmesini istemedi�imiz kodlar� koruma alt�na almak i�in kullan�l�r.
	 * 		Maintenance(tamir) faydas� da vard�r.
	 * 		Kodun hi� de�i�tirilmesi istenmiyorsa sadece okunmas� isteniyorsa o zaman sadece getter olu�turulur, setter() olu�turulmaz.
	 * 		Kodun ne de�i�tirilmesi ne de okunmas� isteniyorsa sadece okunmas� isteniyorsa o zaman getter() ve setter() olu�turulmaz
	 * 
	 * 	7)	Polymorhism nedir?
	 * 		Polymorphism (�oklu yap�) overloading ve overriding'dir.
	 * 
	 * 	8)	Abstract Class nedir?
	 * 		Abstract class �retmek i�in abstract keyword kullan�lmal�d�r.
	 * 		Abstract class'lardan object �retilemez, (instantiate-g�r�n�rl�l�k yap�lamaz)
	 * 		Abstract class'larda hem abstract hem de concrete methodlar bulunabilir.
	 * 		Abstract methodun bulundu�u class kesinlikle abstract olmal�d�r.
	 * 		Abstract method'lar�n(body'siz) concrete child'ler taraf�ndan override edilme zorunlulu�u vard�r.
	 * 		Concrete'ler override edilmese de olur.
	 * 		Abstract class'� child class'lar� baz� g�revleri yapmak zorunda b�rakmak i�in olu�turulur.
	 * 
	 * 	9)	Interface nedir?
	 * 		Java normalde multiple inheritance'a izin vermez, bu nedenle Abstract class kulland���m�zda multiple inheritance yapamay�z. 
	 * 		Fakat baz� projelerde multiple inheritance kullanmak zorunlulu�u do�abilir. Bunu Java Interface kullanarak ��zm��t�r.
	 * 		��nk� Interface'lere multiple implements yap�labilir.  extends de yap�labilir.
	 * 
	 * 	10)	Overloading nedir?
	 * 		Method ismi ayn� tutularak parametrelerin say�lar�, yerleri veya data type'leri de�i�tirilerek methodlar olu�turmad�r.
	 * 		Overloading Compile Time'd�r.
	 * 		Ayn� isme sahip method'larla farkl� i�lemler yapabilmek i�in overloading kullan�l�r.
	 * 		Mesela substring(+) ve substring(4,7) method'lar�n�n fonksiyonlar� asl�nda ayn�d�r.
	 * 		�kiside bir String'in belli bir b�l�m�n� almaya yarar. fakat baz� durumlarda biti� indexini s�ylemek gerekir., 
	 * 		baz� durumlarda gerekmez. Bunun i�in parametreleri farkl�la�t�r�l�r. Bu da overloading'i do�urur.
	 * 
	 * 	11)	Overriding nedir?
	 * 		Method signature'a (method ismi ve parametreler) dokunulmaz, sadce body de�i�tirilir. Overriding inheritance olunca olur.
	 * 		Ayn� method'un farkl� kullan�mlar� i�in overriding gereklidir.
	 * 		Animal da ses(){Ses ��kar�r} ===> Dog(){Havlama} ==> Kedi(){Miyavlama} gibi...
	 * 		Overriding Run Time Error verir.
	 * 
	 * 	12)	Array ile ArrayList aras�ndaki farklar nelerdir?
	 * 		Array olu�turulurken uzunlu�u belli edilmek zorundad�r. ve daha sonra uzunlu�u de�i�tirilemez.
	 * 		fakat ArayList'lerde ba�lang��ta uzunlu�u belirtme zorunlulu�u yok, eleman ekledik�e uzunlu�u artar,
	 * 		eleman silindik�e uzunlu�u azal�r.
	 * 
	 * 	13)	String ile StringBuilder aras�ndaki farklar nedir?
	 * 		String'ler immutable'dir, StringBuilder ise mutable'dir.(de�i�ime a��kt�r) 
	 * 		StringBuilder class'� daha fazla kullan��l� method'lara sahiptir.
	 * 		Mesela bir String'i tersten yazd�rmak i�in kullan�lan reverse() methodu gibi...
	 * 
	 */

}
