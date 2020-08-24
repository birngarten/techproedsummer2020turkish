package day16overloading;

public class Student {

	String name;
	int age;
	String phone;
	
	Student (){
		
	}
	
	Student(String name, int age, String phone){
		this.phone = phone;
		this.name = name;	
		
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println(s1.name);//null --> cunku instance variable'lar default degerde
		System.out.println(s1.name="Ali"+"\n"+"Ali'nin yasi : "+ (s1.age=23)+"\n");//Dgerleri kendimiz atadik
		
		Student s2 = new Student("John", 25, "029-998877");
		System.out.println(s2.name + "," + s2.age + "," + s2.phone);

	}

}
