package day15methodcreation;

import java.util.Scanner;

public class OdevMethodCreation05 {

	public static void main(String[] args) {
		
		//Kullanýcýya bir String girmesini söyleyin 
		//ve bu String’i yukarýdan aþaðýya doðru yazdýran
        //Program yazýnýz. Ornegin; CAN ==> C
//                                          A
//                                          N
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir kelime veya cumle giriniz");
		String str=scan.nextLine();
		
		System.out.println(str+"==>"+str.charAt(0));
		
		int index=1;
		while (index<str.length()) {
		
			String bos="";
		    int in=0;
		    while (in<str.length()) {
			       bos=bos.concat(" ");
			       in++;
		     }
		
		System.out.println(bos+"   "+str.charAt(index));
		     
		index++;
		}

	}

}
