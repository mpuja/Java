package com.java;
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	public class InnerAnnoymous extends JFrame
	{
		JButton b;
		  JLabel l1,l2,l3;
		  JTextField t1,t2;
		  InnerAnnoymous()
		  {
			  l1=new JLabel("first num:");
		        l2=new JLabel("second num:");
		        l3=new JLabel("result:");

		        t1=new JTextField(10);
		        t2= new JTextField(10);

		        b=new JButton("add");
		        b.addActionListener(new ActionListener(){
		        	public void actionPerformed(ActionEvent e)
		        	{
		        		try {
		        			int num1,num2,result;
		        		    num1=Integer.parseInt(t1.getText());
		        			num2=Integer.parseInt(t2.getText());


		        				result=num1+num2;
		        				l3.setText(result+"");

		        			}
		        		 catch (Exception e2) {
		        			// TODO: handle exception
		        		}
		        	}

		        });
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
		  public static void main(String[] args) {
			  new InnerAnnoymous();

		  }

		}
