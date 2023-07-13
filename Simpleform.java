package com.java;
import java.awt.FlowLayout;

import javax.swing.*;

public class Simpleform extends JFrame {
    JLabel l1, l2;
    JTextField t1, t2;
    JButton b;

    Simpleform() {
    	setTitle("Form");
        l1 = new JLabel("UserName:");
        t1 = new JTextField(10);
        l2 = new JLabel("Faculty:");
        t2 = new JTextField(10);
        b = new JButton("Submit");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);

        setLayout(new FlowLayout());
        setSize(400, 400);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        new Simpleform();
    }
}
