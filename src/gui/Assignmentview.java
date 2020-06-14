package gui;

import java.util.Scanner;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import assign.Assigninput;
import manager.Assignmentmanager;


public class Assignmentview extends JPanel{
	WindowFrame frame;
	Scanner sc = new Scanner(System.in);
	Assignmentmanager assignmentmanager ;

	public Assignmentview(WindowFrame frame , Assignmentmanager assignmentmanager) {
		this.frame = frame;
		this.assignmentmanager = assignmentmanager;
		System.out.println("**"+ assignmentmanager.size()+"**");
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("과목");
		model.addColumn("내용");
		model.addColumn("날짜");
		model.addColumn("장소");
		model.addColumn("조원");
		
		for(int i = 0; i<assignmentmanager.size();i++) {
			Vector row = new Vector();
			Assigninput si = assignmentmanager.get(i);
			row.add(si.getSubject());
			row.add(si.getContents());
			row.add(si.getDate());
			row.add(si.getMember());
			row.add(si.getPlace());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		
	}

}
