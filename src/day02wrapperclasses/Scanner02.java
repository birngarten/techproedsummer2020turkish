package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		/*Kullan�c� karenin bir kenar uzunlu�u girsin
		Karenin cevresini ve alan�n� ekrana yazd�ral�m
		Karenin �evresi a+a+a+a, alan� a*a
		*/
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz");
		
		int kenarUzunlugu = scan.nextInt();
		
		System.out.println(kenarUzunlugu + kenarUzunlugu + kenarUzunlugu + kenarUzunlugu); /* �NEML�: Alttaki Console da say� yaz�p Enter'a bast���m�zda, sonu� ��kar*/
		System.out.println(kenarUzunlugu * kenarUzunlugu);
	
		scan.close();
		
	}

}
