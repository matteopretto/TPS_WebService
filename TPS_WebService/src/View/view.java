package View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextPane;

public class view {

	private JFrame frame;
	private JPanel Home;
	private JPanel Prenotazione;
	private JPanel Cancella;
	private JTextField txtNewYorkTimes;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtCat;
	private JTextField txtCat_1;
	private JTextField txtCat_2;
	private JTextField txtCat_3;
	private JTextField txtCat_4;
	private JTextField txtCat_5;

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
		frame.setBounds(100, 200, 607, 677);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));;
		
		Home = new JPanel();
		Home.setBackground(Color.WHITE);
		frame.getContentPane().add(Home, "name_2008321513000");
		Home.setLayout(null);
		
		txtNewYorkTimes = new JTextField();
		txtNewYorkTimes.setBackground(new Color(255, 255, 255));
		txtNewYorkTimes.setForeground(Color.BLACK);
		txtNewYorkTimes.setEditable(false);
		txtNewYorkTimes.setFont(new Font("Caladea", Font.BOLD, 19));
		txtNewYorkTimes.setHorizontalAlignment(SwingConstants.CENTER);
		txtNewYorkTimes.setText("NEW YORK TIMES");
		txtNewYorkTimes.setBounds(146, 20, 244, 47);
		Home.add(txtNewYorkTimes);
		txtNewYorkTimes.setColumns(10);
		
		JTextArea txtrWelcomeToThe = new JTextArea();
		txtrWelcomeToThe.setFont(new Font("Source Serif Pro", Font.BOLD | Font.ITALIC, 16));
		txtrWelcomeToThe.setEditable(false);
		txtrWelcomeToThe.setRows(2);
		txtrWelcomeToThe.setText("                        Welcome to the best\r\n                         online newspaper!");
		txtrWelcomeToThe.setBounds(119, 65, 283, 52);
		Home.add(txtrWelcomeToThe);
		
		JButton letsread = new JButton("LET'S READ");
		letsread.setBackground(new Color(50, 205, 50));
		letsread.setForeground(new Color(0, 0, 0));
		letsread.setBounds(230, 341, 112, 27);
		Home.add(letsread);
		
		JTextArea txtrClickingOnThe = new JTextArea();
		txtrClickingOnThe.setBackground(new Color(220, 220, 220));
		txtrClickingOnThe.setFont(new Font("Source Code Pro ExtraLight", Font.BOLD, 13));
		txtrClickingOnThe.setText("Clicking on the button 'LET'S READ' \r\nyou give consent us to process \r\nyour data in order to improve our\r\nservice.");
		txtrClickingOnThe.setEditable(false);
		txtrClickingOnThe.setBounds(146, 464, 304, 96);
		Home.add(txtrClickingOnThe);
		
		JTextArea txtrHereYouCan = new JTextArea();
		txtrHereYouCan.setFont(new Font("Source Serif Pro Semibold", Font.ITALIC, 14));
		txtrHereYouCan.setText("Here you can read news about:\r\n-SPORT\r\n-POLITICS\r\n-ENVIROMENTS\r\n-GOSSIP");
		txtrHereYouCan.setBounds(156, 172, 273, 101);
		Home.add(txtrHereYouCan);
		
		Prenotazione = new JPanel();
		Prenotazione.setLayout(null);
		Prenotazione.setBackground(Color.WHITE);
		frame.getContentPane().add(Prenotazione, "name_2008333190200");
		
		textField = new JTextField();
		textField.setText("NEW YORK TIMES");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Caladea", Font.BOLD, 19));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(211, 10, 244, 47);
		Prenotazione.add(textField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(20, 141, 134, 21);
		Prenotazione.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(20, 219, 134, 21);
		Prenotazione.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(20, 295, 134, 21);
		Prenotazione.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(20, 368, 134, 21);
		Prenotazione.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(20, 445, 134, 21);
		Prenotazione.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(20, 528, 134, 21);
		Prenotazione.add(comboBox_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(176, 93, 1, 507);
		Prenotazione.add(textField_1);
		textField_1.setColumns(10);
		
		txtCat = new JTextField();
		txtCat.setText("cat 1");
		txtCat.setHorizontalAlignment(SwingConstants.CENTER);
		txtCat.setBounds(37, 112, 96, 19);
		Prenotazione.add(txtCat);
		txtCat.setColumns(10);
		
		txtCat_1 = new JTextField();
		txtCat_1.setText("cat 2");
		txtCat_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtCat_1.setColumns(10);
		txtCat_1.setBounds(37, 187, 96, 19);
		Prenotazione.add(txtCat_1);
		
		txtCat_2 = new JTextField();
		txtCat_2.setText("cat 3");
		txtCat_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtCat_2.setColumns(10);
		txtCat_2.setBounds(37, 266, 96, 19);
		Prenotazione.add(txtCat_2);
		
		txtCat_3 = new JTextField();
		txtCat_3.setText("cat 4");
		txtCat_3.setHorizontalAlignment(SwingConstants.CENTER);
		txtCat_3.setColumns(10);
		txtCat_3.setBounds(37, 337, 96, 19);
		Prenotazione.add(txtCat_3);
		
		txtCat_4 = new JTextField();
		txtCat_4.setText("cat 5");
		txtCat_4.setHorizontalAlignment(SwingConstants.CENTER);
		txtCat_4.setColumns(10);
		txtCat_4.setBounds(37, 416, 96, 19);
		Prenotazione.add(txtCat_4);
		
		txtCat_5 = new JTextField();
		txtCat_5.setText("cat 6");
		txtCat_5.setHorizontalAlignment(SwingConstants.CENTER);
		txtCat_5.setColumns(10);
		txtCat_5.setBounds(37, 500, 96, 19);
		Prenotazione.add(txtCat_5);
		
		JTextArea textNotizia1 = new JTextArea();
		textNotizia1.setBounds(221, 109, 300, 97);
		Prenotazione.add(textNotizia1);
		
		JButton btnNotizia1 = new JButton("READ MORE");
		btnNotizia1.setBounds(315, 219, 116, 21);
		Prenotazione.add(btnNotizia1);
		
		JTextPane textNotizia2 = new JTextPane();
		textNotizia2.setBounds(211, 266, 332, 108);
		Prenotazione.add(textNotizia2);
		
		JButton btnNotizia2 = new JButton("READ MORE");
		btnNotizia2.setBounds(315, 388, 116, 21);
		Prenotazione.add(btnNotizia2);
		
		JTextArea textNotizia3 = new JTextArea();
		textNotizia3.setBounds(211, 429, 340, 108);
		Prenotazione.add(textNotizia3);
		
		JButton btnNotizia3 = new JButton("READ MORE");
		btnNotizia3.setBounds(315, 547, 116, 21);
		Prenotazione.add(btnNotizia3);
		
		JButton btnHomeAnteprima = new JButton("HOME");
		btnHomeAnteprima.setBounds(481, 593, 85, 21);
		Prenotazione.add(btnHomeAnteprima);
		
		Cancella = new JPanel();
		Cancella.setLayout(null);
		Cancella.setBackground(Color.WHITE);
		frame.getContentPane().add(Cancella, "name_2008359398100");
		
		
	}
}
