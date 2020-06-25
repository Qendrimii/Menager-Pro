package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class ShitjaEPijeve {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShitjaEPijeve window = new ShitjaEPijeve();
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
	public ShitjaEPijeve() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblShitjaEPijeve = new JLabel("Shitja e Pijeve");
		lblShitjaEPijeve.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblShitjaEPijeve.setBounds(132, 11, 202, 26);
		frame.getContentPane().add(lblShitjaEPijeve);
		
		JButton btnShitjaDitore = new JButton("Shitja ditore");
		btnShitjaDitore.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnShitjaDitore.setBounds(31, 48, 134, 54);
		frame.getContentPane().add(btnShitjaDitore);
		
		JButton btnShitjaJavore = new JButton("Shitja javore");
		btnShitjaJavore.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnShitjaJavore.setBounds(31, 127, 134, 54);
		frame.getContentPane().add(btnShitjaJavore);
		
		JButton btnShitjaMujore = new JButton("Shitja mujore");
		btnShitjaMujore.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnShitjaMujore.setBounds(31, 203, 134, 47);
		frame.getContentPane().add(btnShitjaMujore);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textPane.setBounds(190, 48, 234, 202);
		frame.getContentPane().add(textPane);
	}
}
