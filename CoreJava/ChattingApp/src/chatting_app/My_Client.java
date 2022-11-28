package chatting_app;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

class My_Client 
{
	public static void main(String[] args) 
	{
		try 
		{
			Socket socket=new Socket("192.168.0.14", 1111);
			
			OutputStream os=socket.getOutputStream();			
			DataOutputStream dos=new DataOutputStream(os);			
			String str1="Hello Server...!!!";
			
			dos.flush();
			
			InputStream is=socket.getInputStream();
			DataInputStream dis=new DataInputStream(is);
			String str2=dis.readUTF();
			System.out.println("Message from Server : "+str2);
		
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
