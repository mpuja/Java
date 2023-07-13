package com.RMIserver;

import java.rmi.Naming;

public class MyClient {
	public static void main(String args[]){
	try{
		Factorial stub = (Factorial) Naming.lookup("rmi://localhost:5000/jbc");
		System.out.println("Calling server");
		System.out.println(stub.calculateFactorial(4));
		}catch(Exception e){
		System.err.println("Error: " + e.getMessage());
		}
		}
}
