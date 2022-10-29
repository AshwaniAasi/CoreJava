package chatting_app;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class My_Server 
{
	public static void main(String[] args) 
	{
		try 
		{
			ServerSocket serversocket=new ServerSocket(1111);
			System.out.println("Server is waiting for Client");
			
			Socket socket=serversocket.accept();
			System.out.println("Client found");			
			InputStream is=socket.getInputStream();			
			DataInputStream dis=new DataInputStream(is);
			String str=dis.readUTF();
			System.out.println("Message from Client : "+str);
			
			String str2="hello Client...!!!";
			OutputStream os=socket.getOutputStream();
			DataOutputStream dos=new DataOutputStream(os);
			dos.writeUTF(str2);
			
			dos.flush();
			
			is.close();
			socket.close();
			serversocket.close();			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
