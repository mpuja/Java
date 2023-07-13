package com.java;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MakecaculatorDemo  extends JFrame implements ActionListener{
	private JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private JButton bPlus, bMinus, bMultiply, bDivide, bEquals, bClear;
    JPanel p;
    JFrame f;
    JTextField tf;
    private double num1, num2, result;
  private String operator;
    public MakecaculatorDemo() 
    {
  
        setTitle("Calculator");
        setSize(300, 400);
      
        tf = new JTextField();
       tf.setHorizontalAlignment(JTextField.RIGHT);
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        
        bPlus = new JButton("+");
        bMinus = new JButton("-");
        bMultiply = new JButton("*");
        bDivide = new JButton("/");
        bEquals = new JButton("=");
        bClear = new JButton("C");

       
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        
        bPlus.addActionListener(this);
        bMinus.addActionListener(this);
        bMultiply.addActionListener(this);
        bDivide.addActionListener(this);
        bEquals.addActionListener(this);
        bClear.addActionListener(this);
        
        p = new JPanel();
        p.setLayout(new GridLayout(5, 4));
        p.add(tf);
        p.add(bClear);
        p.add(bDivide);
        p.add(bMultiply);
        
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bMinus);
        
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bPlus);
        
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bEquals);
        
        p.add(b0);
        
        add(p);
    	//p.setBackground(Color.BLACK);
	setLayout(new FlowLayout());
	setVisible(true);
	setSize(400,400);
    }

public static void main(String args[]){
	new MakecaculatorDemo();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	  if (e.getSource() == b0) {
          tf.setText(tf.getText() + "0");
      } else if (e.getSource() == b1) {
          tf.setText(tf.getText() + "1");
      } else if (e.getSource() == b2) {
          tf.setText(tf.getText() + "2");
      } else if (e.getSource() == b3) {
          tf.setText(tf.getText() + "3");
      } else if (e.getSource() == b4) {
          tf.setText(tf.getText() + "4");
      } else if (e.getSource() == b5) {
          tf.setText(tf.getText() + "5");
      } else if (e.getSource() == b6) {
          tf.setText(tf.getText() + "6");
       } else if (e.getSource() == b7) {
          tf.setText(tf.getText() + "7");
       } else if (e.getSource() == b8) {
           tf.setText(tf.getText() + "8");
       } else if (e.getSource() == b9) {
           tf.setText(tf.getText() + "9");
       } else if (e.getSource() == bPlus) {
           tf.setText(tf.getText() + "+");
       } else if (e.getSource() == bMinus) {
           tf.setText(tf.getText() + "-");
       } else if (e.getSource() == bMultiply) {
           tf.setText(tf.getText() + "*");
       } else if (e.getSource() == bDivide) {
           tf.setText(tf.getText() + "/");
       
       }
}
}