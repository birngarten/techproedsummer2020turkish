package day05operators;

public class Concatenation01 {

	public static void main(String[] args) {
		
	System.out.println("Ali" + "Can");	//AliCan
	
	System.out.println("Ali " + "Can"); //Ali Can
	System.out.println("Ali" + " Can"); //Ali Can
	System.out.println("Ali" + "" + "Can"); //Ali Can
	
	
	System.out.println(3 + "4"); //34  En az birisi String ise, toplama degil Concatenation olur.
								// Concatenation isleminin sonucu String tipindedir.
	
	System.out.println("3" + 4 + 5); //345 Java soldan saða calýsýyor. String ile basladýgý icin 345.
	System.out.println("3" + (4+5)); //39
	System.out.println(3+4+"5"); //75
	System.out.println(3+4+"5"+6); //756
	
	

	}

}
