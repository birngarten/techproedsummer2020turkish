package day30exceptions;

public class TryCatch03 {

	public static void main(String[] args) {

		System.out.println(exceptions()); // beforecatchfinallydone

	}

	@SuppressWarnings({ "finally", "null" })
	public static String exceptions() {
		String result = "";
		String v = null;

		try {
			try {
				result = result + "before";
				v.length();
				result = result + "after";
			} catch (NullPointerException e) {
				result = result + "catch";
				throw new RuntimeException();
			} finally {
				result = result + "finally";
				throw new Exception();
			}
		} catch (Exception e) {
			result = result + "done";
		}
		return result;
		
		//throw ile throws keyword'lar�n�n fark�;
		// 1) throw method body'si i�ine yaz�l�r, throws method parantezi ile {} aras�na yaz�l�r.
		// 2) throw'u method body'si i�inde exception almak istedi�imiz yerde kullanabilirz.
		//	  throws ise mecburen method isminden sonra bir kere kullan�labilir.
		// 3) 1 throw sadece 1 tane exception �retir, 1 throws ile birden fazla exception �retilebilir.
		//    yani "throws NullPointerException, ArithmeticException" m�mk�n
		// 4) throw syntax  ==> throw new NullPointerException;
		//	  throws syntax ==> throws NullPointerException
	}

}
