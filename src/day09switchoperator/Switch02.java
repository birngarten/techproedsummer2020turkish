package day09switchoperator;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {

		// Kullan�c� haftan�n gun numaras�n� girsin
		// Program�n�z gunun ismini yazs�n
		//Yanl�s gun say�s� girdiginde "Gecerli Gun Say�s� Giriniz"
		//switch() kullanarak yapiniz
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Haftan�n gun numaras�n� giriniz");
		int gun = scan.nextInt();
		
		
		switch (gun) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("sali");
			break;
		case 3:
			System.out.println("Carsamba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("Gecerli Gun Numarasi Giriniz");
		}
		
		scan.close();
	}

}
