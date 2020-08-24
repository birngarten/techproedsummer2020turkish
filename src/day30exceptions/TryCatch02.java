package day30exceptions;

public class TryCatch02 {
	static String m;
	public static void main(String[] args) {
		
		
		String s = "";
		System.out.println(s.length());//0
		try {
			s+="t";//t gelir
		}catch(Exception e) {
			s+="c";//code'da hata olmadýðýndan Exception kýsmý çalýþmayacak ve c kalýr, alýnmaz
		}finally {
			s+="f";//tf olur
		}
		s+="a";//tfa
		System.out.println(s);//tfa
		
		//String'e null atandýðý zaman veya instance variable'a deðer atamasý yapýlmadýðýnda 
		//length() methodu çalýþmaz ve NullPointerException alýnýr.
		
//		String n = null;
		 //Asagidaki iki satirdaki kod da exception verir
        //System.out.println(n.length());
        //System.out.println(m.length());   
	}

}
