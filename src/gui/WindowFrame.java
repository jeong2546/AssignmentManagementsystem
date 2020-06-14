package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.Assignmentmanager;

public class WindowFrame extends JFrame{
	
	Assignmentmanager assignmentmanager;
	MenuSelection menuselection ;
	Assignmentadd assignmentadd ;
	Assignmentview assignmentview ;
	
	
	public WindowFrame(Assignmentmanager assignmentmanager) {
		
		this.assignmentmanager = assignmentmanager;
		
		this.setSize(600,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menuselection = new MenuSelection(this);
		assignmentadd = new Assignmentadd(this);
		assignmentview = new Assignmentview(this,this.assignmentmanager);
		this.add(menuselection);
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
