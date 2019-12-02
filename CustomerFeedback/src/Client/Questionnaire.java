package Client;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
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
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JSlider;
import javax.swing.JRadioButton;

public class Questionnaire extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8835932636071951701L;
	private JPanel contentPane;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questionnaire frame = new Questionnaire();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
					frame.setUndecorated(true);
					frame.setVisible(true);
				
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
	public Questionnaire() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1829, 1190);
		contentPane = new JPanel();
		contentPane.setLocation(-175, -691);
		contentPane.setBackground(new Color(56, 132, 242));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Food");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 15));
		lblNewLabel.setBounds(169, 174, 675, 35);
		contentPane.add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setMinimumSize(new Dimension(5, 0));
		separator_1.setAlignmentY(0.0f);
		separator_1.setAlignmentX(1.0f);
		separator_1.setBounds(169, 406, 676, 25);
		contentPane.add(separator_1);
		
		JButton btnNewButton = new JButton("Submit");
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
		btnNewButton.setBounds(965, 967, 210, 64);
		contentPane.add(btnNewButton);
		
		JLabel lblAdminLogin = new JLabel("Rate the following aspects of the restaurant on a scale of 1 to 10");
		lblAdminLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminLogin.setForeground(Color.WHITE);
		lblAdminLogin.setFont(new Font("Roboto", Font.BOLD, 16));
		lblAdminLogin.setBounds(574, 117, 700, 35);
		contentPane.add(lblAdminLogin);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(175, 702, 670, 14);
		contentPane.add(separator_3);
		
		JLabel lblEnterTheUsername = new JLabel("5-Excellent  4-Very Good  3-Average  2-Below Average  1-Poor");
		lblEnterTheUsername.setHorizontalAlignment(SwingConstants.LEFT);
		lblEnterTheUsername.setForeground(Color.WHITE);
		lblEnterTheUsername.setFont(new Font("Roboto", Font.BOLD, 12));
		lblEnterTheUsername.setBounds(758, 142, 359, 14);
		contentPane.add(lblEnterTheUsername);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Questionnaire.class.getResource("/Images/logo.png")));
		lblNewLabel_1.setBounds(845, 11, 158, 109);
		contentPane.add(lblNewLabel_1);
		
		JSlider slider = new JSlider();
		slider.setMaximum(5);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(1);
		slider.setBounds(284, 220, 560, 35);
		contentPane.add(slider);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(169, 206, 675, 2);
		contentPane.add(separator_2);
		
		JLabel lblNewLabel_2 = new JLabel("Taste");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Roboto", Font.BOLD, 11));
		lblNewLabel_2.setBounds(179, 220, 127, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblValueForMoney = new JLabel("Value for Money");
		lblValueForMoney.setForeground(Color.WHITE);
		lblValueForMoney.setFont(new Font("Roboto", Font.BOLD, 11));
		lblValueForMoney.setBounds(179, 266, 127, 25);
		contentPane.add(lblValueForMoney);
		
		JSlider slider_1 = new JSlider();
		slider_1.setPaintLabels(true);
		slider_1.setMaximum(5);
		slider_1.setMajorTickSpacing(1);
		slider_1.setBounds(284, 266, 560, 35);
		contentPane.add(slider_1);
		
		JLabel lblTemperature = new JLabel("Temperature");
		lblTemperature.setForeground(Color.WHITE);
		lblTemperature.setFont(new Font("Roboto", Font.BOLD, 11));
		lblTemperature.setBounds(179, 306, 127, 25);
		contentPane.add(lblTemperature);
		
		JSlider slider_2 = new JSlider();
		slider_2.setPaintLabels(true);
		slider_2.setMaximum(5);
		slider_2.setMajorTickSpacing(1);
		slider_2.setBounds(284, 312, 560, 35);
		contentPane.add(slider_2);
		
		JLabel lblCustomerService = new JLabel("Ambiance");
		lblCustomerService.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomerService.setForeground(Color.WHITE);
		lblCustomerService.setFont(new Font("Roboto", Font.BOLD, 15));
		lblCustomerService.setBounds(169, 376, 675, 35);
		contentPane.add(lblCustomerService);
		
		JLabel lblCleanliness = new JLabel("Cleanliness");
		lblCleanliness.setForeground(Color.WHITE);
		lblCleanliness.setFont(new Font("Roboto", Font.BOLD, 11));
		lblCleanliness.setBounds(179, 422, 127, 25);
		contentPane.add(lblCleanliness);
		
		JSlider slider_3 = new JSlider();
		slider_3.setPaintLabels(true);
		slider_3.setMaximum(5);
		slider_3.setMajorTickSpacing(1);
		slider_3.setBounds(284, 422, 560, 35);
		contentPane.add(slider_3);
		
		JLabel lblLighting = new JLabel("Lighting");
		lblLighting.setForeground(Color.WHITE);
		lblLighting.setFont(new Font("Roboto", Font.BOLD, 11));
		lblLighting.setBounds(179, 468, 127, 25);
		contentPane.add(lblLighting);
		
		JSlider slider_4 = new JSlider();
		slider_4.setPaintLabels(true);
		slider_4.setMaximum(5);
		slider_4.setMajorTickSpacing(1);
		slider_4.setBounds(284, 468, 560, 35);
		contentPane.add(slider_4);
		
		JLabel lblComfort = new JLabel("Comfort");
		lblComfort.setForeground(Color.WHITE);
		lblComfort.setFont(new Font("Roboto", Font.BOLD, 11));
		lblComfort.setBounds(179, 508, 127, 25);
		contentPane.add(lblComfort);
		
		JSlider slider_5 = new JSlider();
		slider_5.setPaintLabels(true);
		slider_5.setMaximum(5);
		slider_5.setMajorTickSpacing(1);
		slider_5.setBounds(284, 514, 560, 35);
		contentPane.add(slider_5);
		
		JLabel lblMusic = new JLabel("Music");
		lblMusic.setForeground(Color.WHITE);
		lblMusic.setFont(new Font("Roboto", Font.BOLD, 11));
		lblMusic.setBounds(179, 556, 127, 25);
		contentPane.add(lblMusic);
		
		JSlider slider_6 = new JSlider();
		slider_6.setPaintLabels(true);
		slider_6.setMaximum(5);
		slider_6.setMajorTickSpacing(1);
		slider_6.setBounds(284, 562, 560, 35);
		contentPane.add(slider_6);
		
		JLabel lblSpeedOfService = new JLabel("Speed of Service");
		lblSpeedOfService.setForeground(Color.WHITE);
		lblSpeedOfService.setFont(new Font("Roboto", Font.BOLD, 11));
		lblSpeedOfService.setBounds(180, 715, 127, 25);
		contentPane.add(lblSpeedOfService);
		
		JLabel lblQualityOfService = new JLabel("Quality of Service");
		lblQualityOfService.setForeground(Color.WHITE);
		lblQualityOfService.setFont(new Font("Roboto", Font.BOLD, 11));
		lblQualityOfService.setBounds(180, 761, 127, 25);
		contentPane.add(lblQualityOfService);
		
		JLabel lblKnowledge = new JLabel("Knowledge");
		lblKnowledge.setForeground(Color.WHITE);
		lblKnowledge.setFont(new Font("Roboto", Font.BOLD, 11));
		lblKnowledge.setBounds(180, 801, 127, 25);
		contentPane.add(lblKnowledge);
		
		JSlider slider_7 = new JSlider();
		slider_7.setPaintLabels(true);
		slider_7.setMaximum(5);
		slider_7.setMajorTickSpacing(1);
		slider_7.setBounds(285, 715, 560, 35);
		contentPane.add(slider_7);
		
		JSlider slider_8 = new JSlider();
		slider_8.setPaintLabels(true);
		slider_8.setMaximum(5);
		slider_8.setMajorTickSpacing(1);
		slider_8.setBounds(285, 761, 560, 35);
		contentPane.add(slider_8);
		
		JSlider slider_9 = new JSlider();
		slider_9.setPaintLabels(true);
		slider_9.setMaximum(5);
		slider_9.setMajorTickSpacing(1);
		slider_9.setBounds(285, 807, 560, 35);
		contentPane.add(slider_9);
		
		JLabel lblCustomerService_1 = new JLabel("Customer Service");
		lblCustomerService_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomerService_1.setForeground(Color.WHITE);
		lblCustomerService_1.setFont(new Font("Roboto", Font.BOLD, 15));
		lblCustomerService_1.setBounds(169, 661, 675, 35);
		contentPane.add(lblCustomerService_1);
		
		Border border = BorderFactory.createLineBorder(Color.white, 1);
		
		ButtonGroup visitedTimesGroup = new ButtonGroup();
		
		Border border2 = BorderFactory.createLineBorder(Color.white, 1);
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(border2);
		panel_1.setLayout(null);
		panel_1.setBackground((Color) null);
		panel_1.setBounds(1262, 456, 446, 131);
		contentPane.add(panel_1);
		
		JRadioButton rdbtnLikely = new JRadioButton("Likely");
		rdbtnLikely.setBackground((Color) null);
		rdbtnLikely.setBounds(16, 7, 109, 23);
		panel_1.add(rdbtnLikely);
		
		JRadioButton rdbtnHighlyLikely = new JRadioButton("Highly Likely");
		rdbtnHighlyLikely.setBackground((Color) null);
		rdbtnHighlyLikely.setBounds(16, 39, 109, 23);
		panel_1.add(rdbtnHighlyLikely);
		
		JRadioButton rdbtnUnlikely = new JRadioButton("Unlikely");
		rdbtnUnlikely.setBackground((Color) null);
		rdbtnUnlikely.setBounds(16, 68, 109, 23);
		panel_1.add(rdbtnUnlikely);
		
		JRadioButton rdbtnSomewhatLikely = new JRadioButton("Somewhat Likely");
		rdbtnSomewhatLikely.setBackground((Color) null);
		rdbtnSomewhatLikely.setBounds(16, 98, 170, 23);
		panel_1.add(rdbtnSomewhatLikely);
		
		JLabel lblHowLikelyWould = new JLabel("How likely would you be to recommend us to a friend?");
		lblHowLikelyWould.setHorizontalAlignment(SwingConstants.LEFT);
		lblHowLikelyWould.setForeground(Color.WHITE);
		lblHowLikelyWould.setFont(new Font("Roboto", Font.BOLD, 15));
		lblHowLikelyWould.setBounds(1264, 419, 398, 18);
		contentPane.add(lblHowLikelyWould);
		
		JLabel lblHowDidYou = new JLabel("How did you hear about the restaurant?");
		lblHowDidYou.setHorizontalAlignment(SwingConstants.LEFT);
		lblHowDidYou.setForeground(Color.WHITE);
		lblHowDidYou.setFont(new Font("Roboto", Font.BOLD, 15));
		lblHowDidYou.setBounds(1263, 688, 308, 18);
		contentPane.add(lblHowDidYou);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(border2);
		panel_2.setLayout(null);
		panel_2.setBackground((Color) null);
		panel_2.setBounds(1263, 722, 446, 131);
		contentPane.add(panel_2);
		
		JRadioButton rdbtnNewspaper = new JRadioButton("Newspaper");
		rdbtnNewspaper.setBackground((Color) null);
		rdbtnNewspaper.setBounds(16, 7, 109, 23);
		panel_2.add(rdbtnNewspaper);
		
		JRadioButton rdbtnAnotherWebsite = new JRadioButton("Another Website");
		rdbtnAnotherWebsite.setBackground((Color) null);
		rdbtnAnotherWebsite.setBounds(16, 39, 252, 23);
		panel_2.add(rdbtnAnotherWebsite);
		
		JRadioButton rdbtnSocialMedia = new JRadioButton("Social Media");
		rdbtnSocialMedia.setBackground((Color) null);
		rdbtnSocialMedia.setBounds(16, 68, 109, 23);
		panel_2.add(rdbtnSocialMedia);
		
		JRadioButton rdbtnFriendly = new JRadioButton("Friendly");
		rdbtnFriendly.setBackground((Color) null);
		rdbtnFriendly.setBounds(16, 98, 109, 23);
		panel_2.add(rdbtnFriendly);
		
		Border border3 = BorderFactory.createLineBorder(Color.white, 1);	
		JPanel panel = new JPanel();
		panel.setBorder(border3);
		panel.setLayout(null);
		panel.setBackground((Color) null);
		panel.setBounds(1262, 239, 446, 131);
		contentPane.add(panel);
		
		JRadioButton radioButton = new JRadioButton("Weekly");
		radioButton.setBackground((Color) null);
		radioButton.setBounds(16, 7, 109, 23);
		panel.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Monthly");
		radioButton_1.setBackground((Color) null);
		radioButton_1.setBounds(16, 39, 109, 23);
		panel.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Daily");
		radioButton_2.setBackground((Color) null);
		radioButton_2.setBounds(16, 68, 109, 23);
		panel.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("First Time");
		radioButton_3.setBackground((Color) null);
		radioButton_3.setBounds(16, 98, 109, 23);
		panel.add(radioButton_3);
		
		JLabel label = new JLabel("How often do you dine with us?");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Roboto", Font.BOLD, 15));
		label.setBounds(1263, 210, 207, 18);
		contentPane.add(label);
	}
}
