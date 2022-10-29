package server;

public class ServerMain 
{
	public static void main(String[] args) 
	{
		Server s=new Server(); //to invoke GUI part 
		s.waitingForClient(); // to wait for client connection
		s.setIoStreams(); //through this we can transfer data to client.
	}
}
