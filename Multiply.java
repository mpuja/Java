package com.java;
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;

	public class Multiply extends JFrame implements ActionListener {
		JFrame f;
		JButton b;
		JLabel l1, l2, l3;
		JTextField t1, t2;
			Multiply()
			{
				b = new JButton("Multiple");
				l1 = new JLabel("First Number : ");
				l2 = new JLabel("Second Number :");
				l3 = new JLabel("Result :");
				t1 = new JTextField(10);
				t2 = new JTextField(10);
				
				b.addActionListener(this); 
				add(l1);
				add(t1);
				add(l2);
				add(t2);
				add(b); 
				add(l3);
				
				setLayout(new FlowLayout());
				setVisible(true);
				setSize(200,200);
			}
		
				public static void main(String [] args)
					{
						new Multiply();
					}

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					int num1, num2, result;
					num1 = Integer.parseInt(t1.getText());
					num2 = Integer.parseInt(t2.getText());
					result = num1 * num2;
					
					l3.setText(result + "");
				}

	}


