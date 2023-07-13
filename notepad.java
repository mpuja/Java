package com.java;
	import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
	import java.awt.Insets;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;

	import javax.swing.JFileChooser;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JMenu;
	import javax.swing.JMenuBar;
	import javax.swing.JMenuItem;
	import javax.swing.JOptionPane;
	import javax.swing.JScrollPane;
	import javax.swing.JTextArea;
	import javax.swing.JTextField;

	public class notepad extends JFrame implements ActionListener{
		
		JMenuBar mb;
		JMenu m1, m2, m3, m4, m5;
		JMenuItem mi1, mi2, mi3, mi4, mi5, mi6, mi7, mi8, mi9, mi10;
		JTextArea ta;
		JLabel l;
		JTextField tf;
		JScrollPane sp;
		JFrame f;

		notepad(){
			sp=new JScrollPane(ta);
			tf = new JTextField(1000);

			 ta= new JTextArea(100,110);
			 //getContentPane().setBackground(Color.pink);
			    
				setSize(400,300);
			 setTitle("NOTEPAD");
			f = new JFrame();
			l = new JLabel();
			mb = new JMenuBar();
			
			m1 = new JMenu("File");
			mi1 = new JMenuItem("New File");
			mi2 = new JMenuItem("Open File");
			
			m2 = new JMenu("Edit");
			mi3 = new JMenuItem("Cut");
			mi4 = new JMenuItem("Copy");
			mi5 = new JMenuItem("Paste");
			
			m3 = new JMenu("Format");
			mi6 = new JMenuItem("All Capital");
			mi7 = new JMenuItem("All Small");
			
			m4 = new JMenu("View");
			mi8 = new JMenuItem("Word Count");
			mi9 = new JMenuItem("Character Count");
			
			m5 = new JMenu("Help");
			mi10 = new JMenuItem("About");
			ta = new JTextArea();

			ta.setMargin( new Insets(5,5,5,5) );
			
			m1.add(mi1);
			m1.add(mi2);
			m2.add(mi3);
			m2.add(mi4);
			m2.add(mi5);
			m3.add(mi6);
			m3.add(mi7);
			m4.add(mi8);
			m4.add(mi9);
			m5.add(mi10);
			
			mb.add(m1);
			mb.add(m2);
			mb.add(m3);
			mb.add(m4);
			mb.add(m5);
			setJMenuBar(mb);
			
			mi1.addActionListener(this);
			mi2.addActionListener(this);
			mi3.addActionListener(this);
			mi4.addActionListener(this);
			mi5.addActionListener(this);
			mi6.addActionListener(this);
			mi7.addActionListener(this);
			mi8.addActionListener(this);
			mi9.addActionListener(this);
			mi10.addActionListener(this);
	
			add(ta);
			ta.setBounds(200,500,200,100);
			
			
			setVisible(true);
			setSize(400,400);

				
		}
		
		public static void main(String[] args){
			new notepad();
		}
		
		@Override
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource() == mi1){
				f.setTitle("New Document.txt");
				ta.setText("");
				tf.setText("");	
			}
			else if(ae.getSource() == mi3){
				ta.cut();
				
			}
			else if(ae.getSource() == mi4){
				ta.copy();
			}
			else if(ae.getSource() == mi5){
				ta.paste();
			}
			else if(ae.getSource() == mi6){
				String st = ta.getText().toUpperCase();
				ta.setText(st);
			}
			else if(ae.getSource() == mi7){
				String st = ta.getText().toLowerCase();
				ta.setText(st);
			}
			else if(ae.getSource() == mi8){
				//to count number of word and character
				String text = ta.getText();
				int word = 0;
				int character = 0;
				boolean isWord = false;
				
				for(int i=0; i < text.length(); i++){
					char  a = text.charAt(i);
					if(Character.isWhitespace(a))
					{
						isWord = false;
					}
					else if(!isWord){
						word++;
						isWord = true;
					}
					character++;
					mi8.setText("Word count: "+ word);

				}
				
			}
			else if(ae.getSource() == mi9){
				String text = ta.getText();
				int word = 0;
				int character = 0;
				boolean isWord = false;
				
				for(int i=0; i < text.length(); i++){
					char  a = text.charAt(i);
					if(Character.isWhitespace(a))
					{
						isWord = false;
					}
					else if(!isWord){
						word++;
						isWord = true;
					}
					character++;
					mi9.setText("Character count: "+ character);

				}
			
			}
			else if(ae.getSource( )== mi10)
			{
	            JOptionPane.showMessageDialog(this, "Notepad v1.0\n(c) 2023 Acme Corp.");

		}
			else if(ae.getSource() == mi2){
				 // Open a file and display its contents in the text area
	            JFileChooser fileChooser = new JFileChooser();
	            int result = fileChooser.showOpenDialog(f);

	            if (result == JFileChooser.APPROVE_OPTION) {
	                File file = fileChooser.getSelectedFile();

	                try {
	                    BufferedReader reader = new BufferedReader(new FileReader(file));
	                    String line;
	                    StringBuilder text = new StringBuilder();

	                    while ((line = reader.readLine()) != null) {
	                        text.append(line).append("\n");
	                    }

	                    reader.close();

	                    ta.setText(text.toString());
	                } catch (IOException ex) {
	                    JOptionPane.showMessageDialog(f, "Error reading file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	                }
			}

	}
		}
		}



	

