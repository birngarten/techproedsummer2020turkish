package day26encapsulation;

public class Cat extends Mammal{

	public boolean clean = true;
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println(cat.age);//0 ==>Animals Class'tan geldi.
		System.out.println(cat.name);//null ==> Animals Class'tan geldi.
		cat.move();//hareket edebiliyor ==>Animals Class'tan geldi.
		cat.eat();//yemek yer ==> Animals Class'tan geldi.
		
		System.out.println("Mammal Class'tan geldi: "+ cat.dogum);// true
		cat.feed();//"Cocuklarýný besler" ==>Mammal Class'tan geldi
		
		System.out.println(cat.clean);//true ==>Cat Calss'tan geldi.
		cat.meow();//Kediler miyavlar ==>Cat Calss'tan geldi.

	}
	
	public void meow() {
		System.out.println("Kediler miyavlar");
	}

}
