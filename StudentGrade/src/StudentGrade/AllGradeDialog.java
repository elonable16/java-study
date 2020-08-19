package StudentGrade;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.*;
import java.util.Vector;
import java.awt.*;


/////////////////////////////// ���̾� �α��� ȭ�� ����/////////////////////////////////////////////
public class AllGradeDialog extends JDialog {
	private Vector<StudentInfo> allGrade;
	private StudentInfo student;
	private String rowData[][]; 
	private DefaultTableModel model;
	private String addData[]; //�� �߰� �� ���
	public AllGradeDialog(JFrame Frame, Vector<StudentInfo> v, String[] columnNames) {
		super(Frame,"��ü �л����� ���� ");
		setdata(v,columnNames);
		setSize(600,500);
		setLayout(new FlowLayout());
		model = new DefaultTableModel(rowData,columnNames);
		JScrollPane scroll = new JScrollPane(new JTable(model));
		scroll.setPreferredSize(new Dimension(600, 200));
		add(scroll);
	}
	
/////////////////////////////JTable�� �ʿ��� ������ �����ٰ� �� ���� ���� ///////////////////////////////
	
	public void setdata(Vector<StudentInfo> v,String[] columnNames) {
		this.allGrade = v;
		rowData = new String[allGrade.size()][columnNames.length];
		for(int i = 0 ; i < v.size();i++) {
			student = allGrade.get(i);
			for(int j = 0; j < columnNames.length; j++) {
				rowData[i][j] = student.getelement(j);
			}
		}
	}
	public void dataUpdate(String[] addData) {
		this.addData = addData;
		model.addRow(addData);
	}
}
