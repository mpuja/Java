package com.java;
	import java.awt.FlowLayout;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;

	public class MulAnnoymous extends JFrame {

		JFrame f;
		JButton b1,b2,b3,b4;
		JLabel l1, l2, l3;
		JTextField t1, t2;
		MulAnnoymous()
			{
			try{
				
				l1 = new JLabel("First Number : ");
				t1 = new JTextField(10);
				l2 = new JLabel("Second Number :");
				t2 = new JTextField(10);
				
				b1 = new JButton("Add");
				b2 = new JButton("Subtract");
				b3 = new JButton("Multiply");
				b4 = new JButton("Divide");
				
				l3 = new JLabel("Result :");
				b1.addActionListener(new ActionListener(){
					@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int num1, num2, result;
					num1 = Integer.parseInt(t1.getText());
					num2 = Integer.parseInt(t2.getText());
					result = num1 * num2;
					
					l3.setText(result + "");
				}
				}); 
				add(l1);
				add(t1);
				add(l2);
				add(t2);
				add(b1); 
				add(b2); 
				add(b3); 
				add(b4); 
				add(l3);
				
				setLayout(new FlowLayout());
				setVisible(true);
				setSize(200,200);
			}catch(Exception e1){
				System.out.println(e1.getMessage());
			}
			}
		
				public static void main(String [] args)
					{
						new MulAnnoymous();
					}
		
	}


