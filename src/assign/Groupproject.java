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
		System.out.println( "과제유형 : "+skind+"   과목 : "+ subject +"   팀원 구성 : "+ member+"   과제내용 : "+ contents +"    제출날짜 : "+ date);
	}

}
