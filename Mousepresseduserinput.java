package com.java;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.*;

public class Mousepresseduserinput extends JFrame {
	     JLabel resultLabel;
	     int number1 = 20;
	    int number2 =10;

	    public Mousepresseduserinput() {
	        setTitle("Mouse Adapter Example");
	       
	        resultLabel = new JLabel();
	        resultLabel.setBounds(50, 50, 200, 30);
	        add(resultLabel);

	        addMouseListener(new MouseAdapter() {
	            @Override
	            public void mousePressed(MouseEvent e) {
	                int sum = number1 + number2;
	                resultLabel.setText("Sum: " + sum);
	            }

	            @Override
	            public void mouseReleased(MouseEvent e) {
	                int difference = number1 - number2;
	                resultLabel.setText("Difference: " + difference);
	            }
	        });

           setSize(300, 200);
	        
	        setLayout(null);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new Mousepresseduserinput();
	    }
	}


