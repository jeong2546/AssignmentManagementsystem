
public class Assign {
	String subject;
	String contents;
	String date;
	
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
		System.out.println("���� :"+ subject +"�������� :"+ contents +"���⳯¥ :"+date);
	}
}
