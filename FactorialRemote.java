package com.RMIserver;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class FactorialRemote extends UnicastRemoteObject implements Factorial{

public FactorialRemote() throws RemoteException{
super();

}

public long calculateFactorial(int number) {
long factorial = 1;
for (int i = 1; i <= number; i++) {
     factorial *= i;
}
return factorial;
}
}


