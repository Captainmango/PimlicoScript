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
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class Pimscript extends JFrame {
	
	private CardLayout layCard;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setAlwaysOnTop(true);
		setBounds(1275, 600, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		CardLayout layCar = new CardLayout();
			
		JPanel parentPanel = new JPanel();
		contentPane.add(parentPanel);
		parentPanel.setLayout(layCar);
		
		JPanel estissue = new JPanel();
		parentPanel.add(estissue, "name_86699244860590");
		estissue.setLayout(null);
		
		JPanel securapp = new JPanel();
		parentPanel.add(securapp, "name_86699260782335");
		securapp.setLayout(null);
		
		JPanel confbook = new JPanel();
		parentPanel.add(confbook, "name_86699302989589");
		confbook.setLayout(null);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layCar.show(parentPanel, "name_86699260782335");
			}
		});
		btnNext.setBounds(303, 318, 57, 25);
		estissue.add(btnNext);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layCar.show(parentPanel, "name_86699244860590");
			}
		});
		btnBack.setBounds(12, 318, 59, 25);
		securapp.add(btnBack);
		
		JButton btnNext_1 = new JButton("Next");
		btnNext_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layCar.show(parentPanel, "name_86699302989589");
			}
		});
		btnNext_1.setBounds(303, 318, 57, 25);
		securapp.add(btnNext_1);
		
		JButton btnBack_1 = new JButton("Back");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layCar.show(parentPanel, "name_86699260782335");
			}
		});
		btnBack_1.setBounds(12, 318, 59, 25);
		confbook.add(btnBack_1);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(287, 318, 73, 25);
		confbook.add(btnSubmit);
		
			layCar.addLayoutComponent(estissue, "name_86699244860590");
			layCar.addLayoutComponent(securapp, "name_86699260782335");
			layCar.addLayoutComponent(confbook, "name_86699302989589");
		
	}
}
