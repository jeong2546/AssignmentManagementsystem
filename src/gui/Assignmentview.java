package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Assignmentview extends JPanel{
	WindowFrame frame;

	public Assignmentview(WindowFrame frame) {
		this.frame = frame;
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("����");
		model.addColumn("����");
		model.addColumn("��¥");
		model.addColumn("���");
		model.addColumn("����");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		
	}

}
