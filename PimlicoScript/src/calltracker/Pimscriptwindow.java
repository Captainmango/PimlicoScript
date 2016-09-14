package calltracker;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;


public class Pimscriptwindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pimscriptwindow frame = new Pimscriptwindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * Frame bounds for finished program (1060, 600, 600, 1000)
	 * Current bounds for call tagger (1275, 600, 400, 400)
	 */
	
	public Pimscriptwindow() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1275, 600, 400, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setForeground(new Color(0, 0, 0));
		btnNext.setBackground(Color.WHITE);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNext.setBounds(285, 328, 89, 23);
		contentPane.add(btnNext);
		
		JComboBox callTags = new JComboBox();
		callTags.setModel(new DefaultComboBoxModel(new String[] {"Job Booking", "Diver Update", "Sales", "Complaint", "Engineer Call"}));
		callTags.setBounds(10, 125, 251, 23);
		contentPane.add(callTags);
		
		JTextPane txtpnLabelTheCall = new JTextPane();
		txtpnLabelTheCall.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnLabelTheCall.setForeground(new Color(0, 0, 0));
		txtpnLabelTheCall.setBackground(new Color(176, 224, 230));
		txtpnLabelTheCall.setEditable(false);
		txtpnLabelTheCall.setText("Label the call with a reason from the drop down box?");
		txtpnLabelTheCall.setBounds(10, 11, 280, 56);
		contentPane.add(txtpnLabelTheCall);
		
		
		
	}
}
