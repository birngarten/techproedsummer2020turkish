package day11stringmethods;

public class ForLoop02 {

	public static void main(String[] args) {

		// 100 den kücük 3ün katlarýný yan yana yazdýr.

		for (int i = 3; i > 100; i += 3) {
			System.out.print(i + " ");
		}

		// ilk 5 sayma sayýsýnýn toplamýný veren programý for loop ile yazýnýz
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum = sum + i;
		}
		System.out.println("Toplam: " + sum); // ******yazdýrma iþlemini method body nin dýþýnda!!!******

		// 10 dan buyuk ilk üc sayma sayýsýnýn toplamý?

		int sum1 = 0;
		for (int i = 11; i < 14; i++) {
			sum1 = sum1 + i;
		}
		System.out.println(sum1);

		// 20 den buyuk ilk 5 sayma sayýsýnýn toplamý
		int top = 0;

		for (int i = 21; i < 26; i++) {
			top = top + i;
		}
		System.out.println(top);

		// ilk 50 sayma sayýsýnýn toplamý

		int num3 = 0;
		for (int i = 1; i < 51; i++) {
			num3 = num3 + i;
		}
		System.out.println(num3);

		// 5 ile bolünebilen 100 den kucuk sayýlarýn toplamý

		int num4 = 0;

		for (int i = 5; i < 100; i += 5) {
			num4 = num4 + i;

		}
		System.out.println(num4);

	}

}
