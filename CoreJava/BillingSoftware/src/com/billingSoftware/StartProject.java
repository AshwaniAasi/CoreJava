package com.billingSoftware;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class StartProject extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartProject frame = new StartProject();
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
	public StartProject() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setBounds(301, 256, 89, 36);
		lblNewLabel_1.setForeground(new Color(0, 0, 160));
		lblNewLabel_1.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password :");
		lblNewLabel_1_1.setBounds(259, 302, 121, 44);
		lblNewLabel_1_1.setForeground(new Color(0, 0, 160));
		lblNewLabel_1_1.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(387, 252, 362, 40);
		textField.setFont(new Font("Arial Black", Font.PLAIN, 15));
		getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(387, 305, 362, 44);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		getContentPane().add(passwordField);
		
		JPanel panel = new JPanel();
		panel.setBounds(249, 194, 510, 269);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(255, 128, 64));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(173, 192, 125, 43);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 239, 552);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(StartProject.class.getResource("/Images/imageedit_4_9913529912.png")));
		lblNewLabel.setBounds(10, 122, 235, 312);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(239, 11, 510, 182);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome to Billing Software");
		lblNewLabel_2.setForeground(new Color(0, 0, 160));
		lblNewLabel_2.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(52, 11, 448, 167);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(StartProject.class.getResource("/Images/invoice-management.jpg")));
		lblNewLabel_3.setBounds(-19, 0, 1017, 552);
		getContentPane().add(lblNewLabel_3);
	}

}
