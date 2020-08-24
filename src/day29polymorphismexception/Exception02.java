package day29polymorphismexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception02 {

	//Checked Exception'larý( Compile Time Exception) handle etmek için iki yol var.
	//	1)"throws" keyword kullanmak. Bunu kullanýrsanýz console'de teknik mesajlar görürsünüz.
	//BU nedenle çok tercih edilmez.
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream file = new FileInputStream("C:/ogrenci.txt");

	}

}

	// 2) try-catch block kullanmaktýr. Bunu kullanýrsanýz console'de teknik mesajlar yerine kendi
	//	yazdýðýmýz mesajlarý görürüz. Bu nedenle try-catch tercih edilir.
class ExceptionTryCatch{
	public static void main(String[]args) {
		try {
			FileInputStream file = new FileInputStream("C:/ogrenci.txt");
		} catch (FileNotFoundException e) {
		System.out.println("Dosyanýn path'i yanlis veya dosya silinmiþ olabilir");
		}
		
	}
}