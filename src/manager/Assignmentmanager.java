package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import assign.Assign;
import assign.Assigninput;
import assign.Groupproject;
import assign.Kind;
import assign.Practicum;
import assign.Report;
import log.EventLogger;

public class Assignmentmanager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9173065915114644181L;
	
	static EventLogger logger = new EventLogger("log.txt");
	ArrayList<Assigninput> assigns=new ArrayList<Assigninput>();
	transient Scanner input;
	
	public Assignmentmanager(Scanner input) {
		this.input = input;
	}
	
	public  void addassignment() {
		int kind = 0;
		Assigninput assigninput ;
		while(kind != 1&& kind != 2&& kind != 3) {
			try {
				System.out.println("1 report ");
				System.out.println("2 practicum ");
				System.out.println("3 groupproject ");
				System.out.println("과제의 종류를 선택하세요. ");
				kind = input.nextInt();
				if (kind == 1) {
					assigninput = new Report(Kind.report);
					assigninput.getUserInput(input);
					assigns.add(assigninput);
					logger.log("add a report type assignment");
					break;
				} else if (kind == 2) {
					assigninput = new Practicum(Kind.practicum);
					assigninput.getUserInput(input);
					assigns.add(assigninput);
					logger.log("add a practicum type assignment");
					break;
				} else if (kind == 3) {
					assigninput = new Groupproject(Kind.groupproject);
					assigninput.getUserInput(input);
					assigns.add(assigninput);
					logger.log("add a groupproject type assignment");
					break;
				} else {
					System.out.println("다시 선택하세요 ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("1에서 3까지 수중 하나를 넣어주세요.");
				if (input.hasNext() ) {
					input.next();
				}
				kind = 0;
			}
		}
	}
	
	public  void deleteassignment() {
		System.out.println("과목 : ");
		String subject = input.next();
		int index = findindex(subject);
		remove(index, subject);
	}
	public int findindex(String subject) {
		int index =-1;
		for (int i=0; i<assigns.size();i++) {
			if (assigns.get(i).getSubject().equals(subject)) {
				index = i;
				break ;
			}
		}
		return index;
	}
	
	public int remove(int index, String subject) {
		if(index>=0) {
			assigns.remove(index);
			System.out.println("assignment " +subject+" is deleted");
			return 1;
		}
		else {
			System.out.println("assignment has not been registered");

			return -1;
		}
	}
	public  void editassignment() {
		System.out.println("과목 : ");
		String subject = input.next();
		for (int i=0; i<assigns.size();i++) {
			Assigninput assign = assigns.get(i);
			if (assign.getSubject().equals(subject)) {
				int num = -1;
				while (num != 6) {
					try {
						showeditmenu();
						num = input.nextInt();
						switch (num) {
						case 1:
							assign.setassignsubject(input);
							logger.log("edit assignment's subject");
							break;
						case 2:
							assign.setassigncontents(input);
							logger.log("edit assignment's contents");
							break;
						case 3:
							assign.setassigndate(input);
							logger.log("edit assignment's date");
							break;
						case 4:
							assign.setassignplace(input);
							logger.log("edit assignment's place");
							break;
						case 5:
							assign.setassignmember(input);
							logger.log("edit assignment's member");
							break;
						default:
							continue;
						}
					} catch (InputMismatchException e) {
						System.out.println("1에서 6까지 수중 하나를 넣어주세요.");
						if (input.hasNext()) {
							input.next();
						}
						num = -1;
					}
				}
				break ;
			}
		}
		
	}
	public  void viewassignments() {
		System.out.println("registered assignment:"+ assigns.size());
		for (int i=0; i<assigns.size();i++) {
			assigns.get(i).printinfo();
		}
	}
	public void setScanner(Scanner input) {
		this.input = input;
	}
	
	public int size() {
		return assigns.size();
	}
	public Assigninput get(int index) {
		return (Assign) assigns.get(index);
	}
	
	public void showeditmenu() {
		System.out.println("**assignment edit menu**");
		System.out.println("1. edit subject ");
		System.out.println("2. edit contents ");
		System.out.println("3. edit date ");
		System.out.println("4. edit place ");
		System.out.println("5. edit member ");
		System.out.println("6. exit ");
		System.out.println("Select one number between 1 -6 : ");
	}
}
