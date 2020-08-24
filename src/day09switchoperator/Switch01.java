package day09switchoperator;

public class Switch01 {

	public static void main(String[] args) {

		//A harfini bulunca "�lk Harf", B harfini bulunca "�kinci Harf,
		// C harfini bulunca "Ucuncu Harf, D harfini bulunca "Dorduncu Harf,
		//if else() ve switch() kullanarak yaz�n.
		//diger harfler icin "bilmiyorum" yazs�n.
		
		 char harf = 'B';
	        
	        //1. Yol ==> if else if
	        
	        /*if(harf=='A') {
	            System.out.println("Ilk harf");
	        }else if(harf=='B') {
	            System.out.println("Ikinci harf");
	        }else if(harf=='C') {
	            System.out.println("Ucuncu harf");
	        }else if(harf=='D'){
	            System.out.println("Dorduncu harf");
	        }else {
	            System.out.println("Bilmiyorum");
	        }*/
	        
	        //2. Yol ==> switch()
	        switch(harf) {
	            case 'A':
	                System.out.println("Ilk harf");
	                break;
	            case 'B':
	                System.out.println("Ikinci harf");
	                break;
	            case 'C':
	                System.out.println("Ucuncu harf");
	                break;
	            case 'D':
	                System.out.println("Dorduncu harf");
	                break;
	            default:
	                System.out.println("Bilmiyorum");
	        }
	        
	}

}
