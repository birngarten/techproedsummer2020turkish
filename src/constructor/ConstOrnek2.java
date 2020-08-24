package constructor;

public class ConstOrnek2 {
	String isim = "Cem Can";
	int yas = 35;	
	String meslek = "Ogretmen";	
	
	ConstOrnek2(){  
		
	}
	
	ConstOrnek2(String isim, int yas, String meslek){ 
		this.isim = isim;
		this.yas = yas;
		this.meslek = meslek;		
	}

	 ConstOrnek2(String isim){  
		this.isim = "Erkan";		
	}
	public ConstOrnek2(String isim, int yas) {
		this.isim = isim;
		this.yas = yas;		
	}

	public static void main(String[] args) {
		
		ConstOrnek2 kisi1 = new ConstOrnek2(); 
		System.out.println(kisi1.isim+"\n");
		
		ConstOrnek2 kisi2 = new ConstOrnek2("Metin Ozan", 55, "Doktor"); 
		System.out.println(kisi2.isim);
		System.out.println(kisi2.yas);
		System.out.println(kisi2.meslek+"\n");
		
		ConstOrnek2 kisi3 = new ConstOrnek2("Atakan Mutlu"+"\n"); 
		System.out.println(kisi3.isim);
		
		ConstOrnek2 kisi4 = new ConstOrnek2("Nuh Bakkal", 40); 
		System.out.println(kisi4.isim);
		System.out.println(kisi4.yas);		
	}
}
