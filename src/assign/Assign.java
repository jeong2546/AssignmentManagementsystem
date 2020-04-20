package assign;

import java.util.Scanner;

public class Assign {
	protected Kind kind = Kind.Major;
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



	
	
	public Assign() {
	}
	
	public Assign(String subject) {
		this.subject = subject;

	}
	
	public Assign(String subject, String contents, String date) {
		this.subject = subject;
		this.contents = contents;
		this.date = date;
		
	}
	
	
	
	public void printinfo() {
		System.out.println("���� : "+ subject +"   �������� : "+ contents +"     ���⳯¥ : "+date);
	}
	public void getUserInput(Scanner input) {
		System.out.println("���� : ");
		String subject = input.next();
		this.setSubject(subject);
		
		System.out.println("���� ���� :");
		String contents = input.next();
		this.setContents(contents);
		
		System.out.println("���� ��¥ :");
		String date = input.next();
		this.setDate(date);
	}
}
