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
		model.addColumn("과목");
		model.addColumn("내용");
		model.addColumn("날짜");
		model.addColumn("장소");
		model.addColumn("조원");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		
	}

}
