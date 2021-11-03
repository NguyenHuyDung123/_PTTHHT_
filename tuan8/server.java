package tuan8;

public class server {
    
 package com.sept.server.impl;

 import java.net.MalformedURLException;
 import java.rmi.AlreadyBoundException;
 import java.rmi.Naming;
 import java.rmi.RemoteException;
 import java.rmi.registry.LocateRegistry;
 
 import com.rmi.IAccount;
 
 public class RMIServer {
     public static void main(String args[]) {
 
         try {
             IAccount rAccount = new AccountServiceImpl();
 
             LocateRegistry.createRegistry(6789);
 
             // Đăng ký đối tượng này với rmiregistry
             Naming.bind("rmi://192.168.1.230:6789/SeptemberRMI", rAccount);
 
             System.out.println(">>>>>INFO: RMI Server started!!!!!!!!");
         } catch (RemoteException e) {
             e.printStackTrace();
         } catch (AlreadyBoundException e) {
             e.printStackTrace();
         } catch (MalformedURLException e) {
             e.printStackTrace();
         }
     }
 }
    
}
