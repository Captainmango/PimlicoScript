package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Component;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pimscript extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pimscript frame = new Pimscript();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * (1275, 600, 400, 400)
	 * Create the frame.
	 */
	public Pimscript() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1275, 600, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel estissue = new JPanel();
		panel.add(estissue, "name_21689507180840");
		estissue.setLayout(null);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.add(estissue, "name_25157151358372");
			}
		});
		btnNext.setBounds(275, 318, 89, 23);
		estissue.add(btnNext);
		
		JPanel securapp = new JPanel();
		panel.add(securapp, "name_25157151358372");
		securapp.setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.add(securapp,"name_25157151358372");
			}
		});
		btnBack.setBounds(10, 318, 89, 23);
		securapp.add(btnBack);
		
		
		
	}
}
