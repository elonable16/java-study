package hello2;
import javax.swing.*;
import java.awt.*;

public class TabbedPaneEx extends	JFrame {

	public TabbedPaneEx() {
		setTitle("���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JTabbedPane pane = createTabbedPane();
		c.add(pane, BorderLayout.CENTER);
		setSize(250,250);
		setVisible(true);
		
		
	}
	private JTabbedPane createTabbedPane() {
		JTabbedPane pane = new JTabbedPane();
		pane.addTab("tab1", new JLabel(new ImageIcon("images/ryan1.png")));
		pane.addTab("tab2", new JLabel(new ImageIcon("images/ryan2.png")));
		pane.addTab("tab3",new MyPanel());
		return pane;
	}
	class MyPanel extends JPanel{
		public MyPanel() {
			this.setBackground(Color.YELLOW);
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.BLUE);
			g.fillOval(50, 70, 50, 50);
			g.setColor(Color.BLACK);
			g.drawString("tab 3�� ���� JPanel �Դϴ�", 30,50);
		}
	}
	public static void main(String[] args) {
		new TabbedPaneEx();
	}
}
