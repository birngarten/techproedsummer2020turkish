package day21multidimensionalarray;

public class OdevMultiDimensionalArray01 {

	public static void main(String[] args) {
				// Aþaðýdaki multi dimensional array’in tum elemanlarýnýn çarpýmýný ekrana
				// yazdýran bir program yazýnýz. { {1,2,3}, {4,5,6} }
		
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
