package calltracker;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import windows.Pimscript;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import windows.Trades;
import javax.swing.JToggleButton;


public class Pimscriptwindow extends JFrame {
//  call reasons("Job booking", "Complaint", "Engineer call", "Job update", "Enquiry", "Other")
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
		setTitle("Call Tracker");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pimscriptwindow.class.getResource("/images/pimlico-plumbers-head-2015.png")));
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1275, 600, 400, 187);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*
				 * Put sql statement here for database transaction.
				 * */
				
				dispose();
			Pimscript frame = new Pimscript();
			frame.setVisible(true);
			}
		});
		btnSubmit.setForeground(new Color(0, 0, 0));
		btnSubmit.setBackground(Color.WHITE);
		btnSubmit.setBounds(285, 115, 89, 23);
		contentPane.add(btnSubmit);
		
		JComboBox callTags = new JComboBox();
		callTags.setBackground(Color.WHITE);
		callTags.setModel(new DefaultComboBoxModel(Trades.values()));
		callTags.setBounds(10, 78, 128, 23);
		contentPane.add(callTags);
		
		JTextPane txtpnLabelTheCall = new JTextPane();
		txtpnLabelTheCall.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtpnLabelTheCall.setForeground(new Color(0, 0, 0));
		txtpnLabelTheCall.setBackground(new Color(176, 224, 230));
		txtpnLabelTheCall.setEditable(false);
		txtpnLabelTheCall.setText("Label the call with a reason from the drop down box?");
		txtpnLabelTheCall.setBounds(10, 11, 251, 56);
		contentPane.add(txtpnLabelTheCall);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Pimscriptwindow.class.getResource("/images/pimlico-plumbers-head-2015 small.png")));
		lblNewLabel.setBounds(271, 11, 113, 56);
		contentPane.add(lblNewLabel);
		
		JComboBox callReason = new JComboBox();
		callReason.setBackground(Color.WHITE);
		callReason.setBounds(10, 115, 128, 23);
		contentPane.add(callReason);
		
		
		
	}
}
