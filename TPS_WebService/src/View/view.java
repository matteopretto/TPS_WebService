package View;

import java.awt.CardLayout;
import Controller.Controller;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private JTextField textField_Title;
	private JButton btnletsread;
	private JComboBox comboBoxNews;
	private JButton btnNotizia1;
	private JButton btnHomeAnteprima;
	private JButton btnsearch;
	private JButton btnHomenotizia;
	private JTextField txtLingua;
	private JComboBox comboBoxLingua;
	private JTextField textAutore;
	private JTextField textField_Data;
	private JTextArea textArea_Descrizione;
	private JTextField textField_Fonte;
	private JLabel lblImg;
	private JLabel lblNot1;
	private JLabel lblNot2;
	private JLabel lblNot3;
	private JLabel lblNot4;
	private JLabel lblNot5;
	private JLabel lblNot6;
	private JButton btnNotizia2;
	private JButton btnNotizia3;
	private JButton btnNotizia4;
	private JButton btnNotizia5;
	private JButton btnNotizia6;
	private JButton btnPrecedente;
	private JButton btnSuccessivo;
	private JTextField textField_NumPagina;
	
	public void registraController(Controller controller) {
		btnletsread.addActionListener(controller);
		btnNotizia2.addActionListener(controller);
		comboBoxNews.addActionListener(controller);
		btnNotizia1.addActionListener(controller);
		btnNotizia2.addActionListener(controller);
		btnNotizia3.addActionListener(controller);
		btnHomeAnteprima.addActionListener(controller);
		btnsearch.addActionListener(controller);
		btnHomenotizia.addActionListener(controller);
		comboBoxLingua.addActionListener(controller);
		btnNotizia4.addActionListener(controller);
		btnNotizia5.addActionListener(controller);
		btnNotizia6.addActionListener(controller);
		btnPrecedente.addActionListener(controller);
		btnSuccessivo.addActionListener(controller);
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
		comboBoxNews.addItem("pertinenza");
		comboBoxNews.addItem("popolarita");
		
		Anteprima.add(comboBoxNews);
		
		textField_1 = new JTextField();
		textField_1.setBounds(176, 93, 1, 507);
		Anteprima.add(textField_1);
		textField_1.setColumns(10);
		
		txtCat = new JTextField();
		txtCat.setText("ORDINA PER");
		txtCat.setHorizontalAlignment(SwingConstants.CENTER);
		txtCat.setBounds(40, 159, 96, 19);
		Anteprima.add(txtCat);
		txtCat.setColumns(10);
		
		btnNotizia1 = new JButton("GO");
		btnNotizia1.setBounds(533, 132, 50, 33);
		Anteprima.add(btnNotizia1);
		
		 btnHomeAnteprima = new JButton("HOME");
		btnHomeAnteprima.setBounds(329, 579, 85, 21);
		Anteprima.add(btnHomeAnteprima);
		
		textField_search = new JTextField();
		textField_search.setBounds(191, 79, 275, 27);
		Anteprima.add(textField_search);
		textField_search.setColumns(10);
		
		 btnsearch = new JButton("->");
		btnsearch.setBounds(476, 82, 45, 21);
		Anteprima.add(btnsearch);
		
		 comboBoxLingua = new JComboBox();
		comboBoxLingua.setBounds(40, 275, 101, 21);
		comboBoxLingua.addItem("tedesco");
		comboBoxLingua.addItem("inglese");
		comboBoxLingua.addItem("italiano");
		comboBoxLingua.addItem("spagnolo");
		comboBoxLingua.addItem("francese");
		comboBoxLingua.addItem("portoghese");
		Anteprima.add(comboBoxLingua);
		
		txtLingua = new JTextField();
		txtLingua.setHorizontalAlignment(SwingConstants.CENTER);
		txtLingua.setText("LINGUA");
		txtLingua.setBounds(40, 246, 96, 19);
		Anteprima.add(txtLingua);
		txtLingua.setColumns(10);
		
		lblNot1 = new JLabel("");
		lblNot1.setBounds(194, 129, 304, 40);
		Anteprima.add(lblNot1);
		
		lblNot2 = new JLabel("");
		lblNot2.setBounds(194, 192, 304, 40);
		Anteprima.add(lblNot2);
		
		lblNot3 = new JLabel("");
		lblNot3.setBounds(194, 256, 304, 40);
		Anteprima.add(lblNot3);
		
		lblNot4 = new JLabel("");
		lblNot4.setBounds(194, 326, 304, 40);
		Anteprima.add(lblNot4);
		
		lblNot5 = new JLabel("");
		lblNot5.setBounds(194, 386, 304, 40);
		Anteprima.add(lblNot5);
		
		lblNot6 = new JLabel("");
		lblNot6.setBounds(194, 450, 304, 40);
		Anteprima.add(lblNot6);
		
		btnNotizia2 = new JButton("GO");
		btnNotizia2.setBounds(533, 196, 50, 33);
		Anteprima.add(btnNotizia2);
		
		btnNotizia3 = new JButton("GO");
		btnNotizia3.setBounds(533, 260, 50, 33);
		Anteprima.add(btnNotizia3);
		
		btnNotizia4 = new JButton("GO");
		btnNotizia4.setBounds(533, 326, 50, 33);
		Anteprima.add(btnNotizia4);
		
		btnNotizia5 = new JButton("GO");
		btnNotizia5.setBounds(533, 393, 50, 33);
		Anteprima.add(btnNotizia5);
		
		btnNotizia6 = new JButton("GO");
		btnNotizia6.setBounds(533, 460, 50, 33);
		Anteprima.add(btnNotizia6);
		
		btnPrecedente = new JButton("PREVIEW");
		btnPrecedente.setBounds(262, 536, 85, 33);
		Anteprima.add(btnPrecedente);
		
		btnSuccessivo = new JButton("NEXT");
		btnSuccessivo.setBounds(397, 536, 85, 33);
		Anteprima.add(btnSuccessivo);
		
		textField_NumPagina = new JTextField();
		textField_NumPagina.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_NumPagina.setHorizontalAlignment(SwingConstants.CENTER);
		textField_NumPagina.setText("1");
		textField_NumPagina.setEditable(false);
		textField_NumPagina.setBounds(342, 536, 56, 33);
		Anteprima.add(textField_NumPagina);
		textField_NumPagina.setColumns(10);
		
		Notizia = new JPanel();
		Notizia.setLayout(null);
		Notizia.setBackground(Color.WHITE);
		frame.getContentPane().add(Notizia, "name_2008359398100");
		
		textField_Title = new JTextField();
		textField_Title.setEditable(false);
		textField_Title.setFont(new Font("Caladea", Font.BOLD, 19));
		textField_Title.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Title.setBounds(156, 24, 290, 47);
		Notizia.add(textField_Title);
		textField_Title.setColumns(10);
		
		 btnHomenotizia = new JButton("HOME");
		btnHomenotizia.setBounds(246, 571, 99, 29);
		Notizia.add(btnHomenotizia);
		
		textAutore = new JTextField();
		textAutore.setEditable(false);
		textAutore.setBounds(22, 482, 196, 29);
		Notizia.add(textAutore);
		textAutore.setColumns(10);
		
		textField_Data = new JTextField();
		textField_Data.setEditable(false);
		textField_Data.setBounds(21, 521, 197, 29);
		Notizia.add(textField_Data);
		textField_Data.setColumns(10);
		
		textArea_Descrizione = new JTextArea();
		textArea_Descrizione.setEditable(false);
		textArea_Descrizione.setBounds(237, 91, 331, 459);
		Notizia.add(textArea_Descrizione);
		
		textField_Fonte = new JTextField();
		textField_Fonte.setEditable(false);
		textField_Fonte.setBounds(37, 94, 158, 29);
		Notizia.add(textField_Fonte);
		textField_Fonte.setColumns(10);
		
		lblImg = new JLabel("");
		lblImg.setBounds(37, 162, 181, 257);
		Notizia.add(lblImg);
		
		
	}

	public void cambiaPanel(JPanel uno, JPanel due) {
		uno.setVisible(false);
		due.setVisible(true);
	}
	
	public JTextField getTxtNewYorkTimes() {
		return txtNewYorkTimes;
	}

	public JTextField getTextField_Title() {
		return textField_Title;
	}

	public void setTextField_Title(JTextField textField_Title) {
		this.textField_Title = textField_Title;
	}

	public void setTxtNewYorkTimes(JTextField txtNewYorkTimes) {
		this.txtNewYorkTimes = txtNewYorkTimes;
	}

	public JComboBox getComboBoxLingua() {
		return comboBoxLingua;
	}

	public void setComboBoxLingua(JComboBox comboBoxLingua) {
		this.comboBoxLingua = comboBoxLingua;
	}

	public JTextField getTxtNewYorkTimes_1() {
		return textField_Title;
	}

	public JTextField getTxtLingua() {
		return txtLingua;
	}

	public JLabel getLblImg() {
		return lblImg;
	}

	public JLabel getLblNot1() {
		return lblNot1;
	}

	public void setLblNot1(JLabel lblNot1) {
		this.lblNot1 = lblNot1;
	}

	public JLabel getLblNot2() {
		return lblNot2;
	}

	public void setLblNot2(JLabel lblNot2) {
		this.lblNot2 = lblNot2;
	}

	public JLabel getLblNot3() {
		return lblNot3;
	}

	public void setLblNot3(JLabel lblNot3) {
		this.lblNot3 = lblNot3;
	}

	public JLabel getLblNot4() {
		return lblNot4;
	}

	public void setLblNot4(JLabel lblNot4) {
		this.lblNot4 = lblNot4;
	}

	public JLabel getLblNot5() {
		return lblNot5;
	}

	public void setLblNot5(JLabel lblNot5) {
		this.lblNot5 = lblNot5;
	}

	public JLabel getLblNot6() {
		return lblNot6;
	}

	public void setLblNot6(JLabel lblNot6) {
		this.lblNot6 = lblNot6;
	}

	public JButton getBtnNotizia4() {
		return btnNotizia4;
	}

	public void setBtnNotizia4(JButton btnNotizia4) {
		this.btnNotizia4 = btnNotizia4;
	}

	public JButton getBtnNotizia5() {
		return btnNotizia5;
	}

	public void setBtnNotizia5(JButton btnNotizia5) {
		this.btnNotizia5 = btnNotizia5;
	}

	public JButton getBtnNotizia6() {
		return btnNotizia6;
	}

	public void setBtnNotizia6(JButton btnNotizia6) {
		this.btnNotizia6 = btnNotizia6;
	}

	public JButton getBtnPrecedente() {
		return btnPrecedente;
	}

	public void setBtnPrecedente(JButton btnPrecedente) {
		this.btnPrecedente = btnPrecedente;
	}

	public JButton getBtnSuccessivo() {
		return btnSuccessivo;
	}

	public void setBtnSuccessivo(JButton btnSuccessivo) {
		this.btnSuccessivo = btnSuccessivo;
	}

	public JTextField getTextField_NumPagina() {
		return textField_NumPagina;
	}

	public void setTextField_NumPagina(JTextField textField_NumPagina) {
		this.textField_NumPagina = textField_NumPagina;
	}

	public void setLblImg(JLabel lblImg) {
		this.lblImg = lblImg;
	}

	public void setTxtLingua(JTextField txtLingua) {
		this.txtLingua = txtLingua;
	}

	public JTextField getTextAutore() {
		return textAutore;
	}

	public void setTextAutore(JTextField textAutore) {
		this.textAutore = textAutore;
	}

	public JTextField getTextField_Data() {
		return textField_Data;
	}

	public void setTextField_Data(JTextField textField_Data) {
		this.textField_Data = textField_Data;
	}

	public JTextArea getTextArea_Descrizione() {
		return textArea_Descrizione;
	}

	public void setTextArea_Descrizione(JTextArea textArea_Descrizione) {
		this.textArea_Descrizione = textArea_Descrizione;
	}

	public JTextField getTextField_Fonte() {
		return textField_Fonte;
	}

	public void setTextField_Fonte(JTextField textField_Fonte) {
		this.textField_Fonte = textField_Fonte;
	}



	public void setTxtNewYorkTimes_1(JTextField txtNewYorkTimes_1) {
		this.textField_Title = txtNewYorkTimes_1;
	}

	public JPanel getAnteprima() {
		return Anteprima;
	}

	public void setAnteprima(JPanel anteprima) {
		Anteprima = anteprima;
	}

	public JPanel getNotizia() {
		return Notizia;
	}

	public void setNotizia(JPanel notizia) {
		Notizia = notizia;
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



	public JButton getBtnNotizia1() {
		return btnNotizia1;
	}

	public void setBtnNotizia1(JButton btnNotizia1) {
		this.btnNotizia1 = btnNotizia1;
	}



	public JButton getBtnNotizia2() {
		return btnNotizia2;
	}

	public void setBtnNotizia2(JButton btnNotizia2) {
		this.btnNotizia2 = btnNotizia2;
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


}
