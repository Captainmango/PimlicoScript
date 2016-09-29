package login;
import java.awt.EventQueue;
import java.awt.Toolkit;

import login.Main;
import javax.swing.JFrame;
import javax.swing.AbstractAction;
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
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import windows.Pimscript;

import java.awt.Component;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Dialog.ModalExclusionType;

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
	 * Initialise the contents of the frame.
	 */
	

	
	private void initialize() {
		Loginwindow = new JFrame();
		Loginwindow.setForeground(Color.WHITE);
		Loginwindow.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/images/pimlico-plumbers-head-2015.png")));
		Loginwindow.setResizable(false);
		Loginwindow.setAlwaysOnTop(true);
		Loginwindow.setAutoRequestFocus(false);
	
		Loginwindow.setBackground(Color.WHITE);
		Loginwindow.setTitle("PimlicoScript");
		Loginwindow.setBounds(100, 100, 326, 354);
		Loginwindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		lblPassword.setBounds(32, 100, 90, 16);
		Loginwindow.getContentPane().add(lblPassword);
		
		JLabel lblExtNumber = new JLabel("Ext. number");
		lblExtNumber.setBounds(32, 159, 88, 16);
		Loginwindow.getContentPane().add(lblExtNumber);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(Color.WHITE);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Loginset.authenticate(getUsername(), getPassword())) {
					JOptionPane.showMessageDialog(btnLogin, "Hi " + getUsername() + " You have successfully logged in."
							,"Login Successful",JOptionPane.INFORMATION_MESSAGE);
                    succeeded = true;
                    
                    Pimscript PimDlg = new Pimscript();
    				PimDlg.setVisible(true);
    				
    				Loginwindow.setVisible(false);
				} else {
					getRid();
					
					
				}
			}
		});
		btnLogin.setBounds(132, 221, 97, 25);
		Loginwindow.getContentPane().add(btnLogin);
		
		clearButton = new JButton("CLEAR");
		clearButton.setBackground(Color.WHITE);
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textFieldUserName.setText("");
			passwordField.setText("");
			textFieldExtNumber.setText("");
			}
		});
		clearButton.setBounds(132, 257, 97, 25);
		Loginwindow.getContentPane().add(clearButton);
		
		
		//Loginwindow.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{Loginwindow.getContentPane(), textFieldUserName, passwordField, textFieldExtNumber, lblUsername, lblPassword, clearButton, btnLogin}));
		
                        }
	
	private void getRid() {
		 JOptionPane.showMessageDialog(clearButton, "Invalid username or password",
                 "Login Failed", 0);
         
         textFieldUserName.setText("");
         passwordField.setText("");
         textFieldExtNumber.setText("");
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
 *Launch application
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
		
	

	
		
	

	

