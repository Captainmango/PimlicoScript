import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Login {

	private JFrame frame;
	private JTextField textFieldUserName;
	private JPasswordField passwordField;
	private JTextField textFieldExtNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 535, 346);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldUserName = new JTextField();
		textFieldUserName.setBounds(132, 38, 127, 22);
		frame.getContentPane().add(textFieldUserName);
		textFieldUserName.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(132, 97, 127, 22);
		frame.getContentPane().add(passwordField);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(32, 41, 88, 16);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(32, 100, 56, 16);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblExtNumber = new JLabel("Ext. number");
		lblExtNumber.setBounds(32, 159, 88, 16);
		frame.getContentPane().add(lblExtNumber);
		
		textFieldExtNumber = new JTextField();
		textFieldExtNumber.setBounds(132, 156, 127, 22);
		frame.getContentPane().add(textFieldExtNumber);
		textFieldExtNumber.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBounds(132, 240, 97, 25);
		frame.getContentPane().add(btnLogin);
	}
}
