package day38interviewhazirlik;

public class PostAndPreIncrement {

	public static void main(String[] args) {
		//Post increment
		int a = 12;
		a = a++;
		System.out.println(a);//12 //Burada atamadan sonra artýrdýðý için deðer deðiþmiyor.
		
		int b = 22;
		b++;
		System.out.println(b);//23
		
		//Pre increment
		int c = 32;
		c=++c;
		System.out.println(c);//33

	} 

}
