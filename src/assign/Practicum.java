package assign;

import java.util.Scanner;

public class Practicum extends Assign {
	
	
	public Practicum(Kind kind) {
		super(kind);
	}


	public void getUserInput(Scanner input) {
		setassignsubject(input);
		
		setassignplace(input);
		
		setassigncontents(input);
		
		setassigndate(input);
		
	}
	public void printinfo() {
		String skind = getkind();
		System.out.println( "�������� : "+skind+"   ���� : "+ subject +"   �ǽ� ��� : "+ place+"   �������� : "+ contents +"   ���⳯¥ : "+date);
	}

}
