package assign;

import java.util.Scanner;

public class Groupproject extends Assign {

	protected String member;
	
	public Groupproject(Kind kind) {
		super(kind);
	}

	public Groupproject(String member) {
		super();
		this.member = member;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	
	public void getUserInput(Scanner input) {
		System.out.println("과목 : ");
		String subject = input.next();
		this.setSubject(subject);
		
		System.out.println("팀원 구성 : ");
		String member = input.next();
		this.setMember(member);
		
		System.out.println("과제 내용 :");
		String contents = input.next();
		this.setContents(contents);
		
		System.out.println("제출 날짜 :");
		String date = input.next();
		this.setDate(date);
	}
	public void printinfo() {
		String skind = "none" ;
		switch(this.kind) {
		case report :
			skind = "report";
			break;
		case practicum:
			skind = "practicum";
			break;
		case groupproject:
			skind = "group";
			break;
		default:
			
		}
		System.out.println( "과제유형 : "+skind+"   과목 : "+ subject +"팀원 구성 : "+ member+"   과제내용 : "+ contents +"     제출날짜 : "+date);
	}

}
