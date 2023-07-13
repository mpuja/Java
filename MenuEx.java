package com.java;
import javax.swing.*;
import java.awt.*;
public class MenuEx extends JFrame{

	JMenuBar me;
		JMenu menu, submenu;
		JMenuItem i1, i2, i3, i4, i5;
		
		MenuEx()
		{
		me = new JMenuBar();
		menu = new JMenu("Menu");
		submenu = new JMenu("Sub Menu");
		i1 =new JMenuItem("Item 1"); 
		i2 =new JMenuItem("Item 2");
		i3 =new JMenuItem("Item 3");
		i4 =new JMenuItem("Item 4");
		i5 =new JMenuItem("Item 5");
		
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		submenu.add(i4);
		submenu.add(i5);
		
		menu.add(submenu);
		me.add(menu);
		
		setJMenuBar(me);
		setLayout(null);
		setVisible(true);
		setSize(400,400);
		
		}
	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			new MenuEx();
		}

}
