package day29polymorphismexception;

public class Exception03 {

	public static void main(String[] args) {
		// B�lme i�lemi yapan bir program yazal�m
		
		int num1 = 6;
		int num2 = 0;
		
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("S�f�r ile b�lme yap�lmaz");
		}catch(Exception e) {
			System.out.println("S�f�r ile b�lme yap�lmaz");{
				
			}
		
		//ArithmeticException Run Time Exception'd�r. Matematik kurallar�na uygun olmayan 
		//bir i�lem yap�ld���nda bu exception g�r�l�r.
		
		//try'dan sonra birden fazla catch kullan�labilir.
		//Ama �stteki catch alttaki catch'in child'i olmal�d�r. Child �stte olmal�, parent altta.
			//catch'ler Specific'ten Genel'e do�ru dizilmelidir.
		}
	}
}


