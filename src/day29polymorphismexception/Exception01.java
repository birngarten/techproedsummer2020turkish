package day29polymorphismexception;

public class Exception01 {

	public static void main(String[] args) {
		// Exceptions : �stisnai hata
		//Ka� t�r Exception var?
		//�ki t�r Exception var;
		//					1)Compile Time Exception (Checked)
		//					2)Run Time Exception 
		
		// Compile Time Exception'a �rnek?
		//			1) FileNotFounfException ==> Dosya bulunamad��� durmda ortaya ��kar
		//			2) IOException (Input Output Exception) Input veya Output yap�l�rken olu�an problemlerde ortaya ��kar
		//NOT: FileNotFounfException, IOException'in child'idir.
		
		//NOT: Compile Time Exception mutlaka Handle edilmelidir.(halledilmelidir)
		// Checked Exceptionlar iki t�rl� handle edilir;
		//      	1) Method isminden sonra "throws" keyword kullan�l�r,
		//   		2)try-catch block kullan�l�r. try-catch block kullanmak readable oldu�undan daha iyi ve tercih edilenidir.
		
		
//		***Checked exceptionlar nas�l handle edilir?**********
				// iki t�rl� yap�yoruz:
				// 1*) throws yazmak: javaya: "problem varsa yard�m iste demektir."
				// 2-)try-catch blocks. try: dene, catch= yakala demketir.
				// 3-) dene- hata c�karsa -yakala-yapamazsan-bana mesaj at. readable d�r.
				//aradaki fark: try catch �nce dener. olmazsa mesaj atar.
				//ama throw da haz�r mesajlar� ekrana atar problem hakk�nda.
				//try da ayr�nt� ve hatan�n yerini �zetleyen bir mesaj yazabilirz. bu y�zden readable dir.

	}

}
