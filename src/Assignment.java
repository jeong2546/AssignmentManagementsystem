import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class Assignment {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Assignmentmanager assignmentmanager = getobject("assignmentmanager.ser");
		if(assignmentmanager == null) {
			assignmentmanager = new Assignmentmanager(input);
		}
		else {
			assignmentmanager.setScanner(input);
		}
		selectmenu(input,assignmentmanager);
		putobject(assignmentmanager,"assignmentmanager.ser");
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
					logger.log("delete an assignment");
					break;
				case 3:
					assignmentmanager.editassignment();
					break;
				case 4:
					assignmentmanager.viewassignments();
					logger.log("view an assignment");
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
		System.out.println("5. exit ");
		System.out.println("Select one number between 1 -5 : ");
	}
	public static Assignmentmanager getobject(String filename) {
		Assignmentmanager assignmentmanager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			assignmentmanager = (Assignmentmanager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return assignmentmanager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return assignmentmanager;
		
	}
	
	public static void putobject(Assignmentmanager assignmentmanager,String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(assignmentmanager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

