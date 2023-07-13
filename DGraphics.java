package com.java;
import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;
public class DGraphics extends JFrame{
	Mypanel panel;
 public DGraphics(){
	 setTitle("2D Shape");
	 panel = new Mypanel();
	 add(panel);
	 setVisible(true);
	 setSize(400,400);
 }
 public static void main(String[]args)
 {
	 new DGraphics();
 }
}
 class Mypanel extends JPanel{
	 public Mypanel(){
	 }
		 public void paint(Graphics g){
			 g.drawLine(50, 300, 250, 300);
			  g.drawString("Advance Java", 40, 40);
			 g.drawRect(50, 50, 200, 100);
		        g.drawOval(100, 200, 150, 150);
		     
		        
		        
		      
	 }
 }

