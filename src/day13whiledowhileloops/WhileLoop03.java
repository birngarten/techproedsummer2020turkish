package day13whiledowhileloops;

public class WhileLoop03 {

	public static void main(String[] args) {
		// 3 ün çarpým tablosunu ekrana yazdýran programý yazýnýz
		//3x1=3, 3x2=6,...3x10=30
		
		
		//for ile
		for(int i=1; i<=10; i++) {
			System.out.println("3x"+ i+"="+(3*i));
		}
		
		
		//while ile
		int num=1;
		while(num<=10) {
			System.out.println("3x"+ num + "=" + (3*num));
			num++;
		}
	}

}
