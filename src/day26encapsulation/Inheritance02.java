package day26encapsulation;
	
public class Inheritance02 extends Inheritance01{ //extends ==>keyword'dur. Inheritance01==> Parent
				//Child				 //Parent
	//Inheritance01, Inheritance02'nin parenti.
	public static void main(String[] args) {
		// Soru: Child'in 1 den fazla PARENT'I OLUR mu?
		//cevap : Olmaz ==> java "multiple inheritance"i desteklemez.
		//				==>Java "Single inheritance"i destekler
		
		// Soru : Parent'in 1'den fazla Child'i olur mu?
		// Cevap : Olur. "Hiyerarsik Inheritance" denir.
		
		// Soru: child[a,b] ---> parent[c,d,e] ---> grandParent[f,g]
		// Child nelere sahip? [a,b,c,d,e,f,g]
		// Parent nelere sahip? [c,d,e,f,g]
		// grandParent nelere sahip? [f,g]
		// Iki Child arasýnda Inheritance olmaz!!!
		

	}

}
