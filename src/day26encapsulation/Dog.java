package day26encapsulation;

public class Dog extends Mammal{

	public boolean sadik = true;
	public static void main(String[] args) {
		////Method ve variable'lar static uretilmedigi icin obje olusturmaliyiz
		Dog dog = new Dog();// dog bir obje'dir.
		System.out.println("Animal Class'tan geldi: "+dog.age);//Dog Class'ta olmamas�na ra�men Gparent'tan ald�
		System.out.println("Animal Class'tan geldi: "+dog.name);//" " " " " "
		dog.eat(); //"yemek yer" ==> Animal Class'tan geldi.NOT: methot'lar direk yazd�r�r
		dog.move();//"hareket edebiliyor"==>Animal Class'tan geldi.  NOT: methot'lar direk yazd�r�r
		
		System.out.println("Mammal Class'tan geldi: "+ dog.dogum);//Mammal Class'tan geldi: true
		dog.feed();//"Cocuklar�n� besler" ==> NOT: methot'lar direk yazd�r�r
		
		System.out.println("Dog Class'tan geldi: "+ dog.sadik);//true ==> Dog Class'tan geldi.
		dog.bark();//"Kopek havlar" ==>Dog Class'tan geldi. NOT: methot'lar direk yazd�r�r
	}
	public void bark() {
		System.out.println("Kopek havlar");
	}

}
