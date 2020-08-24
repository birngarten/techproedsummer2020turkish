package day38interviewhazirlik;

public class InterviewHazirlik02 {
	/*
	 * 	14)	Access Modifier nedir?
	 * 		Bir Class'a, variable'a veya method'a ula��m� d�zenler.
	 * 		4 tane Access Modifier vard�r. Bunlar;
	 * 		1) Public: Herkes ula�abilir.
	 * 		2) Protected: Ayn� package i�inde ve farkl� package'lerdeki child class'lardan ula��labilinir.
	 * 		3) Default (Package Private): Sadece ayn� package'den ula��labilinir
	 * 		4) Private: Sadece class i�inden ula��labilinir.
	 * 
	 * 	15)	Pass by Value Pass by Reference nedir?
	 * 		Bir method'a variable yolland���nda java o variable'�n kopyas�n� olu�turur ve
			method'a kopyas�n� yollar. 
			Bu y�zden variable'�n orijinal de�eri method �al��t�ktan sonra da ayn� kal�r.
			Mesela bir firma Ya�l�ya %10, gen�lere %5, engellilere %15 indirim yaps�n.
			eger Pass By Value olmasa  firman�n g�mle�i ya�l�ya fiyat�n %90'�na, gen�lere % 85'e, engellilere %70 olurdu.
		 	ama asl�nda ya�l�lara %90, gen�lere %95, engellilere %85 fiyatla sat�yor. Java bunu Pass By Value sa�l�yor.
		
			Pass by Reference'da ise referance'nin kopyas� olu�tutrulur ve methoda yollan�r.
			fakat reference'nin kopyas� da kendisi gibi ayn� object'i g�sterdi�i i�in orjinal de�er de�i�ir.
			
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
