package day30exceptions;

public class TryCatch02 {
	static String m;
	public static void main(String[] args) {
		
		
		String s = "";
		System.out.println(s.length());//0
		try {
			s+="t";//t gelir
		}catch(Exception e) {
			s+="c";//code'da hata olmad���ndan Exception k�sm� �al��mayacak ve c kal�r, al�nmaz
		}finally {
			s+="f";//tf olur
		}
		s+="a";//tfa
		System.out.println(s);//tfa
		
		//String'e null atand��� zaman veya instance variable'a de�er atamas� yap�lmad���nda 
		//length() methodu �al��maz ve NullPointerException al�n�r.
		
//		String n = null;
		 //Asagidaki iki satirdaki kod da exception verir
        //System.out.println(n.length());
        //System.out.println(m.length());   
	}

}
