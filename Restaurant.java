package com.java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	public class Restaurant extends JFrame implements ActionListener{
		 JLabel l1,l2,l3;
		    JTextField t1;
		    JPasswordField pf;
		    JButton b,b2;
	        JFrame f;
	        JPanel p;
		    public Restaurant() {
		    	setTitle("Restaurant ordering system");

		    	f = new JFrame();
		        p = new JPanel();

		        l1= new JLabel("Username");
		        t1 = new JTextField(10);

		        l2= new JLabel("Password");
		        pf= new JPasswordField(10);

		        b = new JButton("Login");
		        b.addActionListener(this);

		        add(l1);
		        add(t1);

		        add(l2);
		        add(pf);

		        p.add(b);
		        add(p);

		        setBounds(40, 90, 100, 50);
				getContentPane().setBackground(Color.cyan);
				setResizable(false);
		        setLayout(new FlowLayout());
		        setSize(400, 400);
		        setVisible(true);


		    }
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

		     if (e.getSource() == b) {
		            String user = l1.getText();

		            String password = new String(pf.getPassword());

//		            if (user.equals("puja") && password.equals("12345")){
//		         }

		   	     Restaurant2form a = new Restaurant2form();
		    	 	setVisible(true);
	    	 	dispose();

		}
	}


		    public static void main(String[] args) {
		        new Restaurant();
		    }
		}



