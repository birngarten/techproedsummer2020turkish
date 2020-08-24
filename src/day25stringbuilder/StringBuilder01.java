package day25stringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		// StringBuilder Class'ý String üretmeye ve
		// üretilen String'leri manipule etmeye yarar.

		// String Class'ý kullanarak String üretilirse yapýlan deðiþiklikler,
		// ilk üretilen Sitring'i etkilemez.
		//Ama illa ilk üretilen String deðiþsin istenirse Atama yapýlmak zorunlu!!!
		//yani ===>  str = str.substring(1); <=== Bu Atama Ýþlemi!!!!
		
		//String Class'ýný kullanýlarak ürettilen String'ler atama olmadan
		//deðiþtirilemediði için String Class'ýna "immutable" denir.
		
		String str = "Ali";
		str.substring(1);// yapýlan deðiþiklik atanmazsa "Ali" yazar.
		System.out.println(str);//Ali
		
		str = str.substring(1);// <=== Bu Atama Ýþlemi!!!! Ancak atama yapýlýrsa deðiþikli olur ==>"li"
		System.out.println(str);//li
		
		//StringBuilder Class'ýný kullanýlarak  String üretilirse yapýlan deðiþiklikler
		//ilk üretilen String'i etkiler.Atama yapmaya gerek yoktur.
		
		//StringBuilder Class'ý deðiþimi yansýttýðý için ona "mutable" denir.
		
		//1.Yol
		StringBuilder strBld1 = new StringBuilder("Ali");
		strBld1.append("Can"); // ****append()***** methodu String'e yeni bir String eklemek için kullanýlýr.
								// Concatination yapar
		System.out.println(strBld1);// AliCan => StringBuilder atama yapýlmadan append() methodu ile deðiþiklik yaptý.
		
		//2.Yol
		StringBuilder strBld2 = new StringBuilder();//Boþ bir String üretir ==> ""
		strBld2.append("Ali Can"); //Bos String'e "AliCan" eklenebilir.
		
		//3.Yol
		StringBuilder strBld3 = new StringBuilder(7); //Uzunluðu 7 karakter olan bir String
		strBld3.append("Ali");//ilk üç index dolar gerisi boþ kalýr.
		strBld3.append("Kahraman");//bu durumda StringBuilder "mutable" olduðundan kendini büyütür.
									//Dolayýsýyla Ali'den sonra Kahraman gelir artan karakterler için
									//Java tarafýndan yeni index'ler eklenir. 

	}

}
