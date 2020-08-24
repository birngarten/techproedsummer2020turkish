package day19arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// Elemanlarý 1, 2, 3, 4, 5, olan bir integer array olusturunuz
		// Bu array'de 3 elemanýnýn olýup olmadýðýný kontrol ediniz.
		// 3 varsa ekrana "3 var" yazdýrýn.
		// 3 yoksa  ekrana "3 yok" yazdýrýn
		// Kac tane 3 oldugunu da yazdirin 
		
		//Array olusturup, eleman eklemek
//		1.Yol
//		int arr[] = new int[5];
//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=3;
//		arr[3]=4;
//		arr[4]=5;
		
		//Array olusturup, eleman eklemek 
//		2.Yol
		int arr[] = {1, 2, 3,3,3,3,3, 3,3, 4, 5};
		
		System.out.println(arr.length);//11 ==>uzunluk
		
		int count = 0;
		
		for(int i=0 ; i<11; i++) {
			if (arr[i]==3) {
				count++;
			}
		}
		if(count>0) {
			System.out.println(count +" tane " + "3 var");
		}else {
			System.out.println("3 yok");
		}
	}

}
