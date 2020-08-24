package day11stringmethods;

public class ForLoop03 {

	public static void main(String[] args) {
		
		//ilk 4 sayma sayýsýnýn çarpýmýný veren for loop oluþturunuz.
		//1*2*3*4=
		
		int product =1;
		for(int i=1; i<5; i++) {
			product = product*i;
		}
			System.out.println(product);
			
			
			//ilk 6 çift sayýnýn carpýmý
			int prod = 1;
			for(int i=2; i<13; i=i+2) {
				prod=prod*i;
				
			}System.out.println(prod); 
			// Matematikten 1 er 1er geri sayým yapýp carpmaya faktoriyel denir.
			//6!=6*5*4*3*2*1
			//Interview sorusu
			
			//9! li hesaplayan programý yazýnýz
			int prod1=1;
			for(int i=9; i>0; i--) {
				prod1= prod1*i;
			}System.out.println("9!= "+prod1);				
			
	}

}
