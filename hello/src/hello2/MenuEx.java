package hello2;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class MenuEx extends JFrame{
	public MenuEx() {
		setTitle("Menu ¸¸µé±â");
		createMenu();
		setSize(250,200);
		setVisible(true);
		
	}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("Reshow"));
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("Exit"));
		
		mb.add(screenMenu);
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		
		setJMenuBar(mb);
		
	}
	public static void main(String[] args) {
		new MenuEx();
	}

}
