package com.java;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
public class AdpatorExample extends JFrame {
JPanel p;
JButton b;
	    public AdpatorExample() {
    setTitle("AdaptorDemo");
	        p = new JPanel();
	        b = new JButton("Click me!");

	        b.addActionListener(new MyActionAdaptor());

	        p.add(b);
	        add(p);

	 
	        setSize(300, 200);
	        setLayout(new FlowLayout());
	        setVisible(true);
	        
	    }

	    private class MyActionAdaptor implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            System.out.println("Button clicked!");
	        }
	    }

	    public static void main(String[] args) {
	        new AdpatorExample();
	    }
	}


