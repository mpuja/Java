package com.RMIserver;
import java.rmi.*;
public interface Factorial extends Remote {

public long calculateFactorial(int x ) throws RemoteException;

}


