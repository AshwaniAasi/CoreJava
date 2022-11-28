package awtSwingdemo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class TabPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabPage frame = new TabPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TabPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 1066, 591);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Login", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(255, 128, 0));
		lblNewLabel_1.setIcon(new ImageIcon(TabPage.class.getResource("/Images/istockphoto-1353553203-170667a.jpg")));
		lblNewLabel_1.setBounds(447, 63, 567, 450);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(TabPage.class.getResource("/Images/download.jpg")));
		lblNewLabel_2.setBounds(10, 11, 1041, 541);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		tabbedPane.addTab("New tab", null, lblNewLabel, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Register", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("About Us", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Help", null, panel_3, null);
	}
}
