package hello2;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class GraphicColorFontEx extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public GraphicColorFontEx() {
		setTitle("color, Font");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(350,470);
		setVisible(true);
		
	}
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawString("I love Java.",30,30);
			g.setColor(new Color(255,0,0));
			g.drawString("how much?", 30,60);
			g.setColor(new Color(0x00ff00ff));
			for(int i =1; i<=5; i++) {
				g.setFont(new Font("Jokerman",Font.ITALIC, i*10));
				g.drawString("this much!!", 30, 60+i*60);
			}
		}
	}
	public static void main(String[] args) {
		new GraphicColorFontEx();
	}
}
