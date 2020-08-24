package day13odevwhileloop;

public class Day13Odev01 {

	public static void main(String[] args) {

		// 1) 8 den 180 e kadar 5 in kati olan tum tamsayýlarý ekrana yazdýrýnýz.

		// For Loop ile çözüm:
		System.out.println("For Loop ile cozum ");
		for (int i = 8; i <= 180; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// While Loop ile cozum:
		System.out.println("While Loop ile cozum");
		int num = 8;

		while (num <= 180) {
			if (num % 5 == 0) {
				System.out.print(num + " ");
			}
			num++;
		}

	}

}
