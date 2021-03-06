package school_projects;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Students {
	
	private static int id  = 1000;
	private String studentId;
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses = "";
	private static int costOfCourse = 600; 
	private int tuitionBalance;
	
	//Unique student id olusturuyor
	public void setStudentId() {
		id++; // id'yi artirmak icin boyle yaptik
		this.studentId = gradeYear + "" + id;
	}
	
	public Students() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter student's first name");
		this.firstName = scan.nextLine();
		System.out.println("Enter student's last name");
		this.lastName = scan.nextLine();
		System.out.println("Enter student's class level");
		System.out.println("1 - Freshmen");
		System.out.println("2 - Sophmore");
		System.out.println("3 - Junior");
		System.out.println("4 - Senior");
		this.gradeYear = scan.nextInt();
		setStudentId();
	}
	
	public void enroll() {		
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter course to enroll (Q to quit)");
			String course = scan.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n" +  course;
				tuitionBalance = tuitionBalance + costOfCourse; 
			}else {
				break;
			}
				
		}while(true);		
		System.out.println("Enrolled in: " + courses);	
	}
	
	public void payTuition() {
		System.out.println("Your balance: $" + tuitionBalance);
		Scanner scan = new Scanner(System.in);
		System.out.println("How much do you want to pay?");
		int payment = scan.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thanks for payment of $" + payment);
		System.out.println("Your balance: $" + tuitionBalance);
	}
	
	public String toString() {
		return  "STUDENT ID: " + studentId +
				"\nSTUDENT NAME: " + firstName + " " + lastName +
				"\nGRADE LEVEL: " + gradeYear +
				"\nCOURSES ENROLLED: " + courses +
				"\nREMAINING BALANCE:" + tuitionBalance;
	}
	
	static Map<String, String> studentInfo = new HashMap<>();
	
	public static void addStudentsToMap() {
		Scanner scan = new Scanner(System.in);
		String stop = "";
		while(!stop.equals("S")) {
			Students s = new Students();
			s.enroll();
			s.payTuition();
			studentInfo.put(s.studentId, s.toString());
			System.out.println("Press 'S' to stop entrance");
			System.out.println("Press Enter to go on entrance");
			stop = scan.nextLine();
		}
		selectOptions();
	}
	
	public static void getStudentsInfo() {
		Scanner scan = new Scanner(System.in);
		String idOfStudent = "";
		String result = "";
		
		do {
			System.out.println("Enter student id to get information");
			System.out.println("Enter 'X' to end the program");
			idOfStudent = scan.nextLine();
			result = studentInfo.get(idOfStudent);
			
			if(!idOfStudent.equals("X")) {
				System.out.println(result);
			}
		}while(!idOfStudent.equals("X"));
		
		selectOptions();
	}
	
	public static void removeStudent() {
		Scanner scan = new Scanner(System.in);
		String idOfStudent = "";
		String result = "";
		
		do {
			System.out.println("Enter student id to remove");
			System.out.println("Press 'X' to end the program");
			
			idOfStudent = scan.nextLine();
			result = studentInfo.remove(idOfStudent);//remove() with key returns the value in a map
			
			if(!idOfStudent.equals("X")) {
				System.out.println(result);
				System.out.println("Removed from the students list");
			}	
		}while(!idOfStudent.equals("X"));
		selectOptions();
	}
	
	public static void selectOptions() {
		System.out.println("Select the options:");
		System.out.println("1: Add students");
		System.out.println("2: Get the student's information by id");
		System.out.println("3: Remove student  by id");
		
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		
		switch(option) {
			case 1:
				addStudentsToMap();
				break;
			case 2:
				getStudentsInfo();
				break;
			case 3:
				removeStudent();
				break;
			default:
				System.out.println("Invalid selection, select one of 1, 2, or 3");
		}
		selectOptions();
	}
}