package day05operators;

public class OdevDay05 {

	public static void main(String[] args) {
		
		/*int numA = 2;
		int numB = 3;
		String str1 = ��ok�
		String str2 = ��al���
		A�a��daki ��kt�lar� ekrana yazd�rmak icin program yaz�n�z.
		
		A) �ok �al�� B) 5 �ok C) �al��23 D) �ok1
		Not: bosluklara dikkat ediniz */
		
		String str1 = "�ok";
		String str2 = "�al��";
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
	
	
	/* �dev
	Asagidaki variable�lari kullanarak ekrana �61 Study-1�
	yazd�ran bir program yaz�n�z.
	Not: Sadece variable isimlerini kullan�n�z.*/
	
	String strA = "Study";
	String strB = "Hard";
	int numAa = 2;
	int numBb = 3;

	
	System.out.println(numAa*numBb+""+(numBb-numAa)+" "+ strA+"-"+(numBb-numAa));
	
	
	//Ersin Bilici :"Arkadaslar console'a "5-1Hard Study263"  yazdirmaya ne dersiniz"
	
	System.out.println((numAa*numBb-(numBb-numAa))+"-"+(numBb-numAa)+strB+ " "+ strA+numAa+(numAa*numBb)+numBb);
	
	
	}

}
