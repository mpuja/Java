package com.java;
import javax.swing.JFrame;
import javax.swing.JButton; 
public class second extends JFrame{
	JFrame f;
	JButton b;
	
	second()
	{
		   f=new JFrame("new frame");
		 b = new JButton("Click Me");
		b.setBounds(40,90,120,50);
		add(b);
		setLayout(null);
		setVisible(true);
		setSize(400,400);
		
	}
	
	public static void main(String [] args)
	{
		new second();
	}

}


