


import java.util.ArrayList;
import java.util.Scanner;

import assign.Assign;
import assign.Groupproject;
import assign.Kind;
import assign.Practicum;

public class Assignmentmanager {
	ArrayList<Assign> assigns=new ArrayList<Assign>();
	Scanner input;
	
	Assignmentmanager(Scanner input) {
		this.input = input;
	}
	
	public  void addassignment() {
		int kind = 0;
		Assign assign ;
		while(kind != 1&& kind != 2&& kind != 3) {
			
			
		
			System.out.println("1 report ");
			System.out.println("2 practicum ");
			System.out.println("3 groupproject ");
			System.out.println("과제의 종류를 선택하세요. ");
			kind = input.nextInt();
			if (kind == 1) {
				assign = new Assign(Kind.report);
				assign.getUserInput(input);
				assigns.add(assign);
				break ;
			} 
			else if (kind == 2) {
				assign = new Practicum(Kind.practicum);
				assign.getUserInput(input);
				assigns.add(assign);
				break ;
			}
			else if (kind == 3) {
				assign = new Groupproject(Kind.groupproject);
				assign.getUserInput(input);
				assigns.add(assign);
				break ;
			}
			else {
				System.out.println("다시 선택하세요 ");
			}
		}
	}
	
	public  void deleteassignment() {
		System.out.println("과목 : ");
		String subject = input.next();
		int index =-1;
		for (int i=0; i<assigns.size();i++) {
			if (assigns.get(i).getSubject().equals(subject)) {
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
			if (assign.getSubject().equals(subject)) {
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
						String subject1 = input.next();
						assign.setSubject(subject1);
					}
					if (num == 2) {
						System.out.println("과제 내용 :");
						String contents = input.next();
						assign.setContents(contents);
					}
					if (num == 3) {
						System.out.println("제출 날짜 :");
						String date = input.next();
						assign.setDate(date);
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
		System.out.println("registered assignment:"+ assigns.size());
		for (int i=0; i<assigns.size();i++) {
			assigns.get(i).printinfo();
		}
	}
	public  void viewlastassignments() {
//		System.out.println("과목 : ");
//		String lastsubject1 = input.next();
		for (int i=0; i<assigns.size();i++) {
			assigns.get(i).printinfo();
		}
	}
	
	
	
}
