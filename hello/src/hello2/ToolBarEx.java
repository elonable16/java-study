package hello2;
import javax.swing.*;
import java.awt.*;

public class ToolBarEx extends JFrame {
	private Container contentPane;
	
	public ToolBarEx() {
		setTitle("툴바 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setSize(400,200);
		setVisible(true);
	}
	
	private void createToolBar() {
		JToolBar toolBar = new JToolBar("ryan Menu");
		toolBar.setBackground(Color.LIGHT_GRAY);
		
		toolBar.add(new JButton("New"));
		toolBar.add(new JButton(new ImageIcon("images/ryan1.png")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("images/ryan2.png")));
		toolBar.add(new JLabel("searchL:"));
		toolBar.add(new JTextField("  "));
		
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("java");
		combo.addItem("c");
		combo.addItem("c++");
		combo.addItem("C#");
		toolBar.add(combo);
		
		contentPane.add(toolBar, BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		new ToolBarEx();
	}
}
