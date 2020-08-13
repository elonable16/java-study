package hello2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerEx extends JFrame {
	JLabel la = new JLabel("Hello");
	public MouseListenerEx() {
		setTitle("mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x,y);
			}
		});
		c.setLayout(null);
		la.setSize(50,50);
		la.setLocation(30,30);
		c.add(la);
		setSize(250,250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseListenerEx();
	}
}
