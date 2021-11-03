package bai1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {
    public static void main(String []args) throws IOException
    {
        String a,b,c,d,e,f, tong;
        Socket ClientSocket = new Socket("Localhost", 1234);
        System.out.println("Connected to server");
        DataInputStream inFromUser = new DataInputStream(System.in);
        DataInputStream inFromServer = new DataInputStream(ClientSocket.getInputStream());
        DataOutputStream outToServer = new DataOutputStream(ClientSocket.getOutputStream());
        try{
            System.out.println("nhap vao so a :");
            a=inFromUser.readLine());
            System.out.println("nhap vao so b :");
             b=inFromUser.readLine();
             System.out.println("nhap vao so c :");
            c=inFromUser.readLine();
            System.out.println("nhap vao so d :");
            d=inFromUser.readLine();
            System.out.println("nhap vao so e :");
            e=inFromUser.readLine();
            System.out.println("nhap vao so f :");
            f=inFromUser.readLine();
             outToServer.writeBytes(a+'\n');
            outToServer.writeBytes(b+'\n');
            outToServer.writeBytes(c+'\n');
            outToServer.writeBytes(d+'\n');
            outToServer.writeBytes(e+'\n');
            outToServer.writeBytes(f+'\n');
        }catch(UnknownHostException e)
        {
            System.err.println("Server Not Found");
            System.exit(1);
        }catch(IOException e)
        {
            System.err.println("Cannot make a connection");
            System.exit(1);
        }
        
        tong=inFromServer.readLine();
        System.out.println("Tong 6 so a+b+c+d+e+f la :"+tong);
        outToServer.close();
        inFromServer.close();
        ClientSocket.close();
    }

}