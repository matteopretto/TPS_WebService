package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class view {

	private JFrame frame;
	private JPanel Modifica;
	private JPanel Home;
	private JPanel Prenotazione;
	private JPanel Cancella;
	private JPanel I_miei_viaggi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view window = new view();
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
	public view() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
