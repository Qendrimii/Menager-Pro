package GUI;

import java.awt.EventQueue;

import BackEnd.*;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Qarkullimi {
	
	public JTextPane textPane = new JTextPane();
	public JTextPane textPane_1 = new JTextPane();
	public JTextPane textPane_2 = new JTextPane();
	
	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Qarkullimi window = new Qarkullimi();
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
	public Qarkullimi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JButton btnQarkullimiDitore = new JButton("Qarkullimi ditore");
		btnQarkullimiDitore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Metodat().qarkullimiDitor();
			}
		});
		btnQarkullimiDitore.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnQarkullimiDitore.setBounds(20, 48, 159, 54);
		frame.getContentPane().add(btnQarkullimiDitore);
		
		JButton btnQarkullimiJavor = new JButton("Qarkullimi javor");
		btnQarkullimiJavor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnQarkullimiJavor.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnQarkullimiJavor.setBounds(20, 127, 159, 54);
		frame.getContentPane().add(btnQarkullimiJavor);
		
		JButton btnQarkullimiMujor = new JButton("Qarkullimi mujor");
		btnQarkullimiMujor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Metodat().qarkullimiMujor();
			}
		});
		btnQarkullimiMujor.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnQarkullimiMujor.setBounds(20, 203, 159, 47);
		frame.getContentPane().add(btnQarkullimiMujor);
		
		JLabel lblQarkullimi = new JLabel("Qarkullimi");
		lblQarkullimi.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblQarkullimi.setBounds(121, 11, 202, 26);
		frame.getContentPane().add(lblQarkullimi);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textPane.setBounds(223, 48, 124, 54);
		frame.getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textPane_1.setBounds(223, 127, 124, 54);
		frame.getContentPane().add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textPane_2.setBounds(223, 203, 124, 47);
		frame.getContentPane().add(textPane_2);
	}
}
