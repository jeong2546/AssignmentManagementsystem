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
		System.out.println( "과제유형 : "+skind+"   과목 : "+ subject +"   과제내용 : "+ contents +"    제출날짜 : "+date);
	}
	
	
}
