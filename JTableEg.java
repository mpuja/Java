package com.java;
import javax.swing.*;
import java.awt.*;

public class JTableEg {
	 JFrame f;    
	    JTableEg(){    
	    f=new JFrame();    
	    String data[][]={ {"101","Kumar","67000"},    
	                          {"102","Jai","45000"},    
	                          {"103","Sachin","55000"}};    
	    String column[]={"ID","NAME","SALARY"};         
	    JTable jt=new JTable(data,column);    
	    jt.setBounds(30,40,200,300);          
	    JScrollPane sp=new JScrollPane(jt);    
	    f.add(sp);          
	    f.setSize(300,400);    
	    f.setVisible(true);    
	}     
	public static void main(String[] args) {    
	    new JTableEg();    
	}    
	} 

