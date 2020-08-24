package day28overriding;

public class Mammal extends Animal {

	public boolean birth = true;
	public String name = "Kedi";
	public static void main(String[] args) {
		Mammal mammal = new Mammal();

	}
	
	public void feed () {
		System.out.println("Yavrular�n� besler");
	}
	
	public Mammal(){
		//this i�inde bulund�u class'taki variable ve methodlara ula�mam�z� sa�lar
		System.out.println(this.birth); //true
		this.feed();//"Yavrular�n� besler" ==>this bu Class'tekileri bulur ve yazar.
		
		//Child_Parent ili�kisi varsa this kullanarak parent class'taki 
		// variable ve methodlarada ula��labilir.
		//Ama Parent Classlar'daki variable ve methodlara ula�mak i�in this kullanmay�n.
		//��nk� child ve parent'daki ayn� isimli variable ve methodlarda problem ya�ayabilirisniz.
		//Genel kullan�mda this Class i�indekiler i�in, super Parent Class'lar�n i�indekileri i�in kullan�l�r.
		
		System.out.println(this.age);//4 ==> this inheritance'den(extends) dolay� Animal Class'takini(Parent) de buldu ve yazd�.
		System.out.println(this.name);//"Karabas==>Kedi oldu" ==> this "     "    "    "    "   "
		this.move();//"Hayvanlar hareket eder" ==> Parent Class'tan geldi.
		System.out.println(this.name);//Kedi
		
		//Parantezsiz super Parent'lardaki variable ve methodlara ula�mam�z� sa�lar.
		//Parent'dakilere super kullanarak ula�mak daha g�venlidir.
		//super i�inde bulundu�u Class'taki variable ve methodlara ula�amaz.
		System.out.println(super.age);//4 ==>Parent Class'tan geldi(Animal)
		System.out.println(super.name);//"Karabas" ==>Parent Class'tan geldi(Animal)
		super.move();//"Hayvanlar hareket eder" ==>Parent Class'tan geldi(Animal)
		
	}

}
