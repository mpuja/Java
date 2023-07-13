package com.java;
	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.*;
	

	public class Add extends JFrame implements ActionListener  {

	JButton b;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	Add()
	{
		l1 = new JLabel("Num1 :");
		l2 = new JLabel("Num2 :");
		l3 = new JLabel("Result :");
		
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		
		b = new JButton("ADD");

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
	  new Add();
	}
	@Override
	public void actionPerformed(ActionEvent e) {

	int num1, num2, result;
	num1 = Integer.parseInt(t1.getText());
	num2 = Integer.parseInt(t2.getText());
	result = num1 + num2;
	l3.setText(result + "");

	//TODO Auto-generated method stub
	}

	}



