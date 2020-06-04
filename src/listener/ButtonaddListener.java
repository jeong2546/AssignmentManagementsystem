package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.Assignmentadd;
import gui.Assignmentview;
import gui.WindowFrame;

public class ButtonaddListener implements ActionListener {
	WindowFrame frame;

	public ButtonaddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		Assignmentadd add =frame.getAssignmentadd();
		frame.setupPanel(add);
	}

}
