package day13whiledowhileloops;

public class WhileLoop02 {

	public static void main(String[] args) {
		//ilk 5 sayma say�s�n�n �arp�n� yap�n�z
		
		int prod=1;
		int num=1;
		
		while(num<=5) {
			prod=prod*num;
			num++;
		}
		System.out.println(prod);
	}

}
