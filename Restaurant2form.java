package com.java;
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.ArrayList;
	import java.util.EventObject;

	import javax.swing.JScrollPane;
	import javax.swing.JTable;
	import javax.swing.table.DefaultTableModel;
	import javax.swing.table.TableColumn;
	public class Restaurant2form extends JFrame{
		private JTable jt;
	    JButton b;
		JFrame f;
	    JLabel l1;
	   JDialog d;

	    public  Restaurant2form() {
	    l1=new JLabel();

	    	 setTitle("Restaurant Ordering system");
	        Object[] columnNames = {"Select", "Item Names", "Price"};
	        Object[][] data = {
	        		{false, "Chowmin", new Double(120.0)},	
	        		{false, "Momo", new Double(150.0)},
	        		{false, "Pizza", new Double(650.0)},
	        		{false,"Burger",new Double(250.0)},
	        };

	        DefaultTableModel modal = new DefaultTableModel(data, columnNames);
		    jt = new JTable(modal){
		    	 private static final long serialVersionUID = 1L;

		    	 public Class getColumnClass(int column){

					switch (column){

					    case 0:
					       return Boolean.class;

					    case 1:
					    	return String.class;

					    default:
					    	return Double.class;				      
					} 
		    	 }
		    };

			  add(l1);
			  jt.setSize(100, 200);
			  jt.setShowGrid(false);

			  jt.setBackground(Color.green);
			  jt.setPreferredScrollableViewportSize(new Dimension(500, 65));
			  JScrollPane sp=new JScrollPane(jt);    
			  add(sp);

		      add(new JScrollPane(jt), FlowLayout.CENTER);
		      jt.setShowGrid(true);

		      b = new JButton("Order");

		      b.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						    JDialog dialog = new JDialog();
					        dialog.setTitle("Food Billing");
					        JScrollPane scrollPane = new JScrollPane(jt);
					        dialog.add(scrollPane);
					        dialog.setSize(500, 400);

					        if (e.getSource() == b) {

					            java.util.List<String> selectedItems = new ArrayList<>();
					            double totalPrice = 0.0;
					            for (int i = 0; i < modal.getRowCount(); i++) {
					                Boolean isSelected = (Boolean) modal.getValueAt(i, 0);
					                String itemName = (String) modal.getValueAt(i, 1);
					                Double itemPrice = (Double) modal.getValueAt(i, 2);
					                if (isSelected) {
					                    selectedItems.add(itemName);

					                    totalPrice += itemPrice;
					                }
					            }
					            String message;
					            if (selectedItems.size() == 0) {
					                message = "No items selected.";
					            } else {
					                message = "Selected items:\n";
					                for (String item : selectedItems) {
					                    message += "- " + item + "\n";
					                }
					                message += "Total price: " + totalPrice + " NPr";
					            }
					            JOptionPane.showMessageDialog(dialog, message);


					}}
		        });

		       jt.setShowGrid(false);
//		        add(jt);
		        add(b,BorderLayout.SOUTH);
		  b.setBounds(50, 50, 50, 10);

		    getContentPane().setBackground(Color.pink);
		    setLayout(new FlowLayout());
		    setResizable(false);
			setVisible(true);
			setSize(400,300);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      new Restaurant2form();

		}
		}

