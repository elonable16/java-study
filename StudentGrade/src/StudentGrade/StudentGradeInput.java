package StudentGrade;

import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;
import java.awt.*;

public class StudentGradeInput extends JFrame {
	
	private JLabel[] la = new JLabel[4];
	private JTextField [] tf = new JTextField[4];
	private JButton [] btn = new JButton[3];
	private String[] Labelnames = {"�̸�","��������","��������","��������","����","���"};
	private Vector<StudentInfo> student = new Vector<StudentInfo>();
	private AllGradeDialog dialog;
	private String regExp = "^[0-9]+$"; // ���� ���Խ�
	private String [] addData;
	
	public StudentGradeInput() {
		setTitle("�л� ���� �Է� â ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		// label�� �����̳ʿ� �߰� �� ��ġ ����
		for(int i=0 ; i<la.length; i++) {
			la[i] = new JLabel(Labelnames[i] +":");
			la[i].setSize(100,20);
			la[i].setLocation(10, 10+i*20);
			c.add(la[i]);
		}

		// �Է� ���� ���â ����
		dialog = new AllGradeDialog(this, student, Labelnames);
		
		
		// button ���� �� �����̳� �߰�
		btn[0] = new JButton("�Է�");
		btn[1] = new JButton("���");
		btn[2] = new JButton("����");
		
		for(int i=0 ; i<btn.length; i++) {
			c.add(btn[i]);
			btn[i].setSize(100,20);
			btn[i].setLocation(100 + i * 100, 100);
			btn[i].addKeyListener(new KeyAdapter() {	// �Է¿��� ���͸� ������ �����ϴ� �̺�Ʈ ������ 
				public void keyPressed(KeyEvent ke) {
					int keycode = ke.getKeyCode();
					if(keycode == 10) {
						JButton b = (JButton)ke.getSource();
						b.doClick();;
					}
				}
			});
			btn[i].addActionListener(new ActionListener() {
				// ��ư �̺�Ʈ ���� 
				@Override
				public void actionPerformed(ActionEvent e) {

					JButton btn = (JButton)e.getSource();
					switch(btn.getText()) {
						case "�Է�" :  // �Է��� ���� �� ������ ���� �� �ʱ�ȭ
							StudentInfo s;
							addData = new String [Labelnames.length];
							for(int i = 0; i < tf.length; i++) { // ���� �� Ȯ�� (1~100������ ����) 
								if (i>=1) { // grade �Է�
									if(tf[i].getText().matches(regExp) && Integer.parseInt(tf[i].getText())>=0 && Integer.parseInt(tf[i].getText())<=100)
									{
										addData[i] = tf[i].getText();
									}
									else  // ���� �߸� �Էµ��� �� �ʱ�ȭ, �������� ������ ���� �߰�
									{
										for(int j=0; j< tf.length ; j++) {
											tf[j].setText("");
										}
										tf[0].requestFocus();
										tf[i].setText("������ 0~100���� ���ڷ� �Է��ϼ���");
										break;
									}
								}else // name �Է�
								{
									addData[i] = tf[i].getText();
								}
							}
							if (tf[0].getText().equals("")) {
								break;
							}else {// ��� �ڷᰡ ���������� �ԷµǾ��� �� 
								// ������ ���Ϳ� �߰�
								System.out.println(addData[1]);
								s = new StudentInfo(addData[0],Integer.parseInt(addData[1]),Integer.parseInt(addData[2]),Integer.parseInt(addData[3]));
								student.add(s); // vector�� ���� ����
								// ������ Jtable�� �߰�
								for(int i=0; i < Labelnames.length; i++) {
									addData[i] = s.getelement(i);
								}
								dialog.dataUpdate(addData);
								// �ؽ�Ʈ �ʵ� �ʱ�ȭ �� ��Ŀ�� ����
								for(int i=0; i< tf.length ; i++) {
									tf[i].setText("");
								}
								tf[0].requestFocus();
								break;
							}
						case "���" : // ���̾� �α� ���
							dialog.setVisible(true);
							break;
						case "����" : // ���� ���� �� �ý��� ���� 
							System.exit(0);
					}
				}
			});
		}
		// textField �̺�Ʈ �߰�(��Ŀ�� �̵�)
		
		TextFocusEvent moveFocus = new TextFocusEvent();
		for(int i=0 ; i<tf.length; i++) {
			tf[i] = new JTextField();
			c.add(tf[i]);
			tf[i].setSize(300,20);
			tf[i].setLocation(100 , 10+i*20);
			tf[i].addActionListener(moveFocus);
		}

		
		setSize(500,180);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new StudentGradeInput();
	}

}
