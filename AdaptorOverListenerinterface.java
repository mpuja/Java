package com.java;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class AdaptorOverListenerinterface extends JFrame {
		    private JLabel resultLabel;

		    public AdaptorOverListenerinterface() {
		        
		        setSize(300, 300);
		        
		        setLayout(null);

		        resultLabel = new JLabel();
		        resultLabel.setBounds(50, 50, 200, 30);
		        add(resultLabel);

		        addKeyListener(new KeyAdapter() {
		            int number1 = 10;
		             int number2 = 5;

		            @Override
		            public void keyPressed(KeyEvent e) {
		                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		                    int sum = number1 + number2;
		                    resultLabel.setText("Sum: " + sum);
		                }
		            }

		            @Override
		            public void keyReleased(KeyEvent e) {
		                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		                    int difference = number1 - number2;
		                    resultLabel.setText("Difference: " + difference);
		                }
		            }

		            @Override
		            public void keyTyped(KeyEvent e) {
		                // Not used in this example
		            }

		            public void keyPressed1(KeyEvent e) {
		                // Assuming the user enters two numbers separated by a comma (e.g., "5,3")
		                String input = String.valueOf(e.getKeyChar());
		                if (Character.isDigit(e.getKeyChar())) {
		                    if (number1 == 0) {
		                        number1 = Integer.parseInt(input);
		                    } else if (number2 == 0) {
		                        number2 = Integer.parseInt(input);
		                    }
		                }
		            }
		        });

		        setFocusable(true);
		        setVisible(true);
		    }

		    public static void main(String[] args) {
		        new AdaptorOverListenerinterface();
		    }
		}

	


