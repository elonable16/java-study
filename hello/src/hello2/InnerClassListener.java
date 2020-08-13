package hello2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InnerClassListener extends JFrame{
	
	public InnerClassListener() {
		setTitle("Action 이벤트 리스너");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
				
				setTitle(b.getText());
			}
		});
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new InnerClassListener();
	}
}
