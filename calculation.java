package com.java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculation extends JFrame implements ActionListener {

			JButton b1, b2, b3, b4;
			JLabel l1, l2, l3;
			JTextField t1, t2, t3;
		
			calculation()
			 {
				setTitle("Mathmatical Operation");
				t1 = new JTextField(10);	
				t2 = new JTextField(10);
				t3 = new JTextField(10);
				l1 = new JLabel("First Number : ");
				l2 = new JLabel("Second Number :");
				l3 = new JLabel("Result :");
				b1 = new JButton("ADD");
				b2 = new JButton("SUBTRACT");
				b3 = new JButton("MULTIPLY");
				b4 = new JButton("DIVIDE");
				
				b1.addActionListener(this);
				b2.addActionListener(this);
				b3.addActionListener(this);
				b4.addActionListener(this);
				
				add(l1);
				add(t1);
				add(l2);
				add(t2);
				add(b1);
				add(b2);
				add(b3);
				add(b4);
				add(l3);
				add(t3);
				
				setLayout(new FlowLayout());
				setVisible(true);
				setSize(800,300);
			 }
		
				public static void main(String [] args)
				 {
					new calculation();
				 }

					@Override
					public void actionPerformed(ActionEvent e) 
					 {
						try {
						int number1, number2, result;
						number1 = Integer.parseInt(t1.getText());
						number2 = Integer.parseInt(t2.getText()); 
						
//						float number1, number2, result;
//						number1 = Float.parseFloat(t1.getText());
//						number2 = Float.parseFloat(t2.getText());
					
						if(e.getSource()==b1)
						 {
							
							result = number1 + number2;
							t3.setText(result+"");
						 }
						
						else if(e.getSource()==b2)
						 {
							result = number1 - number2;
							t3.setText(result+"");
						 }
						
						else if(e.getSource()==b3)
						 {
							result = number1 * number2;
							t3.setText(result+"");
						 }
						
						else if(e.getSource()==b4)
							 {
								result = number1 / number2;
								t3.setText(result+"");
								
							 }
							
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println(e2.getMessage());
						}
			
					 }

		 }


