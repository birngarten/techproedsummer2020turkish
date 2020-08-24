package day13whiledowhileloops;

public class WhileLoop02 {

	public static void main(String[] args) {
		//ilk 5 sayma sayýsýnýn çarpýný yapýnýz
		
		int prod=1;
		int num=1;
		
		while(num<=5) {
			prod=prod*num;
			num++;
		}
		System.out.println(prod);
	}

}
