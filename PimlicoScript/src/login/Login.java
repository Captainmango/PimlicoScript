package login;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Color;

public class Login extends Loginset{

	private JFrame Loginwindow;
	private JTextField textFieldUserName;
	private JPasswordField passwordField;
	private JTextField textFieldExtNumber;
	protected boolean succeeded;
	private JButton clearButton;

	/**
	 * Launch the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	

	
	private void initialize() {
		Loginwindow = new JFrame();
		Loginwindow.setBackground(Color.WHITE);
		Loginwindow.setTitle("Pimlico Script");
		Loginwindow.setBounds(100, 100, 326, 354);
		Loginwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Loginwindow.getContentPane().setLayout(null);
		
		textFieldUserName = new JTextField();
		textFieldUserName.setBounds(132, 38, 127, 22);
		Loginwindow.getContentPane().add(textFieldUserName);
		textFieldUserName.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(132, 97, 127, 22);
		Loginwindow.getContentPane().add(passwordField);
		
		textFieldExtNumber = new JTextField();
		textFieldExtNumber.setToolTipText("");
		textFieldExtNumber.setBounds(132, 156, 127, 22);
		Loginwindow.getContentPane().add(textFieldExtNumber);
		textFieldExtNumber.setColumns(10);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(32, 41, 88, 16);
		Loginwindow.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(32, 100, 56, 16);
		Loginwindow.getContentPane().add(lblPassword);
		
		JLabel lblExtNumber = new JLabel("Ext. number");
		lblExtNumber.setBounds(32, 159, 88, 16);
		Loginwindow.getContentPane().add(lblExtNumber);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Loginset.authenticate(getUsername(), getPassword())) {
					JOptionPane.showMessageDialog(btnLogin, (Login.this),
							"Hi " + getUsername() + " You have successfully logged in.",
                            JOptionPane.INFORMATION_MESSAGE);
                    succeeded = true;
                    
              
				} else {
					dispose();
                    JOptionPane.showMessageDialog(btnLogin, Login.this,
                            "Invalid username or password", 0);
                    
                    textFieldUserName.setText("");
                    passwordField.setText("");
                    succeeded = false;
				}
			}
		});
		btnLogin.setBounds(132, 221, 97, 25);
		Loginwindow.getContentPane().add(btnLogin);
		
		clearButton = new JButton("CLEAR");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		clearButton.setBounds(132, 257, 97, 25);
		Loginwindow.getContentPane().add(clearButton);
		Loginwindow.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{Loginwindow.getContentPane(), textFieldUserName, passwordField, textFieldExtNumber, lblUsername, lblPassword, lblExtNumber, btnLogin}));
		
                        }
	
	protected void dispose() {
		 JOptionPane.showMessageDialog(clearButton, Login.this,
                 "Invalid username or password", 0);
         
         textFieldUserName.setText("");
         passwordField.setText("");
         succeeded = false;
		}
		

	public String getUsername() {
        return textFieldUserName.getText().trim();
    }
 
    public String getPassword() {
        return new String(passwordField.getPassword());
    }
 
    public boolean isSucceeded() {
        return succeeded;
    }
/*
 * Created launch app
 */
	public void setVisible(boolean b) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Login window = new Login();
						window.Loginwindow.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}}
		
	

	
		
	

	

