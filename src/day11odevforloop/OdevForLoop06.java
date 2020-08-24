package day11odevforloop;

import java.util.Scanner;

public class OdevForLoop06 {

	public static void main(String[] args) {
		// 6) Kullanıcıdan başlangıç ve bitiş harﬂerini alın ve
		// başlangıç harﬁnden başlayıp bitiş harﬁnde biten
		// tüm harﬂeri büyük harf olarak ekrana yazdırın.

		Scanner scan = new Scanner(System.in);

		System.out.println("Baslangic harfini giriniz:");
		char ch1 = scan.next().toUpperCase().charAt(0);

		System.out.println("Bitis harfini giriniz:");
		char ch2 = scan.next().toUpperCase().charAt(0);

		for (char i = ch1; i <= ch2; i++) {
			System.out.print(i + " ");
		}

		scan.close();

	}

}
