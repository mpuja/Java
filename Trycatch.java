package com.java;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Trycatch extends JFrame{
	JButton b1, b2, b3, b4;
	JLabel l1, l2, l3;
	JTextField t1, t2, t3;
	Trycatch()
	 {
	try{
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
			
//			int num1, num2;
//			num1 = Integer.parseInt(t1.getText());
//			num2 = Integer.parseInt(t2.getText());
			
			b1.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					int num1, num2, result;
					num1 = Integer.parseInt(t1.getText());
					num2 = Integer.parseInt(t2.getText());
					result = num1 + num2;
					t3.setText(result+"");
					
				}
				
			}
					);
			b2.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
						int num1, num2, result;
						num1 = Integer.parseInt(t1.getText());
						num2 = Integer.parseInt(t2.getText());
				result = num1 - num2;
				t3.setText(result+"");
				
			}
			
		}
				);
			b3.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
					int num1, num2, result;
					num1 = Integer.parseInt(t1.getText());
					num2 = Integer.parseInt(t2.getText());
			result = num1 * num2;
			t3.setText(result+"");
			
		}
		
	}
			);
			b4.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
					int num1, num2, result;
					num1 = Integer.parseInt(t1.getText());
					num2 = Integer.parseInt(t2.getText());
			result = num1 / num2;
			t3.setText(result+"");
			
		}
		
	}
			);
			
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
			setSize(300,300);
	
		
	}catch(Exception e1)
	{
		System.out.println(e1.getMessage());
	}
	 }

	public static void main(String[] args) {
		new Trycatch();

	}

}



