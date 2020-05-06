import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Assignmentmanager assignmentmanager = new Assignmentmanager(input);
		int num = -1 ;
		while ( num != 5) {
			showmenu();
			num = input.nextInt();
			switch(num) {
			case 1:
				assignmentmanager.addassignment();
				break;
			case 2:
				assignmentmanager.deleteassignment();
				break;
			case 3:
				assignmentmanager.editassignment();
				break;
			case 4:
				assignmentmanager.viewassignments();
				break;
			default:
				continue;
			}
		}
	}
	public static void showmenu() {
		System.out.println("***assignmentmanagementsystem***");
		System.out.println("1. Add assignment ");
		System.out.println("2. Delete assignment ");
		System.out.println("3. Edit assignment ");
		System.out.println("4. view assignment ");
		System.out.println("6. exit ");
		System.out.println("Select one number between 1 -5 : ");
	}

}
