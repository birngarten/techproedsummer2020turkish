package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		
	//Kullanýcý 2 tam sayý versin.
	// Program bu tamsayýlarýn toplamýný ve çarpýmýný ekrana yazdýrsýn.
		Scanner scan = new Scanner(System.in); // Scanner Classýný import ettik. Scannerýn altý kýrmýzý iken 
											//üzerinde 1 saniye bekleyince çýkan tablodan import seç.
		System.out.println("Lutfen iki tamsayý giriniz.");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();

		System.out.println(sayi1 + sayi2);
		System.out.println(sayi1 * sayi2);

		scan.close();
	}

}
