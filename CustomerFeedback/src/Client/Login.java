package Client;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8835932636071951701L;
	private JPanel contentPane;
	private JTextField usernameTxt;
	private JPasswordField passwordField;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1212, 782);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(56, 132, 242));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 591, 743);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Login.class.getResource("/Images/clip-sign-in.png")));
		label.setBounds(-205, 9, 797, 762);
		panel.add(label);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 20));
		lblNewLabel.setBounds(648, 284, 460, 35);
		contentPane.add(lblNewLabel);
		
		
		usernameTxt = new JTextField();
		usernameTxt.setBorder(null);
		usernameTxt.setBounds(648, 323, 460, 30);
		contentPane.add(usernameTxt);
		usernameTxt.setColumns(10);
		usernameTxt.setBackground(null);
		
		JSeparator separator = new JSeparator();
		separator.setAlignmentY(Component.TOP_ALIGNMENT);
		separator.setAlignmentX(Component.RIGHT_ALIGNMENT);
		separator.setMinimumSize(new Dimension(5, 0));
		separator.setBounds(648, 352, 460, 14);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setMinimumSize(new Dimension(5, 0));
		separator_1.setAlignmentY(0.0f);
		separator_1.setAlignmentX(1.0f);
		separator_1.setBounds(648, 456, 460, 25);
		contentPane.add(separator_1);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Roboto", Font.BOLD, 20));
		lblPassword.setBounds(648, 388, 460, 35);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Roboto", Font.BOLD, 20));
		passwordField.setBorder(null);
		passwordField.setBounds(648, 436, 460, 20);
		passwordField.setBackground(null);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBackground(new Color(149, 189, 250));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setOpaque(true);
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Roboto", Font.BOLD, 20));
		btnNewButton.setBounds(789, 507, 210, 64);
		contentPane.add(btnNewButton);
		
		JLabel lblAdminLogin = new JLabel("Admin Login");
		lblAdminLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminLogin.setForeground(Color.WHITE);
		lblAdminLogin.setFont(new Font("Roboto", Font.BOLD, 54));
		lblAdminLogin.setBounds(601, 140, 575, 64);
		contentPane.add(lblAdminLogin);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(734, 711, 347, 14);
		contentPane.add(separator_3);
		
		JLabel lblEnterTheUsername = new JLabel("Enter the username and password provided by your administrator");
		lblEnterTheUsername.setHorizontalAlignment(SwingConstants.LEFT);
		lblEnterTheUsername.setForeground(Color.WHITE);
		lblEnterTheUsername.setFont(new Font("Roboto", Font.BOLD, 12));
		lblEnterTheUsername.setBounds(734, 686, 359, 14);
		contentPane.add(lblEnterTheUsername);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/Images/logo.png")));
		lblNewLabel_1.setBounds(810, 22, 158, 109);
		contentPane.add(lblNewLabel_1);
	}
}
