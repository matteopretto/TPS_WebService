package View;

import java.awt.CardLayout;
import Controller.controller;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Controller.controller;

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
	private JPanel Anteprima;
	private JPanel Notizia;
	private JTextField txtNewYorkTimes;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtCat;
	private JTextField textField_search;
	private JTextField txtNewYorkTimes_1;
	private JButton btnletsread;
	private JComboBox comboBoxNews;
	private JTextArea textNotizia1;
	private JButton btnNotizia1;
	private JTextPane textNotizia2;
	private JButton btnNotizia2;
	private JTextArea textNotizia3;
	private JButton btnNotizia3;
	private JButton btnHomeAnteprima;
	private JButton btnsearch;
	private JButton btnHomenotizia;
	private JTextArea textAreanotizia;
	
	public void registraController(controller controller) {
		txtNewYorkTimes.addActionListener(controller);

	}
	
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
		
		 btnletsread = new JButton("LET'S READ");
		btnletsread.setBackground(new Color(50, 205, 50));
		btnletsread.setForeground(new Color(0, 0, 0));
		btnletsread.setBounds(230, 341, 112, 27);
		Home.add(btnletsread);
		
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
		
		Anteprima = new JPanel();
		Anteprima.setLayout(null);
		Anteprima.setBackground(Color.WHITE);
		frame.getContentPane().add(Anteprima, "name_2008333190200");
		
		textField = new JTextField();
		textField.setText("NEW YORK TIMES");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Caladea", Font.BOLD, 19));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(211, 10, 244, 47);
		Anteprima.add(textField);
		
		 comboBoxNews = new JComboBox();
		comboBoxNews.setBounds(21, 188, 134, 21);
		Anteprima.add(comboBoxNews);
		
		textField_1 = new JTextField();
		textField_1.setBounds(176, 93, 1, 507);
		Anteprima.add(textField_1);
		textField_1.setColumns(10);
		
		txtCat = new JTextField();
		txtCat.setText("cat 1");
		txtCat.setHorizontalAlignment(SwingConstants.CENTER);
		txtCat.setBounds(42, 151, 96, 19);
		Anteprima.add(txtCat);
		txtCat.setColumns(10);
		
		 textNotizia1 = new JTextArea();
		textNotizia1.setBounds(221, 136, 300, 97);
		Anteprima.add(textNotizia1);
		
		btnNotizia1 = new JButton("READ MORE");
		btnNotizia1.setBounds(315, 238, 116, 21);
		Anteprima.add(btnNotizia1);
		
		 textNotizia2 = new JTextPane();
		textNotizia2.setBounds(211, 283, 332, 108);
		Anteprima.add(textNotizia2);
		
		 btnNotizia2 = new JButton("READ MORE");
		btnNotizia2.setBounds(315, 401, 116, 21);
		Anteprima.add(btnNotizia2);
		
		 textNotizia3 = new JTextArea();
		textNotizia3.setBounds(203, 443, 340, 108);
		Anteprima.add(textNotizia3);
		
		 btnNotizia3 = new JButton("READ MORE");
		btnNotizia3.setBounds(315, 556, 116, 21);
		Anteprima.add(btnNotizia3);
		
		 btnHomeAnteprima = new JButton("HOME");
		btnHomeAnteprima.setBounds(481, 593, 85, 21);
		Anteprima.add(btnHomeAnteprima);
		
		textField_search = new JTextField();
		textField_search.setBounds(191, 79, 275, 27);
		Anteprima.add(textField_search);
		textField_search.setColumns(10);
		
		 btnsearch = new JButton("->");
		btnsearch.setBounds(476, 82, 45, 21);
		Anteprima.add(btnsearch);
		
		Notizia = new JPanel();
		Notizia.setLayout(null);
		Notizia.setBackground(Color.WHITE);
		frame.getContentPane().add(Notizia, "name_2008359398100");
		
		txtNewYorkTimes_1 = new JTextField();
		txtNewYorkTimes_1.setFont(new Font("Caladea", Font.BOLD, 19));
		txtNewYorkTimes_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtNewYorkTimes_1.setText("NEW YORK TIMES");
		txtNewYorkTimes_1.setBounds(156, 24, 290, 47);
		Notizia.add(txtNewYorkTimes_1);
		txtNewYorkTimes_1.setColumns(10);
		
		 btnHomenotizia = new JButton("HOME");
		btnHomenotizia.setBounds(246, 571, 99, 29);
		Notizia.add(btnHomenotizia);
		
		 textAreanotizia = new JTextArea();
		textAreanotizia.setBounds(96, 108, 433, 446);
		Notizia.add(textAreanotizia);
		
		
	}

	public void cambiaPanel(JPanel uno, JPanel due) {
		uno.setVisible(false);
		due.setVisible(true);
	}
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JPanel getHome() {
		return Home;
	}

	public void setHome(JPanel home) {
		Home = home;
	}

	public JPanel getPrenotazione() {
		return Anteprima;
	}

	public void setPrenotazione(JPanel prenotazione) {
		Anteprima = prenotazione;
	}

	public JPanel getCancella() {
		return Notizia;
	}

	public void setCancella(JPanel cancella) {
		Notizia = cancella;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTxtCat() {
		return txtCat;
	}

	public void setTxtCat(JTextField txtCat) {
		this.txtCat = txtCat;
	}

	public JTextField getTextField_search() {
		return textField_search;
	}

	public void setTextField_search(JTextField textField_search) {
		this.textField_search = textField_search;
	}

	public JButton getBtnletsread() {
		return btnletsread;
	}

	public void setBtnletsread(JButton btnletsread) {
		this.btnletsread = btnletsread;
	}

	public JComboBox getComboBoxNews() {
		return comboBoxNews;
	}

	public void setComboBoxNews(JComboBox comboBoxNews) {
		this.comboBoxNews = comboBoxNews;
	}

	public JTextArea getTextNotizia1() {
		return textNotizia1;
	}

	public void setTextNotizia1(JTextArea textNotizia1) {
		this.textNotizia1 = textNotizia1;
	}

	public JButton getBtnNotizia1() {
		return btnNotizia1;
	}

	public void setBtnNotizia1(JButton btnNotizia1) {
		this.btnNotizia1 = btnNotizia1;
	}

	public JTextPane getTextNotizia2() {
		return textNotizia2;
	}

	public void setTextNotizia2(JTextPane textNotizia2) {
		this.textNotizia2 = textNotizia2;
	}

	public JButton getBtnNotizia2() {
		return btnNotizia2;
	}

	public void setBtnNotizia2(JButton btnNotizia2) {
		this.btnNotizia2 = btnNotizia2;
	}

	public JTextArea getTextNotizia3() {
		return textNotizia3;
	}

	public void setTextNotizia3(JTextArea textNotizia3) {
		this.textNotizia3 = textNotizia3;
	}

	public JButton getBtnNotizia3() {
		return btnNotizia3;
	}

	public void setBtnNotizia3(JButton btnNotizia3) {
		this.btnNotizia3 = btnNotizia3;
	}

	public JButton getBtnHomeAnteprima() {
		return btnHomeAnteprima;
	}

	public void setBtnHomeAnteprima(JButton btnHomeAnteprima) {
		this.btnHomeAnteprima = btnHomeAnteprima;
	}

	public JButton getBtnsearch() {
		return btnsearch;
	}

	public void setBtnsearch(JButton btnsearch) {
		this.btnsearch = btnsearch;
	}

	public JButton getBtnHomenotizia() {
		return btnHomenotizia;
	}

	public void setBtnHomenotizia(JButton btnHomenotizia) {
		this.btnHomenotizia = btnHomenotizia;
	}

	public JTextArea getTextAreanotizia() {
		return textAreanotizia;
	}

	public void setTextAreanotizia(JTextArea textAreanotizia) {
		this.textAreanotizia = textAreanotizia;
	}
	
}
