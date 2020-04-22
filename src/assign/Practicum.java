package assign;

import java.util.Scanner;

public class Practicum extends Assign {
	
	protected String place;
	
	public Practicum(Kind kind) {
		super(kind);
	}

	
	public Practicum(String place) {
		super();
		this.place = place;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public void getUserInput(Scanner input) {
		System.out.println("���� : ");
		String subject = input.next();
		this.setSubject(subject);
		
		System.out.println("��� : ");
		String place = input.next();
		this.setPlace(place);
		
		System.out.println("�ǽ� ���� :");
		String contents = input.next();
		this.setContents(contents);
		
		System.out.println("�ǽ� ��¥ :");
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
		System.out.println( "�������� : "+skind+"   ���� : "+ subject +"�ǽ� ��� : "+place+"   �������� : "+ contents +"     ���⳯¥ : "+date);
	}

}
