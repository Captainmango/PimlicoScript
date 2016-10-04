package windows;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class PimscriptMain extends JFrame {
	
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

}
