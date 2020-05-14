import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Assignmentmanager assignmentmanager = new Assignmentmanager(input);
		
		selectmenu(input,assignmentmanager);
	}
	public static void selectmenu(Scanner input,Assignmentmanager assignmentmanager) {
		int num = -1 ;
		while ( num != 5) {
			try {
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
			catch(InputMismatchException e) {
				System.out.println("1에서 5까지 수중 하나를 넣어주세요.");
				if (input.hasNext() ) {
					input.next();
				}
				num = -1;
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
