package day11stringmethods;

public class ForLoop02 {

	public static void main(String[] args) {

		// 100 den k�c�k 3�n katlar�n� yan yana yazd�r.

		for (int i = 3; i > 100; i += 3) {
			System.out.print(i + " ");
		}

		// ilk 5 sayma say�s�n�n toplam�n� veren program� for loop ile yaz�n�z
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum = sum + i;
		}
		System.out.println("Toplam: " + sum); // ******yazd�rma i�lemini method body nin d���nda!!!******

		// 10 dan buyuk ilk �c sayma say�s�n�n toplam�?

		int sum1 = 0;
		for (int i = 11; i < 14; i++) {
			sum1 = sum1 + i;
		}
		System.out.println(sum1);

		// 20 den buyuk ilk 5 sayma say�s�n�n toplam�
		int top = 0;

		for (int i = 21; i < 26; i++) {
			top = top + i;
		}
		System.out.println(top);

		// ilk 50 sayma say�s�n�n toplam�

		int num3 = 0;
		for (int i = 1; i < 51; i++) {
			num3 = num3 + i;
		}
		System.out.println(num3);

		// 5 ile bol�nebilen 100 den kucuk say�lar�n toplam�

		int num4 = 0;

		for (int i = 5; i < 100; i += 5) {
			num4 = num4 + i;

		}
		System.out.println(num4);

	}

}
