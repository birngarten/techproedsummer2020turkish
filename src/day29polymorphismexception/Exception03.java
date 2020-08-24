package day29polymorphismexception;

public class Exception03 {

	public static void main(String[] args) {
		// Bölme iþlemi yapan bir program yazalým
		
		int num1 = 6;
		int num2 = 0;
		
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("Sýfýr ile bölme yapýlmaz");
		}catch(Exception e) {
			System.out.println("Sýfýr ile bölme yapýlmaz");{
				
			}
		
		//ArithmeticException Run Time Exception'dýr. Matematik kurallarýna uygun olmayan 
		//bir iþlem yapýldýðýnda bu exception görülür.
		
		//try'dan sonra birden fazla catch kullanýlabilir.
		//Ama üstteki catch alttaki catch'in child'i olmalýdýr. Child üstte olmalý, parent altta.
			//catch'ler Specific'ten Genel'e doðru dizilmelidir.
		}
	}
}


