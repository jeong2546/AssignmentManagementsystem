package assign;

import java.io.Serializable;
import java.util.Scanner;

import exceptions.Dateexception;

public abstract class Assign implements Assigninput, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1356590539367836343L;
	
	protected Kind kind = Kind.report;
	protected String subject;
	protected String contents;
	protected String date;
	protected String place;
	protected String member;
	
	
	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

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

	public void setDate(String date) throws Dateexception {
		if (!date.contains("일") && !date.contains("월")) {
			throw new Dateexception();
		}
		this.date = date;
	}


	public Assign(Kind kind) {
		this.kind = kind;
	}
	
	
	public Assign() {
	}
	
	
	
	public Assign(Kind kind, String subject, String contents, String date) {
		this.kind = kind;
		this.subject = subject;
		this.contents = contents;
		this.date = date;
		
	}

	public abstract void printinfo();
	
	public void setassignsubject( Scanner input) {
		System.out.println("과목 : ");
		String subject1 = input.next();
		this.setSubject(subject1);
	}
	public void setassigncontents( Scanner input) {
		System.out.println("과제 내용 :");
		String contents = input.next();
		this.setContents(contents);
	}
	public void setassigndate( Scanner input) {
		String date = "";
		while (!date.contains("일") && !date.contains("월")) {
			System.out.println("제출 날짜 :");
			date = input.next();
			try {
				this.setDate(date);
			} catch (Dateexception e) {
				System.out.println("정확한 날짜가 아닙니다. 제출 '월','일'을 포함하여 입력하세요");
			}
		}
	}
	public void setassignplace(Scanner input) {
		System.out.println("실습 장소:");
		String place = input.next();
		this.setPlace(place);
	}
	public void setassignmember( Scanner input) {
		System.out.println("팀원 구성:");
		String member = input.next();
		this.setMember(member);
	}
	public String getkind() {
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
		return skind;
	}
}
