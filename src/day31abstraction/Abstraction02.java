package day31abstraction;

public class Abstraction02 extends Abstraction01{

	public static void main(String[] args) {
		Abstraction02 obj = new Abstraction02();
		obj.abstractMethod();//Abstract methodun override edilmi� hali
		obj.concreteMethod();//Ben cocrete'im

	}

	@Override
	public void abstractMethod() {
		System.out.println("Abstract methodun override edilmi� hali");
		
	}
	
	

}
