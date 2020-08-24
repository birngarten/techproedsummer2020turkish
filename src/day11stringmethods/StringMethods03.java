package day11stringmethods;

public class StringMethods03 {

	public static void main(String[] args) {

		//*****concat()***** method concatenation yapmanýn yani iki Stringi birlestirmenin diger yöntemidir.
		
		String str1 = "Ali";
		String str2 = "Veli";
		
		System.out.println(str1 + str2); //AliVeli
		System.out.println(str1.concat(str2));//AliVeli "+" ile ayný iþlevi var. iki String i birleþtiriyor.
		System.out.println(str1.concat(str2).concat(str1).concat(str2)); //AliVeliAliVeli ==> Ýstenildiði kadar kullanýlabilir.
		
		
		
		//*****replace()****** methodu :
		//varolan bir characterin butun görünümlerinin yerine baska chracter i yazmaya yarar.
		//ÖRNEK: ata ==> ana yapar.
		
		String str3 = "ata";
		System.out.println(str3.replace("t", "n"));//ana ==> ata ana oldu.
		System.out.println(str3.replace("a", "o"));//oto ==> ata oto oldu
		
		System.out.println(str3.replace("t", " "));//a a ==> olmayan deðerlerle ilgi deðiþim yapmaz.
		System.out.println(str3.replace("t", ""));//aa olur, t'yi siler. Bu yontem bir karakteri String den silmek için kullanýlýr.
		
		System.out.println(str3.replace("at","Mustaf"));//Mustafa 
		System.out.println(str3.replace("at", "y"));//ay
		
		
		String st= "gözlerime bakma";
		
		System.out.println(st.replace("lerime bakma", "üme bak"));
		
		
		//****replaceFirst()***** methodu :
		//Deðiþtirmek istediðimiz karakterin sadece ilk görünümünü deðiþtirir
		
		String str4 = "karakartal";
		System.out.println(str4.replaceFirst("k", "K")); //Karakartal ==> ilk k yi büyüttü.
		System.out.println(str4.replaceFirst("a", "e")); //kerakartal ==> ilk a yi deðiþtirdi.
		System.out.println(str4.replaceFirst("ka", "A")); //Arakartal ==> ilk ka yý deðiþtirdi.
		System.out.println(str4.replaceFirst("kar", "")); //akartal
		System.out.println(str4.replaceFirst("kara", "A"));//Akartal
		System.out.println(str4.replaceFirst("karakartal", "Galatasaray"));//Galatasaray
		
		//Soru: tüm Ali leri Veli ile deðitiriniz.
	    String text = "Ali okula gitti. Ali otobuse bindi. Ali eve geldi. Ali yemek yedi. Ali uyudu.";
	    System.out.println(text.replace("Ali", "Veli"));

		
		
		//replaceAll() ve replace() methodlarý ayný þeyi yapar.
		//replace() de tek karakterler için '' tek týrnak kullanýlabilir.
		
		
	}

}
