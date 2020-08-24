package day20arrays;

public class OdevSorusu01 {

	public static void main(String[] args) {
		//Bir array’de herhangi iki elemanýn ayný olup olmadýðýný kontrol eden bir program yazýnýz. 
		//Ayný eleman varsa “Ayný eleman var” yoksa  “Ayný eleman yok” yazdýrýnýz.
		
		int arr[] = {1, 2, 3, 4, 3};
		
		int count = 0;
		
		for(int i=0; i<5; i++) {
			
			for(int j=i+1; j<5; j++) {
				
				if(arr[i] == arr[j]) {
					count++;
					break;
				}
			}
		}
		if(count>0) {
			System.out.println("Ayný eleman var");
		}else {
			System.out.println("Ayný eleman yok");
		}

	}

}
