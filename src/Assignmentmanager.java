import java.util.ArrayList;
import java.util.Scanner;

public class Assignmentmanager {
	ArrayList<Assign> assigns=new ArrayList<Assign>();
	Scanner input;
	
	Assignmentmanager(Scanner input) {
		this.input = input;
	}
	
	public  void addassignment() {
		Assign assign = new Assign();
		System.out.println("과목 : ");
		assign.subject = input.next();
		System.out.println("과제 내용 :");
		assign.contents = input.next();
		System.out.println("제출 날짜 :");
		assign.date = input.next();
		assigns.add(assign);

	}
	public  void deleteassignment() {
		System.out.println("과목 : ");
		String subject = input.next();
		int index =-1;
		for (int i=0; i<assigns.size();i++) {
			if (assigns.get(i).subject.equals(subject)) {
				index = i;
				break ;
			}
		}
		if(index>=0) {
			assigns.remove(index);
			System.out.println("assignment " +subject+" is deleted");
		}
		else {
			System.out.println("assignment has not been registered");

			return;
		}
		
	}
	public  void editassignment() {
		System.out.println("과목 : ");
		String subject = input.next();
		for (int i=0; i<assigns.size();i++) {
			Assign assign = assigns.get(i);
			if (assign.subject.equals(subject)) {
				int num = -1;
				while (num != 4) {
					System.out.println("**assignment edit menu**");
					System.out.println("1. edit subject ");
					System.out.println("2. edit contents ");
					System.out.println("3. edit date ");
					System.out.println("4. exit ");
					System.out.println("Select one number between 1 -4 : ");
					num = input.nextInt();
					if (num == 1) {
						System.out.println("과목 : ");
						assign.subject = input.next();
					}
					if (num == 2) {
						System.out.println("과제 내용 :");
						assign.contents = input.next();
					}
					if (num == 3) {
						System.out.println("제출 날짜 :");
						assign.date = input.next();
					}

					else {
						continue;
					}
				}
				break ;
			}
		}
		
	}
	public  void viewassignments() {
//		System.out.println("과목 : ");
//		String subject = input.next();
		for (int i=0; i<assigns.size();i++) {
			assigns.get(i).printinfo();
		}
	}
	public  void viewlastassignments() {
//		System.out.println("과목 : ");
//		String lastsubject = input.next();
		for (int i=0; i<assigns.size();i++) {
			assigns.get(i).printinfo();
		}
	}
	
	
	
}
