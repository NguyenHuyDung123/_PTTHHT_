package tuan8;

public class client {
    package com.sept.client.impl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.rmi.IAccount;

public class RMIClient {
    public static void main(String args[]) {
        try {
            //Xác định RMI máy chủ.
            IAccount iAccount = (IAccount) Naming.lookup("rmi://192.168.1.230:6789/SeptemberRMI");
            System.out.println("Name: " + iAccount.getUser().getUname());
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
    
}
