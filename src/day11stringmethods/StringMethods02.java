package day11stringmethods;

public class StringMethods02 {

	public static void main(String[] args) {

		//****substring()**** methodu bir String in belirli bir bölümünü kesip almak için kullanýlýr.
		
		String str1 = "Java calisana kolaydir";
		System.out.println(str1.substring(5)); //calisana kolaydir. 5. index dahil gösterir
		System.out.println(str1.substring(8));//isana kolaydir
		System.out.println(str1.length());
		System.out.println(str1.substring(22));//Ekranda hic bir sey görünmez.Toplam 22 char var.
		
		//System.out.println(str1.substring(23));//index 23 olmadýgýndan Exception hatalý istek der.
		System.out.println(str1.substring(0)); // substring(0) kendisine esit oldugundan kullanýlmasý anlamsýz
		
		//substring() 2. versiyonu
		
		System.out.println(str1.substring(5, 13)); // calisana ==> 5. index dahil 13. index e kadar. 13. indexi almaz.
													// rakamý yazýlan ilk index i alýr son index i almaz. -e kadar ==> [5,13)
		
		System.out.println(str1.substring(6, 12)); //alisan
		System.out.println(str1.substring(6, 6)); //bos==> Ekran boþ 
//		System.out.println(str1.substring(7, 6)); //Exception==> Her zaman ilk index küçük olmalýdýr.
		
		}

}
