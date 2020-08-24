package day29polymorphismexception;

public class Exception01 {

	public static void main(String[] args) {
		// Exceptions : Ýstisnai hata
		//Kaç tür Exception var?
		//Ýki tür Exception var;
		//					1)Compile Time Exception (Checked)
		//					2)Run Time Exception 
		
		// Compile Time Exception'a örnek?
		//			1) FileNotFounfException ==> Dosya bulunamadýðý durmda ortaya çýkar
		//			2) IOException (Input Output Exception) Input veya Output yapýlýrken oluþan problemlerde ortaya çýkar
		//NOT: FileNotFounfException, IOException'in child'idir.
		
		//NOT: Compile Time Exception mutlaka Handle edilmelidir.(halledilmelidir)
		// Checked Exceptionlar iki türlü handle edilir;
		//      	1) Method isminden sonra "throws" keyword kullanýlýr,
		//   		2)try-catch block kullanýlýr. try-catch block kullanmak readable olduðundan daha iyi ve tercih edilenidir.
		
		
//		***Checked exceptionlar nasýl handle edilir?**********
				// iki türlü yapýyoruz:
				// 1*) throws yazmak: javaya: "problem varsa yardým iste demektir."
				// 2-)try-catch blocks. try: dene, catch= yakala demketir.
				// 3-) dene- hata cýkarsa -yakala-yapamazsan-bana mesaj at. readable dýr.
				//aradaki fark: try catch önce dener. olmazsa mesaj atar.
				//ama throw da hazýr mesajlarý ekrana atar problem hakkýnda.
				//try da ayrýntý ve hatanýn yerini özetleyen bir mesaj yazabilirz. bu yüzden readable dir.

	}

}
