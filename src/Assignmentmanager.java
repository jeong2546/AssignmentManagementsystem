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
			int num = -1 ;
			while ( num != 4) {
				System.out.println("**assignment edit menu**");
				System.out.println("1. edit subject ");
				System.out.println("2. edit contents ");
				System.out.println("3. edit date ");
				System.out.println("4. exit ");
				System.out.println("Select one number between 1 -4 : ");
				num = input.nextInt();
				if(num == 1) {
					System.out.println("과목 : ");
					assign.subject = input.next();
				}
				if(num == 2) {
					System.out.println("과제 내용 :");
					assign.contents = input.next();
				}
				if(num == 3) {
					System.out.println("제출 날짜 :");
					assign.date = input.next();
				}
					
				else {
					continue;
				}
			}
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
