package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		
	//Kullan�c� 2 tam say� versin.
	// Program bu tamsay�lar�n toplam�n� ve �arp�m�n� ekrana yazd�rs�n.
		Scanner scan = new Scanner(System.in); // Scanner Class�n� import ettik. Scanner�n alt� k�rm�z� iken 
											//�zerinde 1 saniye bekleyince ��kan tablodan import se�.
		System.out.println("Lutfen iki tamsay� giriniz.");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();

		System.out.println(sayi1 + sayi2);
		System.out.println(sayi1 * sayi2);

		scan.close();
	}

}
