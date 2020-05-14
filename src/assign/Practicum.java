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
		System.out.println( "과제유형 : "+skind+"   과목 : "+ subject +"   실습 장소 : "+ place+"   과제내용 : "+ contents +"   제출날짜 : "+date);
	}

}
