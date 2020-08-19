package hello2;
import javax.swing.*;
import java.awt.*;

class FlickeringLabel extends JLabel implements Runnable {
	private long delay;
	public FlickeringLabel(String text, long delay) {
		super(text);
		this.delay = delay;
		setOpaque(true);
		
		Thread th = new Thread(this);
		th.start();
	}
	public void run() {
		int n=0;
		while(true) {
			if(n==0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if(n==0) n= 1;
			else n = 0;
			try {
				Thread.sleep(delay);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}
public class FlickeringLabelEx extends JFrame{
	public FlickeringLabelEx() {
		setTitle("FlickeringLabel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel fLable = new FlickeringLabel("����",500);
		JLabel label = new JLabel("�ȱ���");
		FlickeringLabel fLable2 = new FlickeringLabel("����",300);
		
		c.add(fLable);
		c.add(label);
		c.add(fLable2);
		setSize(300,150);
		setVisible(true);	
	}
	public static void main(String[] args) {
		new  FlickeringLabelEx();
	}
}
