public class server {

    public static void main(String []args) throws IOException
    {
        String so1,so2,so3,so4,so5,so6,so7;
        int tong;
        ServerSocket server = new ServerSocket(1234);
        System.out.println("Server is now already");
        Socket connectionSocket = server.accept();
        DataInputStream inFromClient = new DataInputStream(connectionSocket.getInputStream());
        DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
        so1 = inFromClient.readLine();
        so2 = inFromClient.readLine();
        so3 = inFromClient.readLine();
        so4 = inFromClient.readLine();
        so5 = inFromClient.readLine();
        so6 = inFromClient.readLine();
        int a = Integer.parseInt(so1);
        int b = Integer.parseInt(so2);
        int c = Integer.parseInt(so2);
        int d = Integer.parseInt(so2);
        int e = Integer.parseInt(so2);
        int f = Integer.parseInt(so2);
        tong = a + b + c + d + e + f;
        so7 = String.valueOf(tong);
        outToClient.writeBytes(so7+'\n');
        inFromClient.close();
        outToClient.close();
        server.close();
    }
    
}
