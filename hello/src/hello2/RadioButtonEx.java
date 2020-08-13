package hello2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RadioButtonEx extends JFrame {
	public RadioButtonEx() {
		setTitle("���� ��ư �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
		
		ButtonGroup g = new ButtonGroup();
		
		JRadioButton apple = new JRadioButton("���");
		JRadioButton pear = new JRadioButton("��");
		JRadioButton cherry = new JRadioButton("ü��",cherryIcon);
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		cherry.setSize(50,50);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RadioButtonEx();
	}

}