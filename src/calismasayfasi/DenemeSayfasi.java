package calismasayfasi;

import java.util.Arrays;
import java.util.Scanner;

public class DenemeSayfasi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		 int num =3;
		    
			if(num>str.length()){
			  num=str.length();
			}
			String fr = str.substring(0, num);
			String st ="";
	    
			for(int i=0; i<n; i++) {
			  st=st+fr;
			}
		  System.out.println(st); 
	  
		

	}
}