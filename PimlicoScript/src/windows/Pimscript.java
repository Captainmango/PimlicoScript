package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import calltracker.Pimscriptwindow;
import windows.TradeDescriptions;

import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Toolkit;
import windows.Trades;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JTextField;



public class Pimscript extends JFrame {
	

	/**
	
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public int i;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
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
		
		CardLayout cl_parentPanelTrades = new CardLayout();
		CardLayout layCar = new CardLayout();
			
		JPanel parentPanel = new JPanel();
		contentPane.add(parentPanel);
		parentPanel.setLayout(layCar);
		
		//panels for pimscript
		
		JPanel estissue = new JPanel();
		parentPanel.add(estissue, "name_86699244860590");
		estissue.setLayout(null);
			
			JPanel parentPanelTrades = new JPanel();
			parentPanelTrades.setBounds(10, 97, 352, 211);
			estissue.add(parentPanelTrades);
			parentPanelTrades.setLayout(cl_parentPanelTrades);
			parentPanelTrades.setVisible(false);
			
			JPanel selectTrade = new JPanel();
			selectTrade.setToolTipText("Select Trade");
			parentPanelTrades.add(selectTrade, "name_14669057642524");
			selectTrade.setLayout(null);
			
			JPanel plumbing = new JPanel();
			parentPanelTrades.add(plumbing, "name_13806618197554");
			plumbing.setLayout(null);
			
			JLabel lblPlumbingPrice = new JLabel("Plumbing Price");
			lblPlumbingPrice.setBounds(0, 0, 93, 26);
			plumbing.add(lblPlumbingPrice); 
		
			JPanel roofing = new JPanel();
			parentPanelTrades.add(roofing, "name_2686653938219");
			roofing.setLayout(null);
			
			JLabel lblRoofingPrice = new JLabel("Roofing Price");
			lblRoofingPrice.setBounds(0, 0, 89, 16);
			roofing.add(lblRoofingPrice);
		
			JPanel electrics = new JPanel();
			parentPanelTrades.add(electrics, "name_2686661629408");
			electrics.setLayout(null);
			
			JLabel lblElectricianPrice = new JLabel("Electrician Price");
			lblElectricianPrice.setBounds(0, 0, 108, 23);
			electrics.add(lblElectricianPrice);
		
			JPanel appliances = new JPanel();
			parentPanelTrades.add(appliances, "name_2686669630886");
			appliances.setLayout(null);
			
			JLabel lblAppliancesPrice = new JLabel("Appliances Price");
			lblAppliancesPrice.setBounds(0, 0, 104, 28);
			appliances.add(lblAppliancesPrice);
		
			JPanel carpentry = new JPanel();
			parentPanelTrades.add(carpentry, "name_2686677953600");
			carpentry.setLayout(null);
			
			JLabel lblCarpenterPrice = new JLabel("Carpenter Price");
			lblCarpenterPrice.setBounds(0, 0, 109, 28);
			carpentry.add(lblCarpenterPrice);
		
			JPanel heating = new JPanel();
			parentPanelTrades.add(heating, "name_2686686099446");
			heating.setLayout(null);
			
			JLabel lblHeatingPrice = new JLabel("Heating Price");
			lblHeatingPrice.setBounds(0, 0, 113, 26);
			heating.add(lblHeatingPrice);
			
			JPanel drainage = new JPanel();
			parentPanelTrades.add(drainage, "name_2686694701317");
			drainage.setLayout(null);
			
			JLabel lblDrainagePrice = new JLabel("Drainage Price");
			lblDrainagePrice.setBounds(0, 0, 114, 26);
			drainage.add(lblDrainagePrice);
		
			JPanel building = new JPanel();
			parentPanelTrades.add(building, "name_2686703446872");
			building.setLayout(null);
			
			JLabel lblBuildingPrice = new JLabel("Building Price");
			lblBuildingPrice.setBounds(0, 0, 118, 28);
			building.add(lblBuildingPrice);
			
			JPanel other = new JPanel();
			parentPanelTrades.add(other, "name_17527498714889");
			other.setLayout(null);	
		
		JPanel securapp = new JPanel();
		parentPanel.add(securapp, "name_86699260782335");
		securapp.setLayout(null);
		
		JPanel confbook = new JPanel();
		parentPanel.add(confbook, "name_86699302989589");
		confbook.setLayout(null);
			
			JPanel cardDetails = new JPanel();
			cardDetails.setBounds(12, 179, 350, 115);
			confbook.add(cardDetails);
			cardDetails.setLayout(null);
			
				JToggleButton Hide = new JToggleButton("Hide\r\n");
				Hide.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if(Hide.isSelected()){ cardDetails.setVisible(false);
						}else{cardDetails.setVisible(true);
						}
					}
				});
				Hide.setBackground(Color.WHITE);
				Hide.setBounds(12, 150, 59, 17);
				confbook.add(Hide);
				
				JLabel lblAccountNumber = new JLabel("Account Number");
				lblAccountNumber.setBounds(12, 12, 95, 16);
				cardDetails.add(lblAccountNumber);
			
				JLabel lblSortCode = new JLabel("Sort Code");
				lblSortCode.setBounds(12, 40, 95, 16);
				cardDetails.add(lblSortCode);
			
				JLabel lblCsc = new JLabel("CSC");
				lblCsc.setBounds(12, 68, 95, 16);
				cardDetails.add(lblCsc);
			
				textField = new JTextField();
				textField.setBounds(125, 10, 213, 20);
				cardDetails.add(textField);
				textField.setColumns(10);
			
				textField_1 = new JTextField();
				textField_1.setBounds(125, 38, 103, 20);
				cardDetails.add(textField_1);
				textField_1.setColumns(10);
			
				textField_2 = new JTextField();
				textField_2.setBounds(125, 66, 57, 20);
				cardDetails.add(textField_2);
				textField_2.setColumns(10);
			
				//end of panels 
				//start of buttons
		
		JButton btnNext = new JButton("Next");
		btnNext.setBackground(Color.WHITE);
		btnNext.setFont(new Font("Dialog", Font.BOLD, 10));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layCar.show(parentPanel, "name_86699260782335");
				parentPanelTrades.setVisible(false);
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
		
		//end of buttons
		
			JComboBox comboBox = new JComboBox();
			comboBox.setToolTipText("Select Trade");
			comboBox.setBackground(Color.WHITE);
			comboBox.setSelectedIndex(-1);
			
			String _title = "Select Trade";
			
			
			comboBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//combobox pane switcher code
					int i = comboBox.getSelectedIndex(); 
				switch(i) {
				case 0: parentPanelTrades.setVisible(true);
						cl_parentPanelTrades.show(parentPanelTrades, "name_2686644518376");
					break;
				case 1: parentPanelTrades.setVisible(true);
						cl_parentPanelTrades.show(parentPanelTrades, "name_2686653938219");
					break;
				case 2: parentPanelTrades.setVisible(true);
						cl_parentPanelTrades.show(parentPanelTrades, "name_2686661629408");
					break;
				case 3: parentPanelTrades.setVisible(true);
						cl_parentPanelTrades.show(parentPanelTrades, "name_2686669630886");
					break;
				case 4: parentPanelTrades.setVisible(true);
						cl_parentPanelTrades.show(parentPanelTrades, "name_2686677953600");
					break;
				case 5: parentPanelTrades.setVisible(true);
						cl_parentPanelTrades.show(parentPanelTrades, "name_2686686099446");
					break;
				case 6: parentPanelTrades.setVisible(true);
						cl_parentPanelTrades.show(parentPanelTrades, "name_2686694701317");
					break;
				case 7: parentPanelTrades.setVisible(true);
						cl_parentPanelTrades.show(parentPanelTrades, "name_2686703446872");
					break;
				default: parentPanelTrades.setVisible(true);
						cl_parentPanelTrades.show(parentPanelTrades, "name_17527498714889");
					break;
				}
				}
			});
			comboBox.setModel(new DefaultComboBoxModel(Trades.values()));
			comboBox.setBounds(10, 65, 153, 20);
			estissue.add(comboBox);
			
			//start of scripts
			
			JTextPane greetingScript = new JTextPane();
			greetingScript.setEditable(false);
			greetingScript.setBackground(SystemColor.menu);
			greetingScript.setText("Good morning/afternoon/evening, you are through to Pimlico Plumbers. My name is *YOUR NAME*, how can I help?");
			greetingScript.setBounds(10, 11, 354, 47);
			estissue.add(greetingScript);
			
			JLabel lblGetAdviseFrom = new JLabel("Get advise from manager/ get more info");
			lblGetAdviseFrom.setBounds(0, 0, 234, 16);
			other.add(lblGetAdviseFrom);
			
			//card layout assignments
				
				cl_parentPanelTrades.addLayoutComponent(selectTrade, "name_14669057642524");
				cl_parentPanelTrades.addLayoutComponent(plumbing, "name_2686644518376"); //plumbing
				cl_parentPanelTrades.addLayoutComponent(roofing, "name_2686653938219"); //roofing
				cl_parentPanelTrades.addLayoutComponent(electrics, "name_2686661629408"); //electrics
				cl_parentPanelTrades.addLayoutComponent(appliances, "name_2686669630886"); //appliances
				cl_parentPanelTrades.addLayoutComponent(carpentry, "name_2686677953600"); //carpentry
				cl_parentPanelTrades.addLayoutComponent(heating, "name_2686686099446"); //heating
				cl_parentPanelTrades.addLayoutComponent(drainage, "name_2686694701317"); //drainage
				cl_parentPanelTrades.addLayoutComponent(building, "name_2686703446872"); //building
				cl_parentPanelTrades.addLayoutComponent(other, "name_17527498714889");
				
			layCar.addLayoutComponent(estissue, "name_86699244860590"); //establish issue phase	
			layCar.addLayoutComponent(securapp, "name_86699260782335"); //securing appointment phase
			layCar.addLayoutComponent(confbook, "name_86699302989589"); // confirming booking phase
			
			
		
	}
}
