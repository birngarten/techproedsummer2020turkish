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
		
		//throw ile throws keyword'larýnýn farký;
		// 1) throw method body'si içine yazýlýr, throws method parantezi ile {} arasýna yazýlýr.
		// 2) throw'u method body'si içinde exception almak istediðimiz yerde kullanabilirz.
		//	  throws ise mecburen method isminden sonra bir kere kullanýlabilir.
		// 3) 1 throw sadece 1 tane exception üretir, 1 throws ile birden fazla exception üretilebilir.
		//    yani "throws NullPointerException, ArithmeticException" mümkün
		// 4) throw syntax  ==> throw new NullPointerException;
		//	  throws syntax ==> throws NullPointerException
	}

}
