package assign;

import java.util.Scanner;

public class Groupproject extends Assign {

	
	public Groupproject(Kind kind) {
		super(kind);
	}

	
	
	public void getUserInput(Scanner input) {
		setassignsubject(input);
		
		setassignmember(input);
		
		setassigncontents(input);
		
		setassigndate(input);
		
	}
	public void printinfo() {
		String skind = getkind();
		System.out.println( "�������� : "+skind+"   ���� : "+ subject +"   ���� ���� : "+ member+"   �������� : "+ contents +"    ���⳯¥ : "+ date);
	}

}
