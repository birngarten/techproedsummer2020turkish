package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Kullanicidan ad ve soyadini alalim ekrana yazdiralim
        //Kullanicidan adresini alalim ekrana yazdiralim (2. cadde Bakirkoy Istanbul Turkiye)
        //Kullanicidan yasini alalim ekrana yazdiralim.
        //Kullaniciya "Turkiye'de yasiyorum. Dogru/Yanlis" diye soralim cevabini ekrana yazdiralim
        //true veya false olarak
		
		
		System.out.println("Lutfen ad ve soyadinizi yaziniz!");
		
		String adSoyad = scan.nextLine();
		System.out.println(adSoyad);
		
		System.out.println("Lutfen adresinizi yaziniz!");
		
		String adres = scan.nextLine();
		System.out.println(adres);
		
		System.out.println("Lutfen yasinizi yaziniz");
		
		int yas = scan.nextInt();
		System.out.println(yas);
		
		System.out.println("Tr'de mi yasiyorum. true / false ");
		
		boolean blTr = scan.nextBoolean();
		System.out.println(blTr);
		
		scan.close();
		
	}

}
