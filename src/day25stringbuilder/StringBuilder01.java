package day25stringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		// StringBuilder Class'� String �retmeye ve
		// �retilen String'leri manipule etmeye yarar.

		// String Class'� kullanarak String �retilirse yap�lan de�i�iklikler,
		// ilk �retilen Sitring'i etkilemez.
		//Ama illa ilk �retilen String de�i�sin istenirse Atama yap�lmak zorunlu!!!
		//yani ===>  str = str.substring(1); <=== Bu Atama ��lemi!!!!
		
		//String Class'�n� kullan�larak �rettilen String'ler atama olmadan
		//de�i�tirilemedi�i i�in String Class'�na "immutable" denir.
		
		String str = "Ali";
		str.substring(1);// yap�lan de�i�iklik atanmazsa "Ali" yazar.
		System.out.println(str);//Ali
		
		str = str.substring(1);// <=== Bu Atama ��lemi!!!! Ancak atama yap�l�rsa de�i�ikli olur ==>"li"
		System.out.println(str);//li
		
		//StringBuilder Class'�n� kullan�larak  String �retilirse yap�lan de�i�iklikler
		//ilk �retilen String'i etkiler.Atama yapmaya gerek yoktur.
		
		//StringBuilder Class'� de�i�imi yans�tt��� i�in ona "mutable" denir.
		
		//1.Yol
		StringBuilder strBld1 = new StringBuilder("Ali");
		strBld1.append("Can"); // ****append()***** methodu String'e yeni bir String eklemek i�in kullan�l�r.
								// Concatination yapar
		System.out.println(strBld1);// AliCan => StringBuilder atama yap�lmadan append() methodu ile de�i�iklik yapt�.
		
		//2.Yol
		StringBuilder strBld2 = new StringBuilder();//Bo� bir String �retir ==> ""
		strBld2.append("Ali Can"); //Bos String'e "AliCan" eklenebilir.
		
		//3.Yol
		StringBuilder strBld3 = new StringBuilder(7); //Uzunlu�u 7 karakter olan bir String
		strBld3.append("Ali");//ilk �� index dolar gerisi bo� kal�r.
		strBld3.append("Kahraman");//bu durumda StringBuilder "mutable" oldu�undan kendini b�y�t�r.
									//Dolay�s�yla Ali'den sonra Kahraman gelir artan karakterler i�in
									//Java taraf�ndan yeni index'ler eklenir. 

	}

}
