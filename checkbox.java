package com.java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class checkbox extends JFrame{

	JButton b;
		JLabel l1, l2, l3;
		JTextField t1, p;
		JCheckBox c1, c2, c3;
		JRadioButton r1, r2, r3 ;
		
		
		checkbox()
		{
			l1 = new JLabel("Username : ");
			l2 = new JLabel("Password : ");
			l3 = new JLabel("Details : ");
			b = new JButton("submit");
			t1 = new JTextField(10);
			p = new JPasswordField(10);
			c1 = new JCheckBox("Science");
			c2 = new JCheckBox("Math");
			c3 = new JCheckBox("English");
			r1 = new JRadioButton("Male");
			r2 = new JRadioButton("Female");
			r3 = new JRadioButton("Others");
			ButtonGroup bg = new ButtonGroup();
			
			b.addActionListener(new ActionListener()
					{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					String student = " Subjects Selected : ";
					
					student = "Username : " +t1.getText() + "  Password : *****  " ;
					
					if(r1.isSelected())
					{
						student+= " Male ";
					}
					if(r2.isSelected())
					{
						student+= " Female ";
					}
					if(r3.isSelected())
					{
						student+= " Others ";
					}
					
					if(c1.isSelected())
					{
						student+= " Science ";
					}
					if(c2.isSelected())
					{
						student+= " Math ";
					}
					if(c3.isSelected())
					{
						student+= " English ";
					}
					
					l3.setText(student);
				}
					});
			
			add(l1);
			add(t1);
			add(l2);
			add(p);
			bg.add(r1);
			bg.add(r2);
			bg.add(r3);
			add(r1);
			add(r2);
			add(r3);
			add(c1);
			add(c2);
			add(c3);
			add(b);
			add(l3);
			
			setLayout(new FlowLayout());
			setVisible(true);
			setSize(400,400);
		}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			new checkbox();
	
		}
	
	}
	


