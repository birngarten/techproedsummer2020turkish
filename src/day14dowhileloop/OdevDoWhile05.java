package day14dowhileloop;

import java.util.Scanner;

public class OdevDoWhile05 {

	public static void main(String[] args) {

		// Kullanıcıya bir String girmesini söyleyin ve
		// bu String’in ilk harﬁ ile son harﬁ aynı ise ekrana “Simetrik” yazdırın.
		// Aynı değilse tekrar bir String girmesini isteyin.
		Scanner scan = new Scanner(System.in);

		String str = "";

		do {
			System.out.println("Bir Kelime veya cümle giriniz");
			str=scan.nextLine();
			if (str.charAt(0) == str.charAt(str.length() - 1)) {
				System.out.println("Simetrik");

			} else {
				System.out.println("Lutfen tekrar giris yapin");
			}
		} while (!(str.charAt(0) == str.charAt(str.length() - 1)));
		
		scan.close();
	}

}
