package assign;

import java.util.Scanner;

import exceptions.Dateexception;

public interface Assigninput {
	public void getUserInput(Scanner input);
	public String getSubject();
	public void setSubject(String subject);
	public void setContents(String contents);
	public void setDate(String date) throws Dateexception ;
	public void setPlace(String place);
	public void setMember(String member);
	public void printinfo();
	public void setassignsubject(Scanner input);
	public void setassigncontents( Scanner input);
	public void setassigndate(Scanner input);
	public void setassignplace( Scanner input);
	public void setassignmember( Scanner input);
}
