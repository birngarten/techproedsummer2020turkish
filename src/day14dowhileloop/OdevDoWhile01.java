package day14dowhileloop;

public class OdevDoWhile01 {

	public static void main(String[] args) {

		// 1) 9 den 190 e kadar 7 nin kati olan tüm tamsayýlarý ekrana yazdýrýnýz.

		int num = 9;

		do {
			if (num % 7 == 0) 
				System.out.print(num + " ");		
			num++;
		} while (num < 190);

	}

}
