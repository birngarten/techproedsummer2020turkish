package day11stringmethods;

public class StringMethods04 {

	public static void main(String[] args) {

		//*****valueOf()***** Methodu rakamlarla oluþturulan String leri sayýya dönüþtürür.
		//Böylece rakamlarla oluþturalan String lerle matematiksel iþlem yapmamýzý saðlar.
		
		//valueOf() hem Integer wrapper Class'inin icinde hem de String'in icinde var. Integer wrapper classinin icinde 
		//olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

		String paraErkek = "1900";
		String paraKadin = "2000";
		
		//Bu ailenin toplam gelirini bulunuz?
		
		System.out.println(paraErkek + paraKadin);//19002000
		System.out.println(Integer.valueOf(paraErkek)+ Integer.valueOf(paraKadin));
		
		
		//maasErkek ve maasKadin sayilarýný String e dönüþtürün ve concatenation yapýn
		int maasErkek = 1900;
		int maasKadin = 2000;
		System.out.println(maasErkek+maasKadin);//3900
		System.out.println(String.valueOf(maasErkek) + String.valueOf(maasKadin));//19002000
		
		
		
	}

}
