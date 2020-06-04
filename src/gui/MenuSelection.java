package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listener.ButtonaddListener;
import listener.ButtonviewListener;

public class MenuSelection extends JPanel{
	
	WindowFrame frame;
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		this.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JLabel lb = new JLabel("Menu selection");
		
		JButton b1 = new JButton("add assignment");
		JButton b2 = new JButton("edit assignment");
		JButton b3 = new JButton("delete assignment");
		JButton b4 = new JButton("view assignment");
		JButton b5 = new JButton("exit program");
		
		b1.addActionListener(new ButtonaddListener(frame));
		b4.addActionListener(new ButtonviewListener(frame));
		
		p1.add(lb);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		
		
		this.add(p1, BorderLayout.NORTH);
		this.add(p2, BorderLayout.CENTER);
		
	}
}
