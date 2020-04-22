import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Assignmentmanager assignmentmanager = new Assignmentmanager(input);
		int num = -1 ;
		while ( num != 6) {
			System.out.println("***assignmentmanagementsystem***");
			System.out.println("1. Add assignment ");
			System.out.println("2. Delete assignment ");
			System.out.println("3. Edit assignment ");
			System.out.println("4. view assignment ");
			System.out.println("5. view last semester assignment ");
			System.out.println("6. exit ");
			System.out.println("Select one number between 1 -6 : ");
			num = input.nextInt();
			if(num == 1) {
				assignmentmanager.addassignment();
			}
			if(num == 2) {
				assignmentmanager.deleteassignment();
			}
			if(num == 3) {
				assignmentmanager.editassignment();
			}
			if(num == 4) {
				assignmentmanager.viewassignments();
			}
			if(num == 5) {
				assignmentmanager.viewlastassignments();
			}
			
			else {
				continue;
			}
		}

	}

}
