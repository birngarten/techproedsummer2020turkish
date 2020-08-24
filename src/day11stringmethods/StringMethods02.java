package day11stringmethods;

public class StringMethods02 {

	public static void main(String[] args) {

		//****substring()**** methodu bir String in belirli bir b�l�m�n� kesip almak i�in kullan�l�r.
		
		String str1 = "Java calisana kolaydir";
		System.out.println(str1.substring(5)); //calisana kolaydir. 5. index dahil g�sterir
		System.out.println(str1.substring(8));//isana kolaydir
		System.out.println(str1.length());
		System.out.println(str1.substring(22));//Ekranda hic bir sey g�r�nmez.Toplam 22 char var.
		
		//System.out.println(str1.substring(23));//index 23 olmad�g�ndan Exception hatal� istek der.
		System.out.println(str1.substring(0)); // substring(0) kendisine esit oldugundan kullan�lmas� anlams�z
		
		//substring() 2. versiyonu
		
		System.out.println(str1.substring(5, 13)); // calisana ==> 5. index dahil 13. index e kadar. 13. indexi almaz.
													// rakam� yaz�lan ilk index i al�r son index i almaz. -e kadar ==> [5,13)
		
		System.out.println(str1.substring(6, 12)); //alisan
		System.out.println(str1.substring(6, 6)); //bos==> Ekran bo� 
//		System.out.println(str1.substring(7, 6)); //Exception==> Her zaman ilk index k���k olmal�d�r.
		
		}

}
