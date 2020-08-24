package day25stringbuilder;

public class StringBuilder02 {//A�a��da yaz�lanlar� Class ismiyle kar��t�rma!!!

	public static void main(String[] args) {
		// *****substring()****** methodu atama yapmadan String'i de�i�tirmez.
		
		StringBuilder str1 = new StringBuilder("animals");
		//str1= str1.substring(3); hata verir. Cunku substring() methodu String Class'�ndan gelir 
		//ve bir String return eder. Halbuki str1 String de�il StringBuilder'd�r.
		//Java data tipleri uyu�mad���ndan dolay� atamay� kabul etmez.
		// Bu hatadan kurtulmak i�in iki yol var.
		
		System.out.println(str1);//animals
		
		//1.Yol : String Class'�ndan yeni bir String �retip atama yap�lmal�.
		String str2= str1.substring(3);
		System.out.println(str2);//mals
		
		//2.Yol : str1.substring(3); ifadesini direkt System.out.println(); i�ine yazmak
		System.out.println(str1.substring(3));//mals
		
		System.out.println(str1.substring(1, 4));//nim
		
		//******indexOf()****** methodu belli bir karakterin indexini return eder.
		System.out.println(str1.indexOf("m"));//3 ==> m'nin indexi 3
		
		//*****length()****** methodu String Class'�ndan gelir ve uzunlu�u return eder.
		System.out.println(str1.length());//7 ==>"animals"
		
		//******charAt()***** Methodu belli bir index'teki karakteri return eder
		str1.charAt(5);
		System.out.println(str1);//l ==> l harfinin indexi 5
		
		//*****insert()***** methodu istenen indexe istenen charecteri eklemeye yarar.
		//*****insert()***** methodu append() gibi StringBuilder direk de�i�tirir
		str1.insert(0, "X");
		System.out.println(str1);//Xanimals
		System.out.println(str1.insert(5, "M"));//XanimMals
		
		//*****delete()***** methodu istenen index aral���ndaki charecterleri siler
		str1.delete(0, 1);
		System.out.println(str1);//animMals ==> X silindi
		
		//*****deleteCharAt()***** methodu istenen indexteki characteri siler
		str1.deleteCharAt(4);
		System.out.println(str1);//animals ==> M silindi
		
		//*****reverse()***** methodu String'i tersten yazd�r�r
		str1.reverse();
		System.out.println(str1);//slamina 
		
		//*****toString()***** methodu StringBuilder'i String'e cevirmek i�in kullan�l�r
		str1.toString();
		System.out.println(str1);//str1 art�k StringBuilder de�il String'dir
		
		//StringBuilder Java'nin 5. versiyonunda olusturuldu. StringBuffer'lar 
		//StringBuilder'larin eski versiyonudur.Stringbuilder'lar daha hizli calisir.
		//Bu yuzden StringBuilder kullanmayi tercih edin.

	}

}
