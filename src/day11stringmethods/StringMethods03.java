package day11stringmethods;

public class StringMethods03 {

	public static void main(String[] args) {

		//*****concat()***** method concatenation yapman�n yani iki Stringi birlestirmenin diger y�ntemidir.
		
		String str1 = "Ali";
		String str2 = "Veli";
		
		System.out.println(str1 + str2); //AliVeli
		System.out.println(str1.concat(str2));//AliVeli "+" ile ayn� i�levi var. iki String i birle�tiriyor.
		System.out.println(str1.concat(str2).concat(str1).concat(str2)); //AliVeliAliVeli ==> �stenildi�i kadar kullan�labilir.
		
		
		
		//*****replace()****** methodu :
		//varolan bir characterin butun g�r�n�mlerinin yerine baska chracter i yazmaya yarar.
		//�RNEK: ata ==> ana yapar.
		
		String str3 = "ata";
		System.out.println(str3.replace("t", "n"));//ana ==> ata ana oldu.
		System.out.println(str3.replace("a", "o"));//oto ==> ata oto oldu
		
		System.out.println(str3.replace("t", " "));//a a ==> olmayan de�erlerle ilgi de�i�im yapmaz.
		System.out.println(str3.replace("t", ""));//aa olur, t'yi siler. Bu yontem bir karakteri String den silmek i�in kullan�l�r.
		
		System.out.println(str3.replace("at","Mustaf"));//Mustafa 
		System.out.println(str3.replace("at", "y"));//ay
		
		
		String st= "g�zlerime bakma";
		
		System.out.println(st.replace("lerime bakma", "�me bak"));
		
		
		//****replaceFirst()***** methodu :
		//De�i�tirmek istedi�imiz karakterin sadece ilk g�r�n�m�n� de�i�tirir
		
		String str4 = "karakartal";
		System.out.println(str4.replaceFirst("k", "K")); //Karakartal ==> ilk k yi b�y�tt�.
		System.out.println(str4.replaceFirst("a", "e")); //kerakartal ==> ilk a yi de�i�tirdi.
		System.out.println(str4.replaceFirst("ka", "A")); //Arakartal ==> ilk ka y� de�i�tirdi.
		System.out.println(str4.replaceFirst("kar", "")); //akartal
		System.out.println(str4.replaceFirst("kara", "A"));//Akartal
		System.out.println(str4.replaceFirst("karakartal", "Galatasaray"));//Galatasaray
		
		//Soru: t�m Ali leri Veli ile de�itiriniz.
	    String text = "Ali okula gitti. Ali otobuse bindi. Ali eve geldi. Ali yemek yedi. Ali uyudu.";
	    System.out.println(text.replace("Ali", "Veli"));

		
		
		//replaceAll() ve replace() methodlar� ayn� �eyi yapar.
		//replace() de tek karakterler i�in '' tek t�rnak kullan�labilir.
		
		
	}

}
