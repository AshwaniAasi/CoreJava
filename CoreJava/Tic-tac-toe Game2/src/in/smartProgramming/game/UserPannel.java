package in.smartProgramming.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UserPannel implements ActionListener
{
	JFrame jf;
	JLabel jl1 ,jl2;
	JTextField jt1, jt2;
	JButton jb;
	
	UserPannel()
	{
		jf=new JFrame();
		jf.setSize(600, 500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		
		jl1=new JLabel("Enter 1st Player Name : ");
		jl1.setBounds(50, 50, 150, 30);
		jf.add(jl1);
		
		jt1=new JTextField();
		jt1.setBounds(250, 50, 250, 30);
		jf.add(jt1);
		
		jl2=new JLabel("Enter 2nd Player Name : ");
		jl2.setBounds(50, 100, 150, 30);
		jf.add(jl2);
		
		jt2=new JTextField();
		jt2.setBounds(250, 100, 250, 30);
		jf.add(jt2);
		
		jb= new JButton("Start Game");
		jb.setBounds(100, 150, 100, 30);
		jb.addActionListener(this);
		jf.add(jb);
		jf.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jb)
		{
			String player1=jt1.getText();
			String player2=jt2.getText();
			
			GamePannel1 gp1= new GamePannel1(player1 , player2);
			gp1.openGame();
			jf.setVisible(false);
		}
		
	}
	
	
	
}
