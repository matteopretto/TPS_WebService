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
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;

public class view {

	public JFrame frame;
	private JPanel Home;
	private JPanel Anteprima;
	private JPanel Notizia;
	private JTextField txtNewYorkTimes;
	private JTextField textField;
	private JTextField textField_search;
	private JButton btnletsread;
	private JComboBox comboBoxNews;
	private JButton btnNotizia1;
	private JButton btnHomeAnteprima;
	private JButton btnsearch;
	private JButton btnHomenotizia;
	private JComboBox comboBoxLingua;
	private JTextField textAutore;
	private JTextField textField_Data;
	private JTextArea txtrOracleStellt;
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
	private JLabel lblNewLabel;
	private JLabel lblOrderBy;
	private JLabel lblOrarioHome;
	private JLabel lblOrarioAnteprima;
	private JLabel lblOrarioNotizie;
	private JButton btnGoBack;
	private JTextArea textURL;
	private JTextArea textField_Title;
	
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
		btnGoBack.addActionListener(controller);
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
		Home.setBackground(new Color(255, 255, 255));
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
		txtrWelcomeToThe.setFont(new Font("Source Serif Pro", Font.BOLD | Font.ITALIC, 17));
		txtrWelcomeToThe.setEditable(false);
		txtrWelcomeToThe.setRows(2);
		txtrWelcomeToThe.setText("                 Welcome to the best\r\n                    online newspaper!");
		txtrWelcomeToThe.setBounds(119, 65, 283, 61);
		Home.add(txtrWelcomeToThe);
		
		 btnletsread = new JButton("LET'S READ");
		btnletsread.setBackground(new Color(50, 205, 50));
		btnletsread.setForeground(new Color(0, 0, 0));
		btnletsread.setBounds(227, 359, 112, 27);
		Home.add(btnletsread);
		
		JTextArea txtrClickingOnThe = new JTextArea();
		txtrClickingOnThe.setWrapStyleWord(true);
		txtrClickingOnThe.setBackground(new Color(220, 220, 220));
		txtrClickingOnThe.setFont(new Font("Source Code Pro ExtraLight", Font.BOLD | Font.ITALIC, 15));
		txtrClickingOnThe.setText("Clicking on the button 'LET'S READ' \r\nyou give consent us to process \r\nyour data in order to improve our\r\nservice.");
		txtrClickingOnThe.setEditable(false);
		txtrClickingOnThe.setBounds(119, 464, 343, 148);
		Home.add(txtrClickingOnThe);
		
		JTextArea txtrHereYouCan = new JTextArea();
		txtrHereYouCan.setEditable(false);
		txtrHereYouCan.setFont(new Font("Source Serif Pro Semibold", Font.ITALIC, 15));
		txtrHereYouCan.setText("Here you can read news about:\r\n-SPORT\r\n-POLITICS\r\n-ENVIROMENTS\r\n-GOSSIP");
		txtrHereYouCan.setBounds(156, 172, 273, 128);
		Home.add(txtrHereYouCan);
		
		lblOrarioHome = new JLabel("");
		lblOrarioHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrarioHome.setFont(new Font("Source Sans Pro Light", Font.BOLD, 13));
		lblOrarioHome.setBounds(459, 25, 93, 27);
		Home.add(lblOrarioHome);
		
		Anteprima = new JPanel();
		Anteprima.setLayout(null);
		Anteprima.setBackground(new Color(255, 255, 255));
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
		 comboBoxNews.setBackground(new Color(204, 204, 204));
		comboBoxNews.setBounds(10, 36, 134, 21);
		comboBoxNews.addItem("pertinenza");
		comboBoxNews.addItem("popolarita");
		
		Anteprima.add(comboBoxNews);
		
		btnNotizia1 = new JButton("GO");
		btnNotizia1.setBackground(new Color(153, 255, 102));
		btnNotizia1.setBounds(527, 132, 56, 33);
		Anteprima.add(btnNotizia1);
		btnNotizia1.setVisible(false);
		
		 btnHomeAnteprima = new JButton("HOME");
		 btnHomeAnteprima.setFont(new Font("Tahoma", Font.BOLD, 10));
		 btnHomeAnteprima.setBackground(new Color(0, 102, 255));
		btnHomeAnteprima.setBounds(230, 579, 85, 21);
		Anteprima.add(btnHomeAnteprima);
		
		textField_search = new JTextField();
		textField_search.setBackground(new Color(204, 204, 204));
		textField_search.setBounds(191, 79, 275, 27);
		Anteprima.add(textField_search);
		textField_search.setColumns(10);
		
		 btnsearch = new JButton("->");
		 btnsearch.setBackground(Color.GREEN);
		btnsearch.setBounds(476, 82, 45, 21);
		Anteprima.add(btnsearch);
		
		 comboBoxLingua = new JComboBox();
		 comboBoxLingua.setBackground(new Color(204, 204, 204));
		comboBoxLingua.setBounds(10, 82, 101, 21);
		comboBoxLingua.addItem("tedesco");
		comboBoxLingua.addItem("inglese");
		comboBoxLingua.addItem("italiano");
		comboBoxLingua.addItem("spagnolo");
		comboBoxLingua.addItem("francese");
		comboBoxLingua.addItem("portoghese");
		Anteprima.add(comboBoxLingua);
		
		lblNot1 = new JLabel("");
		lblNot1.setBounds(58, 132, 391, 40);
		Anteprima.add(lblNot1);
		
		lblNot2 = new JLabel("");
		lblNot2.setBounds(58, 189, 397, 40);
		Anteprima.add(lblNot2);
		
		lblNot3 = new JLabel("");
		lblNot3.setBounds(58, 256, 397, 40);
		Anteprima.add(lblNot3);
		
		lblNot4 = new JLabel("");
		lblNot4.setBounds(58, 326, 391, 40);
		Anteprima.add(lblNot4);
		
		lblNot5 = new JLabel("");
		lblNot5.setBounds(58, 386, 397, 40);
		Anteprima.add(lblNot5);
		
		lblNot6 = new JLabel("");
		lblNot6.setBounds(58, 450, 391, 40);
		Anteprima.add(lblNot6);
		
		btnNotizia2 = new JButton("GO");
		btnNotizia2.setBackground(new Color(153, 255, 102));
		btnNotizia2.setBounds(527, 196, 56, 33);
		Anteprima.add(btnNotizia2);
		
		btnNotizia3 = new JButton("GO");
		btnNotizia3.setBackground(new Color(153, 255, 102));
		btnNotizia3.setBounds(527, 260, 56, 33);
		Anteprima.add(btnNotizia3);
		
		btnNotizia4 = new JButton("GO");
		btnNotizia4.setBackground(new Color(153, 255, 102));
		btnNotizia4.setBounds(527, 326, 56, 33);
		Anteprima.add(btnNotizia4);
		
		btnNotizia5 = new JButton("GO");
		btnNotizia5.setBackground(new Color(153, 255, 102));
		btnNotizia5.setBounds(527, 393, 56, 33);
		Anteprima.add(btnNotizia5);
		
		btnNotizia6 = new JButton("GO");
		btnNotizia6.setBackground(new Color(153, 255, 102));
		btnNotizia6.setBounds(527, 460, 56, 33);
		Anteprima.add(btnNotizia6);
		
		btnNotizia2.setVisible(false);
		btnNotizia3.setVisible(false);
		btnNotizia4.setVisible(false);
		btnNotizia5.setVisible(false);
		btnNotizia6.setVisible(false);
		
		btnPrecedente = new JButton("PREVIEW");
		btnPrecedente.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPrecedente.setBackground(new Color(0, 102, 255));
		btnPrecedente.setForeground(new Color(0, 0, 0));
		btnPrecedente.setBounds(163, 536, 85, 33);
		Anteprima.add(btnPrecedente);
		
		btnSuccessivo = new JButton("NEXT");
		btnSuccessivo.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSuccessivo.setBackground(new Color(0, 102, 255));
		btnSuccessivo.setBounds(296, 536, 85, 33);
		Anteprima.add(btnSuccessivo);
		
		textField_NumPagina = new JTextField();
		textField_NumPagina.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_NumPagina.setHorizontalAlignment(SwingConstants.CENTER);
		textField_NumPagina.setText("1");
		textField_NumPagina.setEditable(false);
		textField_NumPagina.setBounds(247, 536, 56, 33);
		Anteprima.add(textField_NumPagina);
		textField_NumPagina.setColumns(10);
		
		lblNewLabel = new JLabel("LANGUAGE");
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.ITALIC, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(-11, 58, 98, 33);
		Anteprima.add(lblNewLabel);
		
		lblOrderBy = new JLabel("ORDER BY");
		lblOrderBy.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrderBy.setFont(new Font("Source Serif Pro Semibold", Font.ITALIC, 12));
		lblOrderBy.setBounds(-11, 10, 98, 33);
		Anteprima.add(lblOrderBy);
		
		lblOrarioAnteprima = new JLabel("");
		lblOrarioAnteprima.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrarioAnteprima.setFont(new Font("Source Serif Pro", Font.BOLD, 13));
		lblOrarioAnteprima.setBounds(476, 10, 93, 27);
		Anteprima.add(lblOrarioAnteprima);
		
		Notizia = new JPanel();
		Notizia.setLayout(null);
		Notizia.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(Notizia, "name_2008359398100");
		
		 btnHomenotizia = new JButton("HOME");
		 btnHomenotizia.setBackground(new Color(51, 102, 255));
		btnHomenotizia.setBounds(246, 571, 99, 29);
		Notizia.add(btnHomenotizia);
		
		textAutore = new JTextField();
		textAutore.setEditable(false);
		textAutore.setBounds(22, 482, 196, 29);
		Notizia.add(textAutore);
		textAutore.setColumns(10);
		
		textField_Data = new JTextField();
		textField_Data.setEditable(false);
		textField_Data.setBounds(371, 601, 197, 29);
		Notizia.add(textField_Data);
		textField_Data.setColumns(10);
		
		txtrOracleStellt = new JTextArea();
		txtrOracleStellt.setWrapStyleWord(true);
		txtrOracleStellt.setLineWrap(true);
		txtrOracleStellt.setEditable(false);
		txtrOracleStellt.setBounds(20, 91, 548, 157);
		Notizia.add(txtrOracleStellt);
		
		textField_Fonte = new JTextField();
		textField_Fonte.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Fonte.setEditable(false);
		textField_Fonte.setBounds(407, 482, 158, 29);
		Notizia.add(textField_Fonte);
		textField_Fonte.setColumns(10);
		
		lblImg = new JLabel("");
		lblImg.setHorizontalAlignment(SwingConstants.TRAILING);
		lblImg.setBounds(98, 207, 470, 230);
		Notizia.add(lblImg);
		
		lblOrarioNotizie = new JLabel("");
		lblOrarioNotizie.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrarioNotizie.setFont(new Font("Source Serif Pro", Font.BOLD, 13));
		lblOrarioNotizie.setBounds(471, 24, 93, 27);
		Notizia.add(lblOrarioNotizie);
		
		btnGoBack = new JButton("BACK");
		btnGoBack.setBackground(new Color(255, 99, 71));
		btnGoBack.setFont(new Font("Source Serif Pro Semibold", Font.BOLD, 12));
		btnGoBack.setBounds(10, 24, 99, 29);
		Notizia.add(btnGoBack);
		
		textURL = new JTextArea();
		textURL.setLineWrap(true);
		textURL.setEditable(false);
		textURL.setBounds(22, 526, 546, 36);
		Notizia.add(textURL);
		
		textField_Title = new JTextArea();
		textField_Title.setBackground(new Color(169, 169, 169));
		textField_Title.setFont(new Font("Source Sans Pro Semibold", Font.ITALIC, 18));
		textField_Title.setEditable(false);
		textField_Title.setLineWrap(true);
		textField_Title.setWrapStyleWord(true);
		textField_Title.setBounds(119, 10, 342, 71);
		Notizia.add(textField_Title);
		
		
	}
	
	public JButton getBtnGoBack() {
		return btnGoBack;
	}

	public void setBtnGoBack(JButton btnGoBack) {
		this.btnGoBack = btnGoBack;
	}
	



	public JTextArea getTextURL() {
		return textURL;
	}

	public void setTextURL(JTextArea textURL) {
		this.textURL = textURL;
	}

	public void cambiaOra() {
		Calendar rightnow = Calendar.getInstance();
		String hr = "" + rightnow.get(Calendar.HOUR_OF_DAY);
		String min = "" + rightnow.get(Calendar.MINUTE);
		int minuti= Integer.parseInt(min);
		if(minuti<10) {
			if(minuti==0)
				min="00";
			else 
				min="0"+min;
		}
		lblOrarioAnteprima.setText(""+hr+":"+min);
		lblOrarioHome.setText(""+hr+":"+min);
		lblOrarioNotizie.setText(""+hr+":"+min);
	}

	public void cambiaPanel(JPanel uno, JPanel due) {
		uno.setVisible(false);
		due.setVisible(true);
	}
	
	public JTextField getTxtNewYorkTimes() {
		return txtNewYorkTimes;
	}


	public JLabel getLblOrarioHome() {
		return lblOrarioHome;
	}

	public void setLblOrarioHome(JLabel lblOrarioHome) {
		this.lblOrarioHome = lblOrarioHome;
	}

	public JLabel getLblOrarioAnteprima() {
		return lblOrarioAnteprima;
	}

	public void setLblOrarioAnteprima(JLabel lblOrarioAnteprima) {
		this.lblOrarioAnteprima = lblOrarioAnteprima;
	}

	public JLabel getLblOrarioNotizie() {
		return lblOrarioNotizie;
	}

	public void setLblOrarioNotizie(JLabel lblOrarioNotizie) {
		this.lblOrarioNotizie = lblOrarioNotizie;
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




	public JTextArea getTextField_Title() {
		return textField_Title;
	}

	public void setTextField_Title(JTextArea textField_Title) {
		this.textField_Title = textField_Title;
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
		return txtrOracleStellt;
	}

	public void setTextArea_Descrizione(JTextArea textArea_Descrizione) {
		this.txtrOracleStellt = textArea_Descrizione;
	}

	public JTextField getTextField_Fonte() {
		return textField_Fonte;
	}

	public void setTextField_Fonte(JTextField textField_Fonte) {
		this.textField_Fonte = textField_Fonte;
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
