package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{
	
	MenuSelection menuselection ;
	Assignmentadd assignmentadd ;
	Assignmentview assignmentview ;

	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.assignmentadd = new Assignmentadd(this);
		this.assignmentview = new Assignmentview(this);

		
		this.setSize(600,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setupPanel(menuselection);
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel p) {
		this.getContentPane().removeAll();
		this.getContentPane().add(p);
		this.revalidate();
		this.repaint();
		
	}
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public Assignmentadd getAssignmentadd() {
		return assignmentadd;
	}

	public void setAssignmentadd(Assignmentadd assignmentadd) {
		this.assignmentadd = assignmentadd;
	}

	public Assignmentview getAssignmentview() {
		return assignmentview;
	}

	public void setAssignmentview(Assignmentview assignmentview) {
		this.assignmentview = assignmentview;
	}

}
