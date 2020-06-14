package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.Assignmentview;
import gui.WindowFrame;

public class ButtonviewListener implements ActionListener {
	WindowFrame frame;

	public ButtonviewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		Assignmentview view =frame.getAssignmentview();
		frame.setupPanel(view);
	}
}
