package PetAdoption;

import java.awt.EventQueue;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainActivity extends JFrame {

	private JPanel contentPane;
	private JPasswordField password;
	private JCheckBox chckbxNewCheckBox;
	private static JLabel errorMessage;
	
	
	/**	
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainActivity frame = new MainActivity();
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
	public MainActivity() {
		setRootPaneCheckingEnabled(false);
		setLocationByPlatform(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(53, 94, 59));
		panel.setForeground(new Color(144, 238, 144));
		panel.setBounds(368, 0, 427, 571);
		contentPane.add(panel);
		panel.setLayout(null);
		
		// Labels/Texts
		JLabel Login = new JLabel("Login");
		Login.setBounds(149, 30, 66, 37);
		contentPane.add(Login);
		Login.setForeground(new Color(53, 94, 59));
		Login.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		
		JLabel text1 = new JLabel("Accessing this course requires a login,");
		text1.setForeground(Color.GRAY);
		text1.setBounds(77, 58, 233, 30);
		contentPane.add(text1);
		
		JLabel text2 = new JLabel("please enter your credentials below!");
		text2.setForeground(Color.GRAY);
		text2.setBounds(87, 73, 210, 30);
		contentPane.add(text2);
		
		JLabel Username = new JLabel("Username or Email Address");
		Username.setFont(new Font("Tahoma", Font.BOLD, 11));
		Username.setForeground(Color.DARK_GRAY);
		Username.setBounds(89, 137, 162, 30);
		contentPane.add(Username);

		JLabel Password = new JLabel("Password");
		Password.setForeground(Color.DARK_GRAY);
		Password.setFont(new Font("Tahoma", Font.BOLD, 11));
		Password.setBounds(149, 211, 60, 30);
		contentPane.add(Password);
		
		JLabel Register = new JLabel("Register");
		Register.setBounds(178, 216, 96, 37);
		panel.add(Register);
		Register.setForeground(new Color(255, 255, 255));
		Register.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 21));
		
		JLabel text5 = new JLabel("Don't have an account? Register one!");
		text5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text5.setForeground(Color.LIGHT_GRAY);
		text5.setBounds(126, 262, 251, 14);
		panel.add(text5);
		
		// Separator Field
		JSeparator separator = new JSeparator();
		separator.setBounds(98, 371, 162, 8);
		contentPane.add(separator);
		
		// Email/Number Field
		JFormattedTextField email = new JFormattedTextField();
		email.setBounds(54, 167, 245, 30);
		contentPane.add(email);

		
		// Password Field
 		password = new JPasswordField();
		password.setBounds(54, 239, 245, 30);
		contentPane.add(password);
		
		// Image Field
		ImageIcon human = new ImageIcon("C:\\Users\\19166\\Desktop\\Pet Adoption\\human.png");
		JLabel humanLabel = new JLabel(human);
		humanLabel.setBounds(28, 167, 24, 30);
		contentPane.add(humanLabel);
		
		ImageIcon lock = new ImageIcon("C:\\Users\\19166\\Desktop\\Pet Adoption\\lock.png");
		JLabel lockLabel = new JLabel(lock);
		lockLabel.setBounds(28, 239, 24, 30);
		contentPane.add(lockLabel);
		
		ImageIcon paw = new ImageIcon("C:\\Users\\19166\\Desktop\\Pet Adoption\\paw.png");
		
		// Admin Login Button Field
		JButton loginAdmin = new JButton("Log In as Admin");
		loginAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              
	}
		});
		
		loginAdmin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		loginAdmin.setForeground(new Color(255, 255, 255));
		loginAdmin.setBackground(new Color(53, 94, 59));
		loginAdmin.setBounds(98, 324, 162, 23);
		contentPane.add(loginAdmin);
		
		// Client Login Button Field
		JButton loginClient = new JButton("Log In as Client");
		loginClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = email.getText();
				String pass = password.getText();
				
                    if (user.equals("luis") && pass.equals("laguardia")) {
//                    	nextframe nextframee = new nextframe();
//                        nextframee.nextframe.setVisible(true);
              		
                    } 
                    else if (!user.equals("luis") && !pass.equals("laguardia")) {
                    	errorMessage.setText("INCORRECT USERNAME AND PASSWORD");
//                    	dispose();
                    	 JOptionPane.showMessageDialog(null, "\n Incorrect username and password\n =  =  PLEASE TRY AGAIN  =  ="); 
                    }
                    else if (!user.equals("luis")) {
                    	errorMessage.setText("INCORRECT USERNAME");
//                    	dispose();
                            JOptionPane.showMessageDialog(null, "\n Incorrect username \n =  =  PLEASE TRY AGAIN  =  =");
                            
                    }
                    else if (!pass.equals("laguardia")) {
                    	errorMessage.setText("INCORRECT PASSWORD");
//                    	dispose();
                            JOptionPane.showMessageDialog(null, "\\n Incorrect password \\n =  =  PLEASE TRY AGAIN  =  =");
                            
                    } 
				
			}
		});
		
		loginClient.setForeground(Color.WHITE);
		loginClient.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		loginClient.setBackground(new Color(53, 94, 59));
		loginClient.setBounds(98, 290, 162, 23);
		contentPane.add(loginClient);
		
		// Register Button Field
		JButton Client = new JButton("Client");
		Client.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {       
				
//				registerpage nw = new registerpage();
//    			registerpage.Registration();

			}
		});
		
		Client.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		Client.setForeground(new Color(53, 94, 59));
		Client.setBackground(new Color(255, 255, 255));
		Client.setBounds(126, 298, 205, 23);
		panel.add(Client);
		
		JButton Admin = new JButton("Admin");
		Admin.setForeground(new Color(53, 94, 59));
		Admin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		Admin.setBackground(Color.WHITE);
		Admin.setBounds(126, 332, 205, 23);
		panel.add(Admin);
                Admin.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Open AdminRegister frame
                        AdminRegister adminRegisterFrame = new AdminRegister(panel.getSize());

                        // Get the location of the current frame (MainActivity)
                        int x = getLocation().x;
                        int y = getLocation().y;

                        // Set the location of the AdminRegister frame
                        adminRegisterFrame.setLocation(x, y);

                        // Make the frame visible
                        adminRegisterFrame.setVisible(true);

                        // Close the current frame (MainActivity)
                        dispose();
                    }
                });


		
		chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBorder(new EmptyBorder(0, 0, 0, 0));
		chckbxNewCheckBox.setBounds(305, 239, 21, 30);
		contentPane.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		//		chckbxNewCheckBox.setBorder(null);
				chckbxNewCheckBox.addActionListener(new ActionListener() {
                                        @Override
					public void actionPerformed(ActionEvent e) {
						if(chckbxNewCheckBox.isSelected()) {
							password.setEchoChar((char)0);
						}else {
							password.setEchoChar('*');
						}
					}
				});
				
				chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
				
				errorMessage = new JLabel((String) null);
				errorMessage.setBounds(54, 407, 272, 30);
				contentPane.add(errorMessage);
				errorMessage.setForeground(new Color(255, 0, 0));
				errorMessage.setFont(new Font("Dialog", Font.BOLD, 12));
				errorMessage.setAlignmentX(Component.CENTER_ALIGNMENT);
				
	}
}