package day21multidimensionalarray;

public class OdevMultiDimensionalArray01 {

	public static void main(String[] args) {
				// A�a��daki multi dimensional array�in tum elemanlar�n�n �arp�m�n� ekrana
				// yazd�ran bir program yaz�n�z. { {1,2,3}, {4,5,6} }
		
				int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
				
				int prod = 1;
				
				for(int i=0; i<arr.length; i++) {
					
					for(int j=0; j<arr[i].length; j++) {
						
						prod = prod * arr[i][j];
					}
				}

				System.out.println("Tum Elemanlarin Carpimi = " + prod);
	}

}
