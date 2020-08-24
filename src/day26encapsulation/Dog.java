package day26encapsulation;

public class Dog extends Mammal{

	public boolean sadik = true;
	public static void main(String[] args) {
		////Method ve variable'lar static uretilmedigi icin obje olusturmaliyiz
		Dog dog = new Dog();// dog bir obje'dir.
		System.out.println("Animal Class'tan geldi: "+dog.age);//Dog Class'ta olmamasýna raðmen Gparent'tan aldý
		System.out.println("Animal Class'tan geldi: "+dog.name);//" " " " " "
		dog.eat(); //"yemek yer" ==> Animal Class'tan geldi.NOT: methot'lar direk yazdýrýr
		dog.move();//"hareket edebiliyor"==>Animal Class'tan geldi.  NOT: methot'lar direk yazdýrýr
		
		System.out.println("Mammal Class'tan geldi: "+ dog.dogum);//Mammal Class'tan geldi: true
		dog.feed();//"Cocuklarýný besler" ==> NOT: methot'lar direk yazdýrýr
		
		System.out.println("Dog Class'tan geldi: "+ dog.sadik);//true ==> Dog Class'tan geldi.
		dog.bark();//"Kopek havlar" ==>Dog Class'tan geldi. NOT: methot'lar direk yazdýrýr
	}
	public void bark() {
		System.out.println("Kopek havlar");
	}

}
