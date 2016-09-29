package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import calltracker.Pimscriptwindow;

import java.awt.CardLayout;
import java.awt.Component;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Toolkit;
import windows.Trades;
import java.awt.Font;
import java.awt.Color;

public class Pimscript extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public int i;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pimscript.class.getResource("/images/pimlico-plumbers-head-2015.png")));
		setTitle("PimlicoScript");
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
		btnNext.setBackground(Color.WHITE);
		btnNext.setFont(new Font("Dialog", Font.BOLD, 10));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layCar.show(parentPanel, "name_86699260782335");
			}
		});
		btnNext.setBounds(303, 318, 57, 25);
		estissue.add(btnNext);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(Color.WHITE);
		btnBack.setFont(new Font("Dialog", Font.BOLD, 10));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layCar.show(parentPanel, "name_86699244860590");
			}
		});
		btnBack.setBounds(12, 318, 59, 25);
		securapp.add(btnBack);
		
		JButton btnNext_1 = new JButton("Next");
		btnNext_1.setBackground(Color.WHITE);
		btnNext_1.setFont(new Font("Dialog", Font.BOLD, 10));
		btnNext_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layCar.show(parentPanel, "name_86699302989589");
			}
		});
		btnNext_1.setBounds(303, 318, 57, 25);
		securapp.add(btnNext_1);
		
		JButton btnBack_1 = new JButton("Back");
		btnBack_1.setBackground(Color.WHITE);
		btnBack_1.setFont(new Font("Dialog", Font.BOLD, 10));
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layCar.show(parentPanel, "name_86699260782335");
			}
		});
		btnBack_1.setBounds(12, 318, 59, 25);
		confbook.add(btnBack_1);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * database transaction will take place in calltracker
				 * */
				
				dispose();
				
				Pimscriptwindow frame = new Pimscriptwindow();
				frame.setVisible(true);
			}
		});
		btnSubmit.setBackground(Color.WHITE);
		btnSubmit.setFont(new Font("Dialog", Font.BOLD, 10));
		btnSubmit.setBounds(287, 318, 73, 25);
		confbook.add(btnSubmit);
		
			JComboBox comboBox = new JComboBox();
			comboBox.setBackground(Color.WHITE);
			comboBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//combobox pane switcher code
					int i = comboBox.getSelectedIndex(); 
				switch(i) {
				case 0:
					break;
				case 1:
					break;
				case 2: comboBox.setVisible(false);
					break;
				case 3: 
					break;
				case 4:
					break;
				case 5:
					break;
				case 6: 
					break;
				case 7:
					break;
				default:
					break;
				}
				}
			});
			comboBox.setModel(new DefaultComboBoxModel(Trades.values()));
			comboBox.setBounds(10, 65, 153, 20);
			estissue.add(comboBox);
			
			JTextPane greetingScript = new JTextPane();
			greetingScript.setEditable(false);
			greetingScript.setBackground(SystemColor.menu);
			greetingScript.setText("Good morning/afternoon/evening, you are through to Pimlico Plumbers. My name is *YOUR NAME*, how can I help?");
			greetingScript.setBounds(10, 11, 354, 47);
			estissue.add(greetingScript);
			
			layCar.addLayoutComponent(estissue, "name_86699244860590");
			layCar.addLayoutComponent(securapp, "name_86699260782335");
			layCar.addLayoutComponent(confbook, "name_86699302989589");
		
	}
}
