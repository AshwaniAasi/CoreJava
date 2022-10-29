package client;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client 
{
	private JFrame clientFrame ;
	private JTextField tf;
	private JTextArea ta;
	private JScrollPane scp;
	private Socket socket;
	private DataInputStream dis;
	private DataOutputStream dos;
	String ipaddress;
	//---------------------------------------Thread Creation--------------------
		Thread thread= new Thread();
		public void run()
		{
			while (true)
			{
				readMessage();
			}
		}
		//----------------------------------------------------------------
	Client()
	{
		ipaddress= JOptionPane.showInputDialog("Enter IP Adress");
		if (ipaddress !=null)
		{
			if( ! ipaddress.equals(""))
			{
				connectToServer();
				
				clientFrame=new JFrame("Client");
				clientFrame.setSize(500, 500);
				clientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				ta =new JTextArea();
				ta.setEditable(false);
				Font font=new Font("Arial", 1, 16);
				ta.setFont(font);
				scp = new JScrollPane(ta);
				clientFrame.add(scp);
				
				tf=new JTextField();
				tf.addActionListener(new ActionListener() 
				{
					@Override
					public void actionPerformed(ActionEvent e) {
						sendMessage(tf.getText());
						ta.append(tf.getText()+"\n");
						tf.setText(" ");
					}
				});
				clientFrame.add(tf, BorderLayout.SOUTH);
				clientFrame.setVisible(true);
			}
		}
	}
	public void connectToServer()
	{
		try
		{
			socket = new Socket(ipaddress ,1111);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public void setIoStreams()
	{
		try
		{
			 dis=new DataInputStream(socket.getInputStream());
			 dos= new DataOutputStream(socket.getOutputStream());
		}
		catch (Exception e)
		{
				 System.out.println(e);
		}
		thread.start();
	}
	public void sendMessage(String message)
	{
		try
		{
			dos.writeUTF(message);
			dos.flush();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public void readMessage()
	{
		try
		{
			String message=dis.readUTF();
			showMessage("Server : "+message);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public void showMessage(String message)
	{
		ta.append(message+"\n");
		chatSound();

	}
	public void chatSound()
    {
        try
        {
            File file_name=new File("src\\sound\\chat_sound.mp3");
            FileInputStream fis=new FileInputStream(file_name.getAbsolutePath());
            javazoom.jl.player.Player	 p=new javazoom.jl.player.Player(fis);
            p.play();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
	
}
