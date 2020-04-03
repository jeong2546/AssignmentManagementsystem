import java.util.Scanner;

public class Assignmentmanager {
	Assign assign;
	Scanner input;
	
	Assignmentmanager(Scanner input) {
		this.input = input;
	}
	
	public  void addassignment() {
		assign = new Assign();
		System.out.println("과목 : ");
		assign.subject = input.next();
		System.out.println("과제 내용 :");
		assign.contents = input.next();
		System.out.println("제출 날짜 :");
		assign.date = input.next();


	}
	public  void deleteassignment() {
		System.out.println("과목 : ");
		String subject = input.next();
		if (assign == null) {
			System.out.println("assignment has not been registered");

			return;
		}
		if (assign.subject.equals(subject)) {
			assign = null;
			System.out.println("assignment is deleted");
		}
	}
	public  void editassignment() {
		System.out.println("과목 : ");
		String subject = input.next();
		if (assign.subject.equals(subject)) {
			System.out.println("assignment to be edited is"+subject);
		}
		
	}
	public  void viewassignment() {
		System.out.println("과목 : ");
		String subject = input.next();
		if (assign.subject.equals(subject)) {
			assign.printinfo();
		}
	
	}
	public  void viewlastassignment() {
		System.out.println("과목 : ");
		String lastsubject = input.next();
		if (assign.subject.equals(lastsubject)) {
			assign.printinfo();
		}
	
	}
	
	
	
}
