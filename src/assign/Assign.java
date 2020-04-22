package assign;

import java.util.Scanner;

public class Assign {
	protected Kind kind = Kind.report;
	protected String subject;
	protected String contents;
	protected String date;
	
	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}


	public Assign(Kind kind) {
		this.kind = kind;
	}
	
	
	public Assign() {
	}
	
	public Assign(String subject) {
		this.subject = subject;

	}
	
	public Assign(Kind kind, String subject, String contents, String date) {
		this.kind = kind;
		this.subject = subject;
		this.contents = contents;
		this.date = date;
		
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
		System.out.println( "과제유형 : "+skind+"   과목 : "+ subject +"   과제내용 : "+ contents +"     제출날짜 : "+date);
	}
	public void getUserInput(Scanner input) {
		System.out.println("과목 : ");
		String subject = input.next();
		this.setSubject(subject);
		
		System.out.println("과제 내용 :");
		String contents = input.next();
		this.setContents(contents);
		
		System.out.println("제출 날짜 :");
		String date = input.next();
		this.setDate(date);
	}
}
