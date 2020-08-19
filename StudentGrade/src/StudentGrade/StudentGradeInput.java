package StudentGrade;

import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;
import java.awt.*;

public class StudentGradeInput extends JFrame {
	
	private JLabel[] la = new JLabel[4];
	private JTextField [] tf = new JTextField[4];
	private JButton [] btn = new JButton[3];
	private String[] Labelnames = {"이름","수학점수","과학점수","국사점수","총합","평균"};
	private Vector<StudentInfo> student = new Vector<StudentInfo>();
	private AllGradeDialog dialog;
	private String regExp = "^[0-9]+$"; // 숫자 정규식
	private String [] addData;
	
	public StudentGradeInput() {
		setTitle("학생 성적 입력 창 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		// label을 콘테이너에 추가 및 위치 지정
		for(int i=0 ; i<la.length; i++) {
			la[i] = new JLabel(Labelnames[i] +":");
			la[i].setSize(100,20);
			la[i].setLocation(10, 10+i*20);
			c.add(la[i]);
		}

		// 입력 성적 출력창 생성
		dialog = new AllGradeDialog(this, student, Labelnames);
		
		
		// button 선언 및 콘테이너 추가
		btn[0] = new JButton("입력");
		btn[1] = new JButton("출력");
		btn[2] = new JButton("종료");
		
		for(int i=0 ; i<btn.length; i++) {
			c.add(btn[i]);
			btn[i].setSize(100,20);
			btn[i].setLocation(100 + i * 100, 100);
			btn[i].addKeyListener(new KeyAdapter() {	// 입력에서 엔터를 누를때 실행하는 이벤트 리스너 
				public void keyPressed(KeyEvent ke) {
					int keycode = ke.getKeyCode();
					if(keycode == 10) {
						JButton b = (JButton)ke.getSource();
						b.doClick();;
					}
				}
			});
			btn[i].addActionListener(new ActionListener() {
				// 버튼 이벤트 생성 
				@Override
				public void actionPerformed(ActionEvent e) {

					JButton btn = (JButton)e.getSource();
					switch(btn.getText()) {
						case "입력" :  // 입력을 누를 시 데이터 저장 및 초기화
							StudentInfo s;
							addData = new String [Labelnames.length];
							for(int i = 0; i < tf.length; i++) { // 성적 값 확인 (1~100사이의 숫자) 
								if (i>=1) { // grade 입력
									if(tf[i].getText().matches(regExp) && Integer.parseInt(tf[i].getText())>=0 && Integer.parseInt(tf[i].getText())<=100)
									{
										addData[i] = tf[i].getText();
									}
									else  // 값이 잘못 입력됐을 때 초기화, 오류생긴 영역에 글자 추가
									{
										for(int j=0; j< tf.length ; j++) {
											tf[j].setText("");
										}
										tf[0].requestFocus();
										tf[i].setText("성적은 0~100까지 숫자로 입력하세요");
										break;
									}
								}else // name 입력
								{
									addData[i] = tf[i].getText();
								}
							}
							if (tf[0].getText().equals("")) {
								break;
							}else {// 모든 자료가 정상적으로 입력되었을 때 
								// 데이터 벡터에 추가
								System.out.println(addData[1]);
								s = new StudentInfo(addData[0],Integer.parseInt(addData[1]),Integer.parseInt(addData[2]),Integer.parseInt(addData[3]));
								student.add(s); // vector에 내용 저장
								// 데이터 Jtable에 추가
								for(int i=0; i < Labelnames.length; i++) {
									addData[i] = s.getelement(i);
								}
								dialog.dataUpdate(addData);
								// 텍스트 필드 초기화 맟 포커스 지정
								for(int i=0; i< tf.length ; i++) {
									tf[i].setText("");
								}
								tf[0].requestFocus();
								break;
							}
						case "출력" : // 다이얼 로그 출력
							dialog.setVisible(true);
							break;
						case "종료" : // 종료 누를 시 시스템 종료 
							System.exit(0);
					}
				}
			});
		}
		// textField 이벤트 추가(포커스 이동)
		
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
