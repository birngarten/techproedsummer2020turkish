package day28overriding;

public class Mammal extends Animal {

	public boolean birth = true;
	public String name = "Kedi";
	public static void main(String[] args) {
		Mammal mammal = new Mammal();

	}
	
	public void feed () {
		System.out.println("Yavrularýný besler");
	}
	
	public Mammal(){
		//this içinde bulundðu class'taki variable ve methodlara ulaþmamýzý saðlar
		System.out.println(this.birth); //true
		this.feed();//"Yavrularýný besler" ==>this bu Class'tekileri bulur ve yazar.
		
		//Child_Parent iliþkisi varsa this kullanarak parent class'taki 
		// variable ve methodlarada ulaþýlabilir.
		//Ama Parent Classlar'daki variable ve methodlara ulaþmak için this kullanmayýn.
		//Çünkü child ve parent'daki ayný isimli variable ve methodlarda problem yaþayabilirisniz.
		//Genel kullanýmda this Class içindekiler için, super Parent Class'larýn içindekileri için kullanýlýr.
		
		System.out.println(this.age);//4 ==> this inheritance'den(extends) dolayý Animal Class'takini(Parent) de buldu ve yazdý.
		System.out.println(this.name);//"Karabas==>Kedi oldu" ==> this "     "    "    "    "   "
		this.move();//"Hayvanlar hareket eder" ==> Parent Class'tan geldi.
		System.out.println(this.name);//Kedi
		
		//Parantezsiz super Parent'lardaki variable ve methodlara ulaþmamýzý saðlar.
		//Parent'dakilere super kullanarak ulaþmak daha güvenlidir.
		//super içinde bulunduðu Class'taki variable ve methodlara ulaþamaz.
		System.out.println(super.age);//4 ==>Parent Class'tan geldi(Animal)
		System.out.println(super.name);//"Karabas" ==>Parent Class'tan geldi(Animal)
		super.move();//"Hayvanlar hareket eder" ==>Parent Class'tan geldi(Animal)
		
	}

}
