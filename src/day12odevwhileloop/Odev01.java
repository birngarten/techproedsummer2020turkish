package day12odevwhileloop;

public class Odev01 {

	public static void main(String[] args) {

		// Soru 1) While loop kullanarak 3 den 13 e kadar tum tek tamsayýlarý ekrana
		// yazdýrýnýz.

		int num = 3;

		while (num < 13) {
			if (num % 2 != 0)
				System.out.println(num);
			num++;
		}

	}

}
