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
		if (!date.contains("��") && !date.contains("��")) {
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
		System.out.println("���� : ");
		String subject1 = input.next();
		this.setSubject(subject1);
	}
	public void setassigncontents( Scanner input) {
		System.out.println("���� ���� :");
		String contents = input.next();
		this.setContents(contents);
	}
	public void setassigndate( Scanner input) {
		String date = "";
		while (!date.contains("��") && !date.contains("��")) {
			System.out.println("���� ��¥ :");
			date = input.next();
			try {
				this.setDate(date);
			} catch (Dateexception e) {
				System.out.println("��Ȯ�� ��¥�� �ƴմϴ�. ���� '��','��'�� �����Ͽ� �Է��ϼ���");
			}
		}
	}
	public void setassignplace(Scanner input) {
		System.out.println("�ǽ� ���:");
		String place = input.next();
		this.setPlace(place);
	}
	public void setassignmember( Scanner input) {
		System.out.println("���� ����:");
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
