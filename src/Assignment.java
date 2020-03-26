import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 6 ;
		
		
		while ( num != 7) {


			System.out.println("***assignmentmanagementsystem***");
			System.out.println("1. Add assignment ");
			System.out.println("2. Delete assignment ");
			System.out.println("3. Edit assignment ");
			System.out.println("4. view assignment ");
			System.out.println("5. view last semester assignment ");
			System.out.println("6. show a menu ");
			System.out.println("7. exit ");
			System.out.println("Select one number between 1 -7 : ");
			num = input.nextInt();
			if(num == 1) {
				addassignment();
			}
			if(num == 2) {
				deleteassignment();
			}
			if(num == 3) {
				editassignment();
			}
			if(num == 4) {
				viewassignment();
			}
			if(num == 5) {
				viewlastassignment();
			}
		}

	}
	public static void addassignment() {
		Scanner input = new Scanner(System.in);
		System.out.println("과목 : :");
		String subject = input.nextLine();
		System.out.println("과제 내용 :");
		String assign = input.nextLine();
		System.out.println("제출 날짜 :");
		String deadline = input.nextLine();


	}
	public static void deleteassignment() {
		Scanner input = new Scanner(System.in);
		System.out.println("과목 : :");
		String subject = input.nextLine();
		
	}
	public static void editassignment() {
		Scanner input = new Scanner(System.in);
		System.out.println("과목 : :");
		String subject = input.nextLine();
		
	}
	public static void viewassignment() {
		Scanner input = new Scanner(System.in);
		System.out.println("과목 : :");
		String subject = input.nextLine();
	
	}
	public static void viewlastassignment() {
		Scanner input = new Scanner(System.in);
		System.out.println("과목 : :");
		String lastsubject = input.nextLine();
		
	}
}
