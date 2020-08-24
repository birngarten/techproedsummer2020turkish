package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethodSoru {

	public static void main(String[] args) {

		//Verilen bir cümledeki boþluklar hariç karakter sayýsýný bulunuz.
		
		String str = "Verilen bir cumledeki boþluklari haric karakter sayisini bulunuz";
		str = str.replace(" ", "");//"Verilenbircumledekiboþluklariharickaraktersayisinibulunuz"
		String harf[] = str.split("");
		
		System.out.println(Arrays.toString(harf));
		System.out.println("Harf sayýsý : " + harf.length);
		
		//2.Cözüm yolu
		//Bosluk sayýsý kelime sayýsýndan bir azdýr.
		//Bosluk sayýsý = Kelime sayýsý -1
		
		String str1 = "Verilen bir cumledeki boþluklari haric karakter sayisini bulunuz";
		String kelime []= str1.split(" ");
		int boslukSayisi = kelime.length-1;
		String character[] = str.split("");
		System.out.println("Harf Sayýaý : " + (character.length-boslukSayisi));
		
		//3.Çözüm yolu
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
