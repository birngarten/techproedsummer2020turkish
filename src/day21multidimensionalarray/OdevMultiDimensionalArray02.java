package day21multidimensionalarray;

public class OdevMultiDimensionalArray02 {

	public static void main(String[] args) {

		// A�a��daki multi dimensional array�in i� array�lerindeki son elemanlar�n
		// �arp�m�n�
		// ekrana yazd�ran bir program yaz�n�z { {1,2,3}, {4,5}, {6} }

		int arr[][] = { { 1, 2, 3 }, { 4, 5 }, { 6 } };

		int prod = 1;
		for (int i = 0; i < arr.length; i++) {

			prod = prod * arr[i][arr[i].length - 1];
		}
		System.out.println("Son elemanlar�n�n carp�m = " + prod);
	}

}
