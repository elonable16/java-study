package hello2;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


public class GraphicsDrawLineMouseEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawLineMouseEx() {
		setTitle("drawing Line by Mouse ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GraphicsDrawLineMouseEx();
		
	}
	class MyPanel extends JPanel{
		private Vector<java.awt.Point> vStart = new Vector<java.awt.Point>();
		private Vector<java.awt.Point> vEnd = new Vector<java.awt.Point>();
		
		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					java.awt.Point startp = e.getPoint();
					vStart.add(startp);
					}
				public void mouseReleased(MouseEvent e) {
					java.awt.Point endP = e.getPoint();
					vEnd.add(endP);
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponents(g);
			g.setColor(Color.BLUE);
			
			for(int i=0; i<vStart.size();i++) {
				java.awt.Point s = vStart.elementAt(i);
				java.awt.Point e = vEnd.elementAt(i);
				g.drawLine((int)s.getX(),(int)s.getY(),(int)e.getX(),(int)e.getY());
			}
		}
	}
}
