package day14dowhileloop;

public class DoWhile02 {

	public static void main(String[] args) {
		
		//do-while ile while loop'larýnýn farký
		//do-while en az 1 kere yazdýrýr.
		int num1=9;
		while(num1<7) {
			System.out.println("While: " + num1); //ekrana hiçbir þey yazmaz
			num1++;
		}
		
		int num2=9;
		do {
			System.out.println("Do while: " + num2); //9
			num2++;
		}while(num2<7);		

	}

}
