package day11stringmethods;

public class ForLoop03 {

	public static void main(String[] args) {
		
		//ilk 4 sayma say�s�n�n �arp�m�n� veren for loop olu�turunuz.
		//1*2*3*4=
		
		int product =1;
		for(int i=1; i<5; i++) {
			product = product*i;
		}
			System.out.println(product);
			
			
			//ilk 6 �ift say�n�n carp�m�
			int prod = 1;
			for(int i=2; i<13; i=i+2) {
				prod=prod*i;
				
			}System.out.println(prod); 
			// Matematikten 1 er 1er geri say�m yap�p carpmaya faktoriyel denir.
			//6!=6*5*4*3*2*1
			//Interview sorusu
			
			//9! li hesaplayan program� yaz�n�z
			int prod1=1;
			for(int i=9; i>0; i--) {
				prod1= prod1*i;
			}System.out.println("9!= "+prod1);				
			
	}

}
