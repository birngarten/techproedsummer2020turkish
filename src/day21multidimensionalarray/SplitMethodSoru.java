package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethodSoru {

	public static void main(String[] args) {

		//Verilen bir c�mledeki bo�luklar hari� karakter say�s�n� bulunuz.
		
		String str = "Verilen bir cumledeki bo�luklari haric karakter sayisini bulunuz";
		str = str.replace(" ", "");//"Verilenbircumledekibo�luklariharickaraktersayisinibulunuz"
		String harf[] = str.split("");
		
		System.out.println(Arrays.toString(harf));
		System.out.println("Harf say�s� : " + harf.length);
		
		//2.C�z�m yolu
		//Bosluk say�s� kelime say�s�ndan bir azd�r.
		//Bosluk say�s� = Kelime say�s� -1
		
		String str1 = "Verilen bir cumledeki bo�luklari haric karakter sayisini bulunuz";
		String kelime []= str1.split(" ");
		int boslukSayisi = kelime.length-1;
		String character[] = str.split("");
		System.out.println("Harf Say�a� : " + (character.length-boslukSayisi));
		
		//3.��z�m yolu
		int count =0;
		for(int i=0; i<args.length; i++) {
			char temp = str.charAt(i);
			if(temp==' ') {
				count++;
			}
		}
		String harf1[] = str.split("");
		System.out.println( harf1.length-count);
	}

}
