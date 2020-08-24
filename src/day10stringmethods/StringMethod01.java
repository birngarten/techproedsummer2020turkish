package day10stringmethods;

public class StringMethod01 {

	public static void main(String[] args) {
// indexOf() method'u Stringin icindeki characterin yerini belirlemek icin kullanilir.
        
        String str1 = "Javva World";
        
        System.out.println(str1.indexOf('v')); // Ekrana 2 yazdirir. Cunku index sayimi 0 dan baslar
        System.out.println(str1.indexOf('W')); // Ekrana 6 yazdirir. space Java icin bir character dir.
        System.out.println(str1.indexOf('w')); // Java index bulamaz cunku Java "case sensitive" dir. 
                                               // Kucuk w Stringde yok. Java character bulamayinca -1 return eder.
        System.out.println(str1.indexOf('a')); // Ekrana 1 yazdirir. Birden fazla kullanilan characterler icin Java
                                               // ilk character'in indexini verir
        
        // indexOf() methodu ikinci versiyonu
        System.out.println(str1.indexOf('a',2)); // Stringdeki ikinci 'a' characterinin indexini bulunuz
                                                 // Ekrana 4 yazdirmali
        System.out.println(str1.indexOf('a',4)); // Ekrana 4 yazdirir
        
        System.out.println(str1.indexOf('a',1)); // Ekrana 1 yazdirir
        
        System.out.println(str1.indexOf('a',5)); // Ekrana -1 yazdirir. Cunku Stringde 'a' olmasina ragmen
                                                 // benim aramaya basla dedigim yerde 'a' yok
        
        
        //"Alamanya" Stringindeki ikinci 'a' caharacterinin indexini bulunuz.
        String str2 = "Alamanya";
        
        System.out.println(str2.indexOf('a')); //Bu birinci 'a' nin indexi ==> 2
        int idx = str2.indexOf('a');
        System.out.println(str2.indexOf('a', idx+1)); //Ekrana 4 yazdirmali
        
        
        //indexOf() methodunun 3-ucuncu versiyonu
        
		String str3 = "Missisipi";
		System.out.println(str3.indexOf("is")); // ilk "is" Stringini bulur ve ilk harfin indexini return eder. Yani i harfinin.
		
		System.out.println(str3.indexOf("si")); // 3 yazdýrýr.
		
		System.out.println(str3.indexOf('s', 3));

	}

}
