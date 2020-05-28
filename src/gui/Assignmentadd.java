package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Assignmentadd extends JFrame{
	public Assignmentadd() {
		JPanel p = new JPanel();
		p.setLayout(new SpringLayout());
		
		JLabel lb1 = new JLabel("과목: ",JLabel.TRAILING);
		JTextField fd1 = new JTextField(10);
		lb1.setLabelFor(fd1);
		p.add(lb1);
		p.add(fd1);
		
		JLabel lb2 = new JLabel("내용: ",JLabel.TRAILING);
		JTextField fd2 = new JTextField(10);
		lb2.setLabelFor(fd2);
		p.add(lb2);
		p.add(fd2);
		
		JLabel lb3 = new JLabel("날짜: ",JLabel.TRAILING);
		JTextField fd3 = new JTextField(10);
		lb3.setLabelFor(fd3);
		p.add(lb3);
		p.add(fd3);
		
		JLabel lb4 = new JLabel("장소: ",JLabel.TRAILING);
		JTextField fd4 = new JTextField(10);
		lb4.setLabelFor(fd4);
		p.add(lb4);
		p.add(fd4);
		
		JLabel lb5 = new JLabel("조원: ",JLabel.TRAILING);
		JTextField fd5 = new JTextField(10);
		lb5.setLabelFor(fd5);
		p.add(lb5);
		p.add(fd5);

		
		SpringUtilities.makeCompactGrid(p,5,2,6,6,6,6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(p);
		this.setVisible(true);
		
		
	}

}
