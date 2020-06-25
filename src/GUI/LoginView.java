package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import GUI.UrbanCafeGUI;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LoginView {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView window = new LoginView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(205, 133, 63));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUrbanCafee = new JLabel("Urban Cafee");
		lblUrbanCafee.setForeground(SystemColor.controlHighlight);
		lblUrbanCafee.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblUrbanCafee.setBounds(132, 0, 190, 62);
		frame.getContentPane().add(lblUrbanCafee);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(SystemColor.controlHighlight);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsername.setBounds(44, 94, 81, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(SystemColor.controlHighlight);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(44, 143, 81, 14);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setBounds(126, 93, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.BLACK);
		passwordField.setBounds(126, 142, 86, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user = textField.getText();
				String psw = passwordField.getText();
				if (user.equals("rinorjaha")&&psw.equals("nori111")) {
					new UrbanCafeGUI().main(null);
				}
				else {
					JOptionPane.showMessageDialog(null, "Te dhena jovalide");
				}
			}
		});
		btnLogin.setForeground(new Color(205, 133, 63));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.setBounds(66, 216, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(205, 133, 63));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(201, 216, 89, 23);
		frame.getContentPane().add(btnExit);
	}
}
