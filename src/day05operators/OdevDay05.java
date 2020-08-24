package day05operators;

public class OdevDay05 {

	public static void main(String[] args) {
		
		/*int numA = 2;
		int numB = 3;
		String str1 = “Çok”
		String str2 = “Çalýþ”
		Aþaðýdaki çýktýlarý ekrana yazdýrmak icin program yazýnýz.
		
		A) Çok Çalýþ B) 5 Çok C) Çalýþ23 D) Çok1
		Not: bosluklara dikkat ediniz */
		
		String str1 = "Çok";
		String str2 = "Çalýþ";
		int numA = 2;
		int numB = 3;
		
		//A
		
		String cA = str1 + " " + str2;
		System.out.println(cA);
		
		//B
		
	String cB = numA+numB  +" "+ str1;
	System.out.println(cB);

		//C
	String cC = str2 + numA+numB;
	System.out.println(cC);
	
	String cD = str1+ (numB-numA);
	System.out.println(cD);
	
	
	/* Ödev
	Asagidaki variable’lari kullanarak ekrana “61 Study-1”
	yazdýran bir program yazýnýz.
	Not: Sadece variable isimlerini kullanýnýz.*/
	
	String strA = "Study";
	String strB = "Hard";
	int numAa = 2;
	int numBb = 3;

	
	System.out.println(numAa*numBb+""+(numBb-numAa)+" "+ strA+"-"+(numBb-numAa));
	
	
	//Ersin Bilici :"Arkadaslar console'a "5-1Hard Study263"  yazdirmaya ne dersiniz"
	
	System.out.println((numAa*numBb-(numBb-numAa))+"-"+(numBb-numAa)+strB+ " "+ strA+numAa+(numAa*numBb)+numBb);
	
	
	}

}
