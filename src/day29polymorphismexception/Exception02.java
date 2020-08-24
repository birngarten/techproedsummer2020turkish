package day29polymorphismexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception02 {

	//Checked Exception'lar�( Compile Time Exception) handle etmek i�in iki yol var.
	//	1)"throws" keyword kullanmak. Bunu kullan�rsan�z console'de teknik mesajlar g�r�rs�n�z.
	//BU nedenle �ok tercih edilmez.
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream file = new FileInputStream("C:/ogrenci.txt");

	}

}

	// 2) try-catch block kullanmakt�r. Bunu kullan�rsan�z console'de teknik mesajlar yerine kendi
	//	yazd���m�z mesajlar� g�r�r�z. Bu nedenle try-catch tercih edilir.
class ExceptionTryCatch{
	public static void main(String[]args) {
		try {
			FileInputStream file = new FileInputStream("C:/ogrenci.txt");
		} catch (FileNotFoundException e) {
		System.out.println("Dosyan�n path'i yanlis veya dosya silinmi� olabilir");
		}
		
	}
}