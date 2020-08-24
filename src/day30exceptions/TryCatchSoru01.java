package day30exceptions;

public class TryCatchSoru01 {

	public static void main(String[] args) {
		
		// sonucu ne?
		try {
			hop();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void hop() {
		throw new RuntimeException("cannot hop");// cannot hop
	}
}
