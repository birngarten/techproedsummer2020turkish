package day15methodcreation;

import java.util.Scanner;

public class OdevMethodCreation05 {

	public static void main(String[] args) {
		
		//Kullan�c�ya bir String girmesini s�yleyin 
		//ve bu String�i yukar�dan a�a��ya do�ru yazd�ran
        //Program yaz�n�z. Ornegin; CAN ==> C
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
