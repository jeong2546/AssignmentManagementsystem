package assign;

import java.util.Scanner;

public class Report extends Assign {
	public Report (Kind kind) {
		super(kind);
	}
	public void getUserInput(Scanner input) {
		setassignsubject(input);
		
		setassigncontents(input);
		
		setassigndate(input);
	}
	public void printinfo() {
		String skind = getkind();
		System.out.println( "�������� : "+skind+"   ���� : "+ subject +"   �������� : "+ contents +"    ���⳯¥ : "+date);
	}
	
	
}
